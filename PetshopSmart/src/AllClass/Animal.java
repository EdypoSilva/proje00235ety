/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClass;


/**
 *
 * @author Felly
 */
public class Animal {
    
        String a_NomeA;
        int a_Idade;
        String a_Cor;
        String a_Raca;
        String a_Sexo;
        int a_CodigoA;
        String a_cpf;


        public Animal (String nome, String idade, String cor, String raca, String sexo, String cpf, String codigo)
        {
            this.a_NomeA = nome;
            this.a_Idade = Integer.parseInt(idade);
            this.a_Cor = cor;
            this.a_Raca = raca;
            this.a_Sexo = sexo;
            this.a_cpf = cpf;
            this.a_CodigoA = Integer.parseInt(codigo);
       
        }
        
        public Animal(){
        }
  
        public String getNomeA (){
            return a_NomeA;
        }
        
        public int getIdade(){
            return a_Idade;
        }
        
        public String getCor(){
            return a_Cor;
        }
        
        public String getRaca(){
            return a_Raca;
        }
        
        public String getSexo(){
            return a_Sexo;
        }
        
        public int getCodigoA(){
            return a_CodigoA;
        }
    
        public void setCodigoA(int edit_codigo){
            this.a_CodigoA = edit_codigo;
        }
        
        public String getCpf(){
            return a_cpf;
        }
        
        public void setNome(String edit_nome){
            this.a_NomeA = edit_nome;
        }
        
        public void setIdade(int edit_idade){
            this.a_Idade = edit_idade;
        }
        
        public void setCor(String edit_cor){
            this.a_Cor = edit_cor;
        }
        
        public void setRaca(String edit_Raca){
            this.a_Raca = edit_Raca;
        }
        
        public void setSexo(String edit_Sexo){
            this.a_Sexo = edit_Sexo;
        }
        
        public void setCpf(String edit_Cpf){
            this.a_cpf = edit_Cpf;
        }
        
    
}
