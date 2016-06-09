/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllControlador;

import AllClass.Animal;
import AllClass.Repositorio.RepositorioAnimal;

public class ControladorAnimal {

    private static boolean testCadastro;
    private static boolean testVariaveis;
    private static boolean testConsultaAnimal;
    private static String erros;
    private Animal exibirAnimal;

    private static String validarCamposAnimal(Animal cadAnimal) {
        testVariaveis = true;
        erros = "Campo * Incorreto *\n";

        if (cadAnimal.getNomeA().equals("")) {
            erros += "* Nome\n";
            testVariaveis = false;
        }

        if (cadAnimal.getIdade() < 0) {
            erros += "* Idade\n";
            testVariaveis = false;
        }

        if (cadAnimal.getCor().equals("")) {
            erros += "* Cor\n";
            testVariaveis = false;
        }

        if (cadAnimal.getRaca().equals("")) {
            erros += "* Raça\n";
            testVariaveis = false;
        }

        if (cadAnimal.getSexo().equals("")) {
            erros += "* Sexo\n";
            testVariaveis = false;
        }

        if (cadAnimal.getCpf().equals("")) {
            erros += "* CPF\n";
            testVariaveis = false;
        }

        if (cadAnimal.getCodigoA() < 0) {
            erros += "* Código\n";
            testVariaveis = false;
        }

        if (cadAnimal == null) {
            testVariaveis = false;
        }

        if (testVariaveis) {
            erros = "1";
            //RepositorioAnimal.setCadastroAnimal(cadAnimal);
        }

        return erros;
    }

    public static String cadastroAnimal(Animal cadAnimal) {
        String testDados = validarCamposAnimal(cadAnimal);
        if (testDados.equals("1")) {
            testDados = "1";
            //RepositorioAnimal.setCadastroAnimal(cadAnimal);
        }
        return testDados;
    }

    public static String existeClienteAnimal(String cpf) {
        testConsultaAnimal = true;
        erros = "";
        if (cpf.equals("")) {
            testConsultaAnimal = false;
            erros += "* CPF Incorreto";
        }

        if (testConsultaAnimal) {
            if (RepositorioAnimal.getExisteClienteAnimal(cpf)) {
                erros = "1";
            } else {
                erros = "* CPF Não Existe";
            }
        }

        return erros;
    }

    public static String alterarAnimal(Animal cadAnimal, int posi) {
        String testDados = validarCamposAnimal(cadAnimal);
        if (testDados.equals("1")){  
            //RepositorioAnimal.setAlterarAnimal(Animal cadAnimal, int posi);
        }
        
        return testDados;
    }

    
    
    
    
    
    
}
