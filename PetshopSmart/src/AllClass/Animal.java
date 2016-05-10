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
public class Animal {
    
        String NomeA;
        int Idade;
        String Cor;
        String Raca;
        String Sexo;
        int CodigoA;
        int cpf;


        public Animal (String nome, String idade, String cor, String raca, String sexo, int cpf)
        {
            this.NomeA = nome;
            this.Idade = Integer.parseInt(idade);
            this.Cor = cor;
            this.Raca = raca;
            this.Sexo = sexo;
            this.cpf = cpf;
            JOptionPane.showMessageDialog(null,"Nome: " + this.NomeA + "\nIdade: " + this.Idade + "\nCor: " + this.Cor + "\nRaça: " + this.Raca + "\nSexo: " + this.Sexo + "\nCPF: " + this.cpf);
        //test
        }
        
        public Animal(){
        }
  
        public String getNomeA (){
            return NomeA;
        }
        
        public int getIdade(){
            return Idade;
        }
        
        public String getCor(){
            return Cor;
        }
        
        public String getRaca(){
            return Raca;
        }
        
        public String getSexo(){
            return Sexo;
        }
        
        public int getCodigoA(){
            return CodigoA;
        }
    
        public double getCpf(){
            return cpf;
        }
    
}
