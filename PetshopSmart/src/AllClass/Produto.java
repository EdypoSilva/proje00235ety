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
public class Produto {
    
        String NomeP;
        String InforP;
        String CategoriaP;
        double ValorP;
        int CodigoP;

        public Produto(String nome, String inforp, String categoria, String valor)
        {
            this.NomeP = nome;
            this.InforP = inforp;
            this.CategoriaP = categoria;
            this.ValorP = Double.parseDouble(valor);
            JOptionPane.showMessageDialog(null,"Nome: " + this.NomeP + "\nInformações: " + this.InforP + "\nCategoria: " + this.CategoriaP + "\nValor: " + this.ValorP + "\nCodigo: " + this.CodigoP);
        //test
        }
        
        public String getNome(){
            return NomeP;
        }
        
        public String getInforP(){
            return InforP;
        }
        
        public String getCategoriaP(){
            return CategoriaP;
        }
        
        public double getValorP(){
            return ValorP;
        }
        
        public int CodigoP(){
            return CodigoP;
        }
        
        public void setCodigo(int codigoP){
            this.CodigoP = codigoP;
        }

        public void ExibirP()
        {
            //MessageBox.Show($"Nome: {NomeP}\nInformações: {InforP}\nCategoria: {CategoriaP}\nValor: {ValorP}\nCódigo: {CodigoP}");
        }

    
}
