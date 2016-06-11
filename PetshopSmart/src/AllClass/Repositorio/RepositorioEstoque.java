/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClass.Repositorio;

import AllClass.Produto;
import static BancoDeDados.BancoPetshop.BancoListProduto;

public class RepositorioEstoque {

    public static boolean statusEstoque = false;

    public static boolean getADDEstoque(int cod, int quant, double valor) {
        statusEstoque = false;
        Produto p = new Produto();
        try {
            for (int i = 0; i < BancoListProduto.size(); i++) {
                p = BancoListProduto.get(i);
                if (p.getCodigoP() == (cod)) {
                    p.setQuantCreditar(quant);
                    p.setValorP(valor);
                    BancoListProduto.set(i, p);
                    statusEstoque = true;
                }
            }
        } catch (Exception e) {
            statusEstoque = false;
        }
        return statusEstoque;
    }

    public static boolean getRemoveEstoque(int cod, int quant, double valor) {
        statusEstoque = false;
        Produto p = new Produto();
        try {
            for (int i = 0; i < BancoListProduto.size(); i++) {
                p = BancoListProduto.get(i);
                if (p.getCodigoP() == (cod)) {
                    p.setQuantDebitar(quant);
                    p.setValorP(valor);
                    BancoListProduto.set(i, p);
                    statusEstoque = true;
                }
            }
        } catch (Exception e) {
            statusEstoque = false;
        }
        return statusEstoque;
    }

    public static boolean getRemoveQuantCompra(int cod, int quant) {
        statusEstoque = false;
        Produto p = new Produto();
        try {
            for (int i = 0; i < BancoListProduto.size(); i++) {
                p = BancoListProduto.get(i);
                if (p.getCodigoP() == (cod) && quant <= p.getQuantidade()) {
                    p.setQuantDebitar(quant);
                    BancoListProduto.set(i, p);
                    statusEstoque = true;
                }
            }
        } catch (Exception e) {
            statusEstoque = false;
        }
        return statusEstoque;
        //
    }

    public static boolean getCancelCompra(int cod, int quant) {
        statusEstoque = false;
        Produto p = new Produto();
        try {
            for (int i = 0; i < BancoListProduto.size(); i++) {
                p = BancoListProduto.get(i);
                if (p.getCodigoP() == (cod)) {
                    p.setQuantCreditar(quant);
                    BancoListProduto.set(i, p);
                    statusEstoque = true;
                }
            }
        } catch (Exception e) {
            statusEstoque = false;
        }
        return statusEstoque;
        //Apenas remove uma compra (Ligaçao com a class RepositorioCompra
    }

}
