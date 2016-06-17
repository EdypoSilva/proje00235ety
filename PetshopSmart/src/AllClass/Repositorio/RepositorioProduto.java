/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClass.Repositorio;

import AllClass.Produto;
import static BancoDeDados.BancoPetshop.BancoListProduto;

public class RepositorioProduto {

    public static boolean statusProduto = false;

    public static boolean setCadastroProduto(Produto cadProduto) {
        statusProduto = false;
        try {
            BancoListProduto.add(cadProduto);
            statusProduto = true;
        } catch (Exception e) {
           statusProduto = false;
        }
        return statusProduto;
        //Cadastra produto
    }

    public static boolean setEditarProduto(Produto altProduto) {
        statusProduto = false;
        try {
            for (int i = 0; i < BancoListProduto.size(); i++) {
                Produto p = BancoListProduto.get(i);
                if (p.getCodigoP() == altProduto.getCodigoP()) {
                    BancoListProduto.set(i, altProduto);
                    statusProduto = true;
                }
            }
        } catch (Exception e) {
            statusProduto = false;
        }
        return statusProduto;
    }

    public static boolean setRemoverProduto(int codigo) {
        statusProduto = false;
        try {
            for (int i = 0; i < BancoListProduto.size(); i++) {
                Produto p = BancoListProduto.get(i);
                if (p.getCodigoP() == codigo) {
                    BancoListProduto.remove(i);
                    statusProduto = true;
                }
            }
        } catch (Exception e) {
            statusProduto = false;
        }
        return statusProduto;
    }

    public static Produto getExibirProduto(int cod) {
        Produto exibirCODProduto = null;
        try {
            for (int i = 0; i < BancoListProduto.size(); i++) {
                Produto p = BancoListProduto.get(i);
                if (p.getCodigoP() == (cod)) {
                    exibirCODProduto = BancoListProduto.get(i);
                }
            }
        } catch (Exception e) {
            exibirCODProduto = null;
        }

        return exibirCODProduto;
        //Verifica se o produto existe e esta dispinivel para exibicao
    }

    public static boolean getValidarCompra(int cod, int quant) {
        statusProduto = false;
        Produto p = new Produto();
        try {
            for (int i = 0; i < BancoListProduto.size(); i++) {
                p = BancoListProduto.get(i);
                if ((p.getCodigoP() == (cod)) && (p.getQuantidade() >= quant)) {
                    statusProduto = true;
                }
            }
        } catch (Exception e) {
        }

        return statusProduto;
        //Verifica se a quantidade desejada possue no estoque
    }
    
    public static boolean getCODProduto(int codigo){
        boolean testProdutoExiste=false;
        
        for (int i = 0; i < BancoListProduto.size(); i++) {
                Produto testPro = BancoListProduto.get(i);
                if ((testPro.getCodigoP() == (codigo))) {
                    testProdutoExiste = true;
                }
            }
        
        return testProdutoExiste;
    }

}
