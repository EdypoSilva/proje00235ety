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
public class Produto {

    String p_NomeP;
    String p_InforP;
    String p_CategoriaP;
    double p_ValorP;
    int p_CodigoP;
    int p_Quantidade;

    public Produto(String nome, String inforp, String categoria, double valor, int codigoP, int quantidade) {
        this.p_NomeP = nome;
        this.p_InforP = inforp;
        this.p_CategoriaP = categoria;
        this.p_ValorP = valor;
        this.p_CodigoP = codigoP;
        this.p_Quantidade = quantidade;
    }

    public Produto() {
    }

    public String getNome() {
        return p_NomeP;
    }
    
    public void setNome(String nomep){
        this.p_NomeP = nomep;
    }
    
    public String getInforP() {
        return p_InforP;
    }
    
    public void setInforP(String infoP){
        this.p_InforP = infoP;
    }
    
    public String getCategoriaP() {
        return p_CategoriaP;
    }
    
    public void setCategoriaP(String categoria){
        this.p_CategoriaP = categoria;
    }
    
    public double getValorP() {
        return p_ValorP;
    }
    
    public void setValorP(double valorP){
        this.p_ValorP = valorP;
    }

    public int getCodigoP() {
        return p_CodigoP;
    }

    public void setCodigo(int codigoP) {
        this.p_CodigoP = codigoP;
    }

    public void setQuantidade(int quantidadeP) {
        this.p_Quantidade = quantidadeP;
    }

    public int getQuantidade() {
        return p_Quantidade;
    }

    public void setQuantCreditar(double quant) {
        this.p_Quantidade += quant;
    }

    public void setQuantDebitar(double quant) {
        this.p_Quantidade -= quant;
    }
    

    public void ExibirP() {
        //MessageBox.Show($"Nome: {NomeP}\nInformações: {InforP}\nCategoria: {CategoriaP}\nValor: {ValorP}\nCódigo: {CodigoP}");
    }

}
