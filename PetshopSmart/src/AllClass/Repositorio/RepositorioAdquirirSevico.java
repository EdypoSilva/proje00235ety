/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClass.Repositorio;

import AllClass.AdquirirServico;
import static BancoDeDados.BancoPetshop.BancoListAdquirirServico;

public class RepositorioAdquirirSevico {

    private static int codigoServico;
    private static boolean statusServico;
    
    public static boolean setCompraServico(AdquirirServico cadAdquirirServico) {
        statusServico = false;
        try {
            cadAdquirirServico.setC_CodigoServico(codigoServico);
            BancoListAdquirirServico.add(cadAdquirirServico);
            statusServico = true;
            codigoServico++;
            return true;
        } catch (Exception e) {
            statusServico = false;
        }
        return statusServico;
    }

    public static boolean setRemoverServico(int codigoAnimal, String cpf, int id_servico) {
        statusServico = false;
        try {
            for (AdquirirServico comp : BancoListAdquirirServico) {
                if (codigoAnimal == (comp.getC_codigoAnimal()) && (id_servico == comp.getC_CodigoServico())) {
                    if (RepositorioCliente.setDebitar(cpf, comp.getC_ValorServico())) {
                        BancoListAdquirirServico.remove(comp);
                        statusServico = true;

                    }
                }
            }
        } catch (Exception e) {
        }
        return statusServico;
    }
    
    public static boolean getExisteServico(int idServico) {
        statusServico = false;
        AdquirirServico s = new AdquirirServico();
        for (int i = 0; i < BancoListAdquirirServico.size(); i++) {
            s = BancoListAdquirirServico.get(i);
            if (s.getC_CodigoServico() == idServico) {
                statusServico = true;
            }
        }
        return statusServico;
        //Verifica se o animal possui algum serviço
    }
    
    public static boolean getExisteClienteServico(String cpf) {
        statusServico = false;
        AdquirirServico s = new AdquirirServico();
        for (int i = 0; i < BancoListAdquirirServico.size(); i++) {
            s = BancoListAdquirirServico.get(i);
            if (s.getC_CPFCliente().equals(cpf)) {
                statusServico = true;
            }
        }
        return statusServico;
        //Verifica se o cliente adquiriu algum serviço
    }
    
    public static AdquirirServico getExibirCompra(String cpf, int idServico) {
        AdquirirServico exibirServico = null;

        for (int i = 0; i < BancoListAdquirirServico.size(); i++) {
            AdquirirServico s = BancoListAdquirirServico.get(i);
            if (s.getC_CPFCliente().equals(cpf) && s.getC_CodigoServico() == idServico) {
                exibirServico = s;
            }
        }
        return exibirServico;
        //Verifica se existe alguma serviço do cliente (Caso deseje remover um cliente)
    }
    
    
    
}
