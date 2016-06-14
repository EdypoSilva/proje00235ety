/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllControlador;

import AllClass.Cliente;
import AllClass.Repositorio.RepositorioCliente;
import AllSuporte.ValidarDados;
import javax.swing.JOptionPane;

public class ControladorCliente {

    private static String erros;
    
    
    
    public static boolean limparCPF(String cpf) {
        if (ValidarDados.validarCpf(cpf)) {
            return true;
        }
        return false;
    }

    private static String validarCamposCliente(Cliente cadCliente) {
        boolean testVariaveis = true;
        erros = "Campo * Incorreto *\n";

        if (cadCliente.getNome().equals("")) {
            erros += "* Nome\n";
            testVariaveis = false;
        }

        if (limparCPF(cadCliente.getCpf())) {
            erros += "* CPF\n";
            testVariaveis = false;
        }

        if (cadCliente.getTelefone().equals("(  )    -    ")) {
            erros += "* Telefone\n";
            testVariaveis = false;
        }

        if (cadCliente.getSexo().equals("")) {
            erros += "* Sexo\n";
            testVariaveis = false;
        }

        if (testVariaveis == true) {
            erros = "1";
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
            } else {
                testDados = "* CPF Existente";
            }
        }

        return testDados;
    }

    public static String alterarCliente(Cliente altCliente) {

        String testDados = validarCamposCliente(altCliente);
        if (testDados.equals("1")) {
            int resp = JOptionPane.showConfirmDialog(null, "Deseja Alterar o Animal?");
            if (resp == 0) {
                if (RepositorioCliente.setAlterarCliente(altCliente)) {
                    JOptionPane.showMessageDialog(null, "Alterado Com Sucesso!!!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não Alterado!!!");
                }
            }
        }

        return testDados;
    }

    public static String removerCliente(String cpf) {
        String dellCliente = "";

        if (!cpf.equals("")) {
            int resp = JOptionPane.showConfirmDialog(null, "Deseja Remover o Cliente?");
            if (resp == 0) {
                if (RepositorioCliente.setRemoverCliente(cpf)) {
                    dellCliente = "1";
                    JOptionPane.showMessageDialog(null, "Removido Com Sucesso!!!");
                } else {
                    dellCliente = "!!!Não pode ser removido!!! \n* Cliente possue compras ou animais!!!";
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Campo * Incorreto *\n* CPF");
        }

        return dellCliente;
    }

    public static String creditarCliente(String cpf, double valor) {
        String testCreditar = "";
        if (valor > 0) {
            if (RepositorioCliente.setCreditar(cpf, valor)) {
                testCreditar = "1";
            } else {
                testCreditar = "Erro, Valor não Creditado!!!";
            }
        }

        return testCreditar;
    }

     public static Cliente exibirCliente (String cpf){
        Cliente c=null;
        if (RepositorioCliente.setValidarCPF(cpf)){
        c = RepositorioCliente.getExibirCliente(cpf);
        }
        
        return c;
    }
    
    public static String validarCPF(String cpf) {
        String testClienteExiste = "";
        if (RepositorioCliente.setValidarCPF(cpf)){
            testClienteExiste = "1";
        }else{
            testClienteExiste = "Erro, Cliente não Existe";
        }
        
        return testClienteExiste;
    }
    
    
    

}
