/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClass.Repositorio;

import AllClass.ServicoBasico;
import static BancoDeDados.BancoPetshop.BancoListServicoBasico;

public class RepositorioServicoBasico {

    private static boolean testServicoBasico;

    public static boolean setCadServico(ServicoBasico cadServico) {
        testServicoBasico = false;
        try {
            BancoListServicoBasico.add(cadServico);
            testServicoBasico = true;
        } catch (Exception e) {
            testServicoBasico = false;
        }
        return testServicoBasico;
        //Cadastra servico
    }

     public static boolean setEditarServico(ServicoBasico altServico) {
        testServicoBasico = false;
        try {
            for (int i = 0; i < BancoListServicoBasico.size(); i++) {
                ServicoBasico servico = BancoListServicoBasico.get(i);
                if (servico.getS_CodigoS() == altServico.getS_CodigoS()) {
                    BancoListServicoBasico.set(i, altServico);
                    testServicoBasico = true;
                }
            }
        } catch (Exception e) {
            testServicoBasico = false;
        }
        //Alterar Serviço
        return testServicoBasico;
    }

    public static boolean setDeletarServicoBasico(int idServicoBasico) {
        testServicoBasico = false;
        try {
            for (int i = 0; i < BancoListServicoBasico.size(); i++) {
                ServicoBasico servico = BancoListServicoBasico.get(i);
                if (servico.getS_CodigoS() == idServicoBasico) {
                    BancoListServicoBasico.remove(i);
                    testServicoBasico = true;
                }
            }
        } catch (Exception e) {
            testServicoBasico = false;
        }

        //Remover servico
        return testServicoBasico;
    }

    public static ServicoBasico getExibirServico(int idServico) {
        ServicoBasico exibirServicoBasico = null;
        try {
            for (int i = 0; i < BancoListServicoBasico.size(); i++) {
                ServicoBasico servico = BancoListServicoBasico.get(i);
                if (servico.getS_CodigoS() == (idServico)) {
                    exibirServicoBasico = BancoListServicoBasico.get(i);
                }
            }
        } catch (Exception e) {
            exibirServicoBasico = null;
        }

        return exibirServicoBasico;
        //Verifica se o servico e retorna o mesmo
    }
    
    
    public static boolean getValidarServicoBasico(int idServico){
        testServicoBasico=false;
        
        for (int i = 0; i < BancoListServicoBasico.size(); i++) {
                ServicoBasico testServico = BancoListServicoBasico.get(i);
                if ((testServico.getS_CodigoS() == (idServico))) {
                    testServicoBasico = true;
                }
            }
        
        return testServicoBasico;
    }
    
}
