/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllControlador;

import AllClass.Produto;
import AllClass.Repositorio.RepositorioProduto;
import javax.swing.JOptionPane;

public class ControladorProduto {

    private static boolean testVariaveis;
    private static String erros;

    public static String validarProduto(Produto cadProduto) {
        testVariaveis = true;
        erros = "Campo * Incorreto *\n";

        if (cadProduto.getNome().equals("")) {
            testVariaveis = false;
            erros += "* Nome";
        }

        if (cadProduto.getInforP().equals("")) {
            testVariaveis = false;
            erros += "* Informação";
        }

        if (cadProduto.getCategoriaP().equals("")) {
            testVariaveis = false;
            erros += "* Categoria";
        }

        if (cadProduto.getValorP() < 0) {
            testVariaveis = false;
            erros += "* Valor Incorreto";
        }

        if (cadProduto.getCodigoP() < 0) {
            testVariaveis = false;
            erros += "* Código Incorreto";
        }

        if (cadProduto.getQuantidade() < 1) {
            testVariaveis = false;
            erros += "* Quantidade Incorreta";
        }

        if (testVariaveis) {
            erros = "1";
        }

        return erros;
    }

    public static String cadastroProduto(Produto cadProduto) {
        String testDados = validarProduto(cadProduto);
        if (testDados.equals("1")) {
            if (!RepositorioProduto.getCODProduto(cadProduto.getCodigoP())) {
                if (RepositorioProduto.setCadastroProduto(cadProduto)) {
                    testDados = "1";
                    JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!!!");
                } else {
                    testDados = "Erro ao tentar cadastrar";
                }
            } else {
                testDados = "* Código Existente";
            }
        }

        return testDados;
    }

    public static String editarProduto(Produto altProduto) {
        String testDados = validarProduto(altProduto);
        if (testDados.equals("1")) {
            if (RepositorioProduto.getCODProduto(altProduto.getCodigoP())) {
                if (RepositorioProduto.setEditarProduto(altProduto)) {
                    JOptionPane.showMessageDialog(null, "Alterado com Sucesso!!!");
                    testDados = "1";
                } else {
                    testDados = "Erro, Não Cadastrado!!!";
                }
            }
        }

        return testDados;
    }

    public static String removerProduto(int codigo) {
        String testRemoverProduto = "1";

        if (RepositorioProduto.setRemoverProduto(codigo)) {
            testRemoverProduto = "1";
            JOptionPane.showMessageDialog(null, "Removido com Sucesso!!!");
        } else {
            testRemoverProduto = "Erro, Não Removido";
        }

        return testRemoverProduto;
    }

    public static Produto exibirProduto(int codigo) {
        Produto exibirProduto = null;
        if (RepositorioProduto.getCODProduto(codigo)) {
            exibirProduto = RepositorioProduto.getExibirProduto(codigo);
        }

        return exibirProduto;
    }

    public static String ExisteCODProduto(int codigo) {
        String testExisteCodProduto = "Nao Existe";

        if (RepositorioProduto.getCODProduto(codigo)) {
            testExisteCodProduto = "1";
        }

        return testExisteCodProduto;
    }

    public static Produto validarEstoque(int codigo) {

        Produto testValidarEstoque = null;

        if (RepositorioProduto.getCODProduto(codigo)) {
            Produto exibirProduto = RepositorioProduto.getExibirProduto(codigo);
            if (exibirProduto.getQuantidade()>=1){
                testValidarEstoque = exibirProduto;
            }else{
                JOptionPane.showMessageDialog(null, "Quantidade Insuficiente no Estoque!!!");
            }
        }

        return testValidarEstoque;
    }

    
    
    
    
}
