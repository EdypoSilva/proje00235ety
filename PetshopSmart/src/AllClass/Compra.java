
package AllClass;

/**
 *
 * @author Felly
 */
public class Compra {
String c_NomeCompra;
String c_NomeCliente;
double c_ValorCompra;
int c_codigoProduto;
int c_CodigoCompra;
String c_DataCompra;
String c_CPFCompra;
int c_Quantidade;


public Compra(){
}

public Compra(String nomeCompra, String nomeCliente, double valorCompra, int c_codigoProduto,int codigoCompra, String dataCompra, String CPFcompra, int quantidade){
    this.c_NomeCompra = nomeCompra;
    this.c_NomeCliente = nomeCliente;
    this.c_ValorCompra = valorCompra;
    this.c_codigoProduto = c_codigoProduto;
    this.c_CodigoCompra = codigoCompra;
    this.c_DataCompra = dataCompra;
    this.c_CPFCompra = CPFcompra;
    this.c_Quantidade = quantidade;
}

public String getNomeCliente(){
    return this.c_NomeCliente;
}

public void setCodigoCompra(int codCompra){
    this.c_CodigoCompra = codCompra;
}

public void setQuantidadec(int quantCompra){
    this.c_Quantidade = quantCompra;
}

public String getNomeCompra(){
    return this.c_NomeCompra;
}

public double getValorCompra(){
    return this.c_ValorCompra;
}

public int getCodigoProduto(){
    return this.c_codigoProduto;
}
 
public int getCodigoCompra(){
    return this.c_CodigoCompra;
}

public String getCPFCompra(){
    return this.c_CPFCompra;
}

public String getDataCompra(){
    return this.c_DataCompra;
}

public int getQuantidadeC(){
    return this.c_Quantidade;
}
   
   


}
