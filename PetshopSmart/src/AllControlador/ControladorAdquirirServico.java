/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllControlador;

import AllClass.AdquirirServico;
import AllClass.Repositorio.RepositorioAdquirirSevico;
import javax.swing.JOptionPane;

public class ControladorAdquirirServico {
    
    private static String testSercivo;
    
    public static String adquirirServico(AdquirirServico cadAdquirirSercivo) {
        testSercivo = "";
        if (cadAdquirirSercivo != null) {
            if (RepositorioAdquirirSevico.setCompraServico(cadAdquirirSercivo)) {
                testSercivo = "1";
                JOptionPane.showMessageDialog(null, "Compra Realizada!!!");
            } else {
                testSercivo = "Erro, Compra não Cadastrada!!!";
            }
        }
        return testSercivo;
    }
    
    public static String removerServico(int codigoAnimal ,String cpf, int id_Servico) {
        testSercivo = "";
        int resp = JOptionPane.showConfirmDialog(null, "Deseja Remover o Serviço?");
        if (resp == 0) {
            if (RepositorioAdquirirSevico.setRemoverServico(codigoAnimal, cpf, id_Servico)) {
                testSercivo = "1";
                JOptionPane.showMessageDialog(null, "Compra Removida com Sucesso");
            } else {
                testSercivo = "Erro, Compra não Removida!!!";
            }
        }

        return testSercivo;
    }
    
    public static String existeServico(int idServico) {
        testSercivo = "";
        
        if (RepositorioAdquirirSevico.getExisteServico(idServico)){
            testSercivo = "1";
        }else{
            testSercivo = "Não Existe Serviço Para o Animal Consultado";
        }
        
        return testSercivo;
        //Verifica se o animal possui algum serviço
    }
    
    public static String existeClienteServico(String cpf) {
        testSercivo = "";
        
        if (RepositorioAdquirirSevico.getExisteClienteServico(cpf)){
            testSercivo = "1";
        }else{
            testSercivo = "Não Existe Serviço Para o Cliente Consultado";
        }
        
        return testSercivo;
        //Verifica se o cliente adquiriu algum serviço
    }
    
    
    public static AdquirirServico exibirServico(String cpf, int idServico) {
        
        AdquirirServico exibirServico = RepositorioAdquirirSevico.getExibirCompra(cpf, idServico);
        
        return exibirServico;
        //Verifica se existe alguma serviço do cliente (Caso deseje remover um cliente)
    }
    
    
    
    
    
    
    
    
}
