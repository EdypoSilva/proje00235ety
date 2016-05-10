/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClass;

import javax.swing.JOptionPane;

/**
 *
 * @author Felly
 */
public class Cliente {
    
        String NomeC;
        String Cpf;
        String Telefone;
        double Saldo;

        public Cliente (String nome, String cpf, String telefone){
            this.NomeC = nome;
            this.Cpf = cpf;
            this.Telefone = telefone;
            JOptionPane.showMessageDialog(null,"Mome: " + this.NomeC + "\nCPF: " + this.Cpf + "\nTelefone: " + this.Telefone + "\nSaldo: " + this.Saldo); //test
        }
        
        public Cliente(){
        }
        
        public String getNome()
        {
            return NomeC;
        }
        
        public String getCpf(){
            return Cpf;
        }
        
        public String getTelefone(){
            return Telefone;
        }
        
        public double getSaldo(){
            return Saldo;
        }
        
        public void setSaldoMais (double valor)
        {
            Saldo += valor;
        }

        public void setSaldoMenos (double valor)
        {
            Saldo -= valor;
        }
        
        public void getExibirCliente()
        {
            JOptionPane.showMessageDialog(null,"Nome: " + NomeC + "\nCPF: " + Cpf + "\nTelefone: " + Telefone + "\nSaldo {Saldo}" + Saldo); 
        }
    
}
