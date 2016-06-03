package AllClass.Repositorio;

import AllClass.Compra;
import static BancoDeDados.BancoPetshop.BancoListCompra;
import javax.swing.JOptionPane;

public class RepositorioCompra {

    public static int contCompra;
    public static boolean statusCompra = false;
    public static boolean pesquisaCompra = false;
    public static Compra exibirCompra;

    public static boolean setCompra(String NomeCompra, String ValorCompra, String codigoProduto, String DataCompra, String CPFcompra, String xquantidade) {
        statusCompra = false;
        try {
            int quantidade = Integer.parseInt(xquantidade);
            String c_codigoCompra;
            c_codigoCompra = Integer.toString(contCompra);
            Compra Compras = new Compra(NomeCompra, ValorCompra, codigoProduto, c_codigoCompra, DataCompra, CPFcompra, quantidade);
            BancoListCompra.add(Compras);
            statusCompra = true;
            JOptionPane.showMessageDialog(null, "Compra Realizada!!!");
            contCompra++;
            return true;
        } catch (Exception e) {
            statusCompra = false;
            JOptionPane.showMessageDialog(null, "Compra Não Realizada!!!");
            return false;
        }
    }

    public static boolean setListarCompras(String cpf) {
        pesquisaCompra = false;
        Compra compras;
        String relatoricompra = "";

        for (Compra comp : BancoListCompra) {
            if (cpf.equals(comp.getCPFCompra())) {
                relatoricompra += "Codigo da Compra: (" + comp.getCodigoCompra() + ") Nome da Compra: (" + comp.getNomeCompra() + ")  Valor da Compra: (" + comp.getValorCompra()
                        + ")  Codigo do Produto: (" + comp.getCodigoProduto() + ")  Data da Compra: (" + comp.getDataCompra() + ") Quantidade: (" + comp.getQuantidadeC() + ")\n\n";
            }
        }
        JOptionPane.showMessageDialog(null, relatoricompra);
        return pesquisaCompra;
    }

    public static boolean setRemoverCompra(String cpf, String x_id_compra) {
        pesquisaCompra = false;
        
        try {
            int id_compra = Integer.parseInt(x_id_compra);
            for (Compra comp : BancoListCompra) {
                if (cpf.equals(comp.getCPFCompra()) && (id_compra == comp.getCodigoCompra())) {
                    int resp = JOptionPane.showConfirmDialog(null, "Deseja Remover a Compra?" + "\nNome: " + comp.getNomeCompra() + "\nData&Hora: " + comp.getDataCompra());
                    if (resp == 0) {
                        String valor = Double.toString(comp.getValorCompra());
                        if (RepositorioCliente.setDebitar(cpf, valor)) {
                            String codCompra = Integer.toString(comp.getCodigoProduto());
                            String quantCompra = Integer.toString(comp.getQuantidadeC());
                            if (RepositorioEstoque.getCancelCompra(codCompra, quantCompra)) {
                                BancoListCompra.remove(comp);
                                JOptionPane.showMessageDialog(null, "Compra Removida Com Sucesso");
                                pesquisaCompra = true;
                            }
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

    public static boolean getExisteCompra(String cpf, String idcompra) {
        pesquisaCompra = false;
        exibirCompra = null;

        Compra c = new Compra();

        for (int i = 0; i < BancoListCompra.size(); i++) {
            c = BancoListCompra.get(i);
            int convertIDCOMPRA = Integer.parseInt(idcompra);
            if (c.getCPFCompra().equals(cpf) && c.getCodigoCompra() == convertIDCOMPRA) {
                exibirCompra = c;
                pesquisaCompra = true;
            }
        }
        return pesquisaCompra;
        //Verifica se existe alguma compra do cliente (Caso deseje remover um cliente)
    }

}
