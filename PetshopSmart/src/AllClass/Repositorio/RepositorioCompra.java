package AllClass.Repositorio;

import AllClass.Compra;
import static BancoDeDados.BancoPetshop.BancoListCompra;

public class RepositorioCompra {

    public static int codigoCompra;
    public static boolean statusCompra = false;
    public static boolean pesquisaCompra = false;

    public static boolean setCompra(Compra cadCompra) {
        statusCompra = false;
        try {
            cadCompra.setCodigoCompra(codigoCompra);
            BancoListCompra.add(cadCompra);
            statusCompra = true;
            codigoCompra++;
            return true;
        } catch (Exception e) {
            statusCompra = false;
        }
        return statusCompra;
    }

    public static boolean setRemoverCompra(String cpf, int id_compra) {
        pesquisaCompra = false;
        try {
            for (Compra comp : BancoListCompra) {
                if (cpf.equals(comp.getCPFCompra()) && (id_compra == comp.getCodigoCompra())) {
                    if (RepositorioCliente.setDebitar(cpf, comp.getValorCompra())) {
                        int codCompra = comp.getCodigoProduto();
                        int quantCompra = comp.getQuantidadeC();
                        if (RepositorioEstoque.getCancelCompra(codCompra, quantCompra)) {
                            BancoListCompra.remove(comp);
                            pesquisaCompra = true;
                        }
                    }
                }
            }
        } catch (Exception e) {
        }
        return pesquisaCompra;
    }

    public static boolean getExisteClienteCompra(String cpf) {
        boolean result = false;
        Compra c = new Compra();
        for (int i = 0; i < BancoListCompra.size(); i++) {
            c = BancoListCompra.get(i);
            if (c.getCPFCompra().equals(cpf)) {
                result = true;
            }
        }
        return result;
        //Verifica se existe alguma compra do cliente (Caso deseje remover um cliente)
    }

    public static Compra getExisteCompra(String cpf, int idCompra) {
        Compra exibirCompra = null;

        for (int i = 0; i < BancoListCompra.size(); i++) {
            Compra c = BancoListCompra.get(i);
            if (c.getCPFCompra().equals(cpf) && c.getCodigoCompra() == idCompra) {
                exibirCompra = c;
            }
        }
        return exibirCompra;
        //Verifica se existe alguma compra do cliente (Caso deseje remover um cliente)
    }

    public static boolean setPagamentoCompra(String cpf, double valor){
        boolean testPagamento = false;
        if (RepositorioCliente.setDebitar(cpf, valor)){
            testPagamento = true;
        }else {
            testPagamento = false;
        }
        
        return testPagamento;
    }
    
    
}
