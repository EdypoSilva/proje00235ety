/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClass.Repositorio;

import AllClass.Produto;
import static BancoDeDados.BancoPetshop.BancoListProduto;
import javax.swing.JOptionPane;

public class RepositorioEstoque {

    public static boolean statusEstoque = false;

    public static boolean getADDEstoque(String xcod, String xquant, String xvalor) {
        statusEstoque = false;
        Produto p = new Produto();
        try {
            int cod = Integer.parseInt(xcod);
            int quant = Integer.parseInt(xquant);
            double valor = Double.parseDouble(xvalor);
            for (int i = 0; i < BancoListProduto.size(); i++) {
                p = BancoListProduto.get(i);
                if (p.getCodigoP() == (cod)) {
                    p.setQuantCreditar(quant);
                    p.setValorP(valor);
                    int resp = JOptionPane.showConfirmDialog(null, "Confirma Alteração?");
                    if (resp == 0) {
                        BancoListProduto.set(i, p);
                        statusEstoque = true;
                    }
                }
            }
        } catch (Exception e) {
            statusEstoque = true;
        }
        return statusEstoque;
    }

    public static boolean getRemoveEstoque(String xcod, String xquant, String xvalor) {
        statusEstoque = false;
        Produto p = new Produto();
        try {
            int cod = Integer.parseInt(xcod);
            int quant = Integer.parseInt(xquant);
            double valor = Double.parseDouble(xvalor);
            for (int i = 0; i < BancoListProduto.size(); i++) {
                p = BancoListProduto.get(i);
                if (p.getCodigoP() == (cod)) {
                    p.setQuantDebitar(quant);
                    p.setValorP(valor);
                    int resp = JOptionPane.showConfirmDialog(null, "Deseja Remover Quantidade?");
                    if (resp == 0) {
                        BancoListProduto.set(i, p);
                        statusEstoque = true;
                    }
                }
            }
        } catch (Exception e) {
            statusEstoque = true;
        }
        return statusEstoque;
    }

    public static boolean getRemoveQuantCompra(String xcod, String xquant) {
        statusEstoque = false;
        Produto p = new Produto();
        try {
            int cod = Integer.parseInt(xcod);
            int quant = Integer.parseInt(xquant);
            for (int i = 0; i < BancoListProduto.size(); i++) {
                p = BancoListProduto.get(i);
                if (p.getCodigoP() == (cod) && quant <= p.getQuantidade()) {
                    p.setQuantDebitar(quant);
                    BancoListProduto.set(i, p);
                    statusEstoque = true;
                }
            }
        } catch (Exception e) {
            statusEstoque = true;
        }
        return statusEstoque;
        //
    }

    public static boolean getCancelCompra(String xcod, String xquant) {
        statusEstoque = false;
        Produto p = new Produto();
        try {
            int cod = Integer.parseInt(xcod);
            int quant = Integer.parseInt(xquant);
            for (int i = 0; i < BancoListProduto.size(); i++) {
                p = BancoListProduto.get(i);
                if (p.getCodigoP() == (cod)) {
                    p.setQuantCreditar(quant);
                    BancoListProduto.set(i, p);
                    statusEstoque = true;
                }
            }
        } catch (Exception e) {
            statusEstoque = true;
        }
        return statusEstoque;
        //Apenas remove uma compra (Ligaçao com a class RepositorioCompra
    }

}
