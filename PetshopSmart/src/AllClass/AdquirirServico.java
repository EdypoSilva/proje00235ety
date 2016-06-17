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
public class AdquirirServico {

    String c_NomeServico;
    String c_NomeCliente;
    String c_CPFCliente;
    int c_codigoAnimal;
    double c_ValorServico;
    int c_CodigoServico;
    String c_DataCompra;
    
    public AdquirirServico (String nomeServico, String nomeCliente, String cpf, int codigoAnimal, double valorServico, int codigoServico, String dataeHoraServico){
        this.c_NomeServico = nomeServico;
        this.c_NomeCliente = nomeCliente;
        this.c_CPFCliente = cpf;
        this.c_codigoAnimal = codigoAnimal;
        this.c_ValorServico = valorServico;
        this.c_CodigoServico = codigoServico;
        this.c_DataCompra = dataeHoraServico;
    }
    
    public AdquirirServico (){
    }

    public String getC_NomeServico() {
        return c_NomeServico;
    }

    public void setC_NomeServico(String c_NomeServico) {
        this.c_NomeServico = c_NomeServico;
    }

    public String getC_NomeCliente() {
        return c_NomeCliente;
    }

    public void setC_NomeCliente(String c_NomeCliente) {
        this.c_NomeCliente = c_NomeCliente;
    }

    public String getC_CPFCliente() {
        return c_CPFCliente;
    }

    public void setC_CPFCliente(String c_CPFCliente) {
        this.c_CPFCliente = c_CPFCliente;
    }

    public int getC_codigoAnimal() {
        return c_codigoAnimal;
    }

    public void setC_codigoAnimal(int c_codigoAnimal) {
        this.c_codigoAnimal = c_codigoAnimal;
    }

    public double getC_ValorServico() {
        return c_ValorServico;
    }

    public void setC_ValorServico(double c_ValorServico) {
        this.c_ValorServico = c_ValorServico;
    }

    public int getC_CodigoServico() {
        return c_CodigoServico;
    }

    public void setC_CodigoServico(int c_CodigoServico) {
        this.c_CodigoServico = c_CodigoServico;
    }

    public String getC_DataCompra() {
        return c_DataCompra;
    }

    public void setC_DataCompra(String c_DataCompra) {
        this.c_DataCompra = c_DataCompra;
    }

}
