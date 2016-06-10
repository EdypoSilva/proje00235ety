/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllControlador;

import AllClass.Animal;
import AllClass.Repositorio.RepositorioAnimal;
import javax.swing.JOptionPane;

public class ControladorAnimal {

    private static boolean testCadastro;
    private static boolean testVariaveis;
    private static boolean testConsultaAnimal;
    private static String erros;

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
            erros += "* Selecione o Sexo\n";
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
        }

        return erros;
    }

    public static String cadastroAnimal(Animal cadAnimal) {
        String testDados = validarCamposAnimal(cadAnimal);
        if (testDados.equals("1")) {
            testDados = "1";
            if (RepositorioAnimal.setCadastroAnimal(cadAnimal)) {
                JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso!!!");
            } else {
                JOptionPane.showMessageDialog(null, "Não Cadastrado!!!");
            }
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
        if (testDados.equals("1") && (posi >= 0)) {
            int resp = JOptionPane.showConfirmDialog(null, "Deseja Alterar o Animal?");
            if (resp == 0) {
                if (RepositorioAnimal.setAlterarAnimal(cadAnimal, posi)) {
                    JOptionPane.showMessageDialog(null, "Alterado Com Sucesso!!!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não Alterado!!!");
                }
            }
        }

        return testDados;
    }

    public static String deletarAnimal(String cpf, int posi) {
        String erros = "";
        if (!cpf.equals("") && (posi >= 0)) {
            int resp = JOptionPane.showConfirmDialog(null, "Deseja Remover o Animal?");
            if (resp == 0) {
                if (RepositorioAnimal.setDeletarAnimal(cpf, posi)) {
                    erros="1";
                    JOptionPane.showMessageDialog(null, "Removido Com Sucesso!!!");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro, Não Removido!!!");
                }
            }
        }

        return erros;
    }

    public static Animal exibirAnimal(String cpf, int posi) {
        Animal xAnimal = new Animal();

        if (!cpf.equals("") && (posi >= 0)) {
            xAnimal=RepositorioAnimal.setExibirAnimal(cpf, posi); 
        }else{
            JOptionPane.showMessageDialog(null,"Dados, invalidos!!!");
        }
         
        return xAnimal;
    }

    public static int quantAnimalCliente(String cpf) {
        int quantAnimal = 0;
        if (!cpf.equals("")) {
            quantAnimal = RepositorioAnimal.getQuantAnimalCliente(cpf);
        } else {
            JOptionPane.showMessageDialog(null, "Dados, invalidos!!!");
        }

        return quantAnimal;
    }

}
