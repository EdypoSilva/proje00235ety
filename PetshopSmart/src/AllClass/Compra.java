
package AllClass;


public class Compra {
String c_NomeCompra;
double c_ValorCompra;
int c_codigoProduto;
int c_CodigoCompra;
String c_DataCompra;
String c_CPFCompra;
int c_Quantidade;


public Compra(){
}

public Compra(String nomeCompra, String valorCompra, String c_codigoProduto,String codigoCompra, String dataCompra, String CPFcompra, int quantidade){
    this.c_NomeCompra = nomeCompra;
    this.c_ValorCompra = Double.parseDouble(valorCompra);
    this.c_codigoProduto = Integer.parseInt(c_codigoProduto);
    this.c_CodigoCompra = Integer.parseInt(codigoCompra);
    this.c_DataCompra = dataCompra;
    this.c_CPFCompra = CPFcompra;
    this.c_Quantidade = quantidade;
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
