/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClass.Repositorio;

import AllClass.Cliente;
import javax.swing.JOptionPane;


public class RepositorioCliente{
    public static int ContCliente;
    
    
    public static void SetCadastroCliente(String nome, String cpf, String telefone){
        Cliente clientes = new Cliente(nome, cpf, telefone);
        
        BancoDeDados.BancoPetshop.BancoCliente[ContCliente]=clientes;
        ContCliente++;
    }
    
    public static void setConsultaCliente(String cpf){
        
        for (int i = 0; i<ContCliente; i++){
            Cliente clientes;
            if (BancoDeDados.BancoPetshop.BancoCliente[i].getCpf().equals(cpf)){
                clientes = BancoDeDados.BancoPetshop.BancoCliente[i];
                JOptionPane.showMessageDialog(null, "Nome: " + clientes.getNome() + "\nCPF: " + clientes.getCpf() + "\nTelefone: " + clientes.getTelefone());
            }
        
        }
}
}