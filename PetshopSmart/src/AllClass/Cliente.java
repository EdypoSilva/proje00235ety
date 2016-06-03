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
    
        String cNomeC;
        String cCpf;
        String cTelefone;
        String cSexoC;
        double cSaldo;

        public Cliente (String nome, String cpf, String telefone, String sexo){
            this.cNomeC = nome;
            this.cCpf = cpf;
            this.cTelefone = telefone;
            this.cSexoC = sexo;
            this.cSaldo = 0;
        }
        
        public Cliente(){
        }
              
        public String getNome()
        {
            return cNomeC;
        }
        
        public void setNome(String nomes){
            cNomeC = nomes;
        }
        
        public String getCpf(){
            return cCpf;
        }
        public void setCpf(String cpfs){
            this.cCpf = cpfs;
        }
        
        public String getTelefone(){
            return cTelefone;
        }
        
        public void setTelefone(String telefones){
            this.cTelefone = telefones;
        }
        
        public double getSaldo(){
            return cSaldo;
        }
        
        public void setSaldoCreditar(double valor){
            this.cSaldo += valor;
        }
        
        public void setSaldoDebitar(double valor){
            this.cSaldo -= valor;
        }
        
        public String getSexo(){
            return cSexoC;
        }
        
        public void setSexo(String sexos){
            this.cSexoC = sexos;
        }
        
               
        public void getExibirCliente()
        {
            JOptionPane.showMessageDialog(null,"Nome: " + cNomeC + "\nCPF: " + cCpf + "\nTelefone: " + cTelefone + "\nSaldo {Saldo}" + cSaldo); 
        }
    
}
