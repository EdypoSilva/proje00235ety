/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllControlador;

import AllClass.Cliente;
import AllClass.Repositorio.RepositorioCliente;
import javax.swing.JOptionPane;

public class ControladorCliente {

    private static boolean testCadastro;
    private static boolean testVariaveis;
    private static boolean testConsultaAnimal;
    private static String erros;

    private static String validarCamposCliente(Cliente cadCliente) {
        testVariaveis = true;
        erros = "Campo * Incorreto *\n";

        if (cadCliente.getNome().equals("")) {
            erros += "* Nome\n";
            testVariaveis = false;
        }

        if (!RepositorioCliente.setLimparCPF(cadCliente.getCpf())) {
            erros += "* CPF\n";
            testVariaveis = false;
        }

        if (!RepositorioCliente.setLimparTelefone(cadCliente.getTelefone())) {
            erros += "* Telefone\n";
            testVariaveis = false;
        }

        if (cadCliente.getSexo().equals("")) {
            erros += "* Sexo\n";
            testVariaveis = false;
        }

        if (testVariaveis==true){
            erros="1";
        }
        return erros;
    }

    public static String cadastroCliente(Cliente cadCliente) {

        String testDados = validarCamposCliente(cadCliente);
        if (testDados.equals("1")) {
            if (!RepositorioCliente.setValidarCPF(cadCliente.getCpf())) {
                if (RepositorioCliente.setCadastroCliente(cadCliente)) {
                    JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso!!!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não Cadastrado!!!");
                }
            }else{
               testDados="* CPF Existente"; 
            }
        }

        return testDados;
    }

    
    
    
}
