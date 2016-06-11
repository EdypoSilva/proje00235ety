/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllControlador;

import AllClass.Repositorio.RepositorioEstoque;
import javax.swing.JOptionPane;

public class ControladorEstoque {

    public static String addEstoque(int codigoPro, int quantPro, double valorPro) {
        String testEstoqueADD = "";
        if (codigoPro >= 0 && quantPro > 0 && valorPro > 0) {
            int resp = JOptionPane.showConfirmDialog(null, "Confirma Alteração?");
            if (resp == 0) {
                if (RepositorioEstoque.getADDEstoque(codigoPro, quantPro, valorPro)) {
                    testEstoqueADD = "1";
                    JOptionPane.showMessageDialog(null, "Produto Atualizado com Sucesso!!!");
                } else {
                    testEstoqueADD = "Erro, Produto não Atualizado!!!";
                }
            }
        }

        return testEstoqueADD;
    }

    public static String removeEstoque(int codigoPro, int quantPro, double valorPro) {
        String testRemoveEstoque = "";
        if (codigoPro >= 0 && quantPro > 0) {
            int resp = JOptionPane.showConfirmDialog(null, "Deseja Remover Quantidade?");
            if (resp == 0) {
                if (RepositorioEstoque.getRemoveEstoque(codigoPro, quantPro, valorPro)) {
                    testRemoveEstoque = "1";
                    JOptionPane.showMessageDialog(null, "Produto Atualizado com Sucesso!!!");
                } else {
                    testRemoveEstoque = "Erro, Produto não Atualizado!!!";
                }
            }
        }

        return testRemoveEstoque;
    }

    public static String removeQuantCompra(int cod, int quant) {
        String testRemovendoQuantCompras = "";

        if (RepositorioEstoque.getRemoveQuantCompra(cod, quant)) {
            testRemovendoQuantCompras = "1";
        } else {
            testRemovendoQuantCompras = "Erro!!!";
        }
        return testRemovendoQuantCompras;
    }

}
