/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClass.Repositorio;

import AllClass.Produto;
import static BancoDeDados.BancoPetshop.BancoListProduto;
import javax.swing.JOptionPane;

public class RepositorioProduto {

    public static int ContProtudo;
    public static Produto exibeProduto;
    public static boolean statusProduto = false;
    public static Produto estoqueProduto;

    public static boolean setCadastroProduto(String nomep, String inforp, String categoria, String valorp, String codigoP, String xquantidade) {
        statusProduto = false;
        try {
            int quantidade = Integer.parseInt(xquantidade);
            Produto Produtos = new Produto(nomep, inforp, categoria, valorp, codigoP, xquantidade);
            BancoListProduto.add(Produtos);
            ContProtudo++;
            statusProduto = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro");
        }
        return statusProduto;
        //Cadastra produto
    }

    public static boolean setEditarProduto(String nomep, String inforp, String categoriap, String valorp, String codigoP, String quantidadep) {
        statusProduto = false;
        Produto p = new Produto();

        try {
            if (!categoriap.equals("") && !nomep.equals("") && !inforp.equals("")){
            int convertCodigoP = Integer.parseInt(codigoP);
            double convertValorP = Double.parseDouble(valorp);
            int convertQuantidadeP = Integer.parseInt(quantidadep);
            
            for (int i = 0; i < BancoListProduto.size(); i++) {
                p = BancoListProduto.get(i);
                if (p.getCodigoP() == convertCodigoP) {
                    p.setNome(nomep);
                    p.setInforP(inforp);
                    p.setCategoriaP(categoriap);
                    p.setValorP(convertValorP);
                    p.setCodigo(convertCodigoP);
                    p.setQuantidade(convertQuantidadeP);
                    BancoListProduto.set(i, p);
                    statusProduto = true;
                }
            }
            }
        } catch (Exception e) {
        }
        return statusProduto;
    }

    public static boolean setRemoverProduto(String cod) {
        statusProduto = false;
        exibeProduto = null;
        Produto p = new Produto();

        try {
            int convertCodigo = Integer.parseInt(cod);
            for (int i = 0; i < BancoListProduto.size(); i++) {
                p = BancoListProduto.get(i);
                if (p.getCodigoP() == convertCodigo) {
                    BancoListProduto.remove(i);
                    statusProduto = true;
                }
            }
        } catch (Exception e) {
        }
        return statusProduto;
    }

    public static boolean getValidarProduto(String xcod) {
        statusProduto = false;
        estoqueProduto = null;
        Produto p = new Produto();
        try {
            int cod = Integer.parseInt(xcod);
            for (int i = 0; i < BancoListProduto.size(); i++) {
                p = BancoListProduto.get(i);
                if (p.getCodigoP() == (cod)) {
                    estoqueProduto = p;
                    statusProduto = true;
                }
            }
        } catch (Exception e) {
        }

        return statusProduto;
        //Verifica se o produto ja existe
    }

    public static boolean getExibirProduto(String cod) {
        statusProduto = false;
        Produto p = new Produto();
        exibeProduto = null;
        try {
            int convertCod = Integer.parseInt(cod);
            for (int i = 0; i < BancoListProduto.size(); i++) {
                p = BancoListProduto.get(i);
                if (p.getCodigoP() == (convertCod)) {
                    exibeProduto = BancoListProduto.get(i);
                    statusProduto = true;
                }
            }
        } catch (Exception e) {
        }

        return statusProduto;
        //Verifica se o produto existe e esta dispinivel para exibicao
    }

    public static boolean getValidarEstoque(String xcod) {
        statusProduto = false;
        Produto p = new Produto();
        exibeProduto = null;
        try {
            int cod = Integer.parseInt(xcod);
            for (int i = 0; i < BancoListProduto.size(); i++) {
                p = BancoListProduto.get(i);
                if (p.getCodigoP() == (cod) && (p.getQuantidade() >= 1)) {
                    exibeProduto = BancoListProduto.get(i);
                    statusProduto = true;
                }
            }
        } catch (Exception e) {
        }

        return statusProduto;
        //Verifica se o produto existe e esta dispinivel para exibicao
    }

    public static boolean getValidarCompra(String xcod, String xquant) {
        statusProduto = false;
        Produto p = new Produto();
        try {
            int cod = Integer.parseInt(xcod);
            int quant = Integer.parseInt(xquant);
            for (int i = 0; i < BancoListProduto.size(); i++) {
                p = BancoListProduto.get(i);
                if (p.getCodigoP() == (cod) && (p.getQuantidade() >= quant)) {
                    statusProduto = true;
                }
            }
        } catch (Exception e) {
        }

        return statusProduto;
        //Verifica se a quantidade desejada possue no estoque
    }

}
