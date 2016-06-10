/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllControlador;

import AllClass.Compra;
import AllClass.Repositorio.RepositorioCompra;
import javax.swing.JOptionPane;

public class ControladorCompra {

    public static String comprarProduto(Compra cadCompra) {
        String testCompra = "";
        if (cadCompra != null) {
            if (RepositorioCompra.setCompra(cadCompra)) {
                testCompra = "1";
                JOptionPane.showMessageDialog(null, "Compra Realizada!!!");
            } else {
                testCompra = "Erro, Compra não Cadastrada!!!";
            }
        }
        return testCompra;
    }

    public static String removerCompra(String cpf, int idCompra) {
        String testRemoverCompra = "";
        int resp = JOptionPane.showConfirmDialog(null, "Deseja Remover a Compra?");
        if (resp == 0) {
            if (RepositorioCompra.setRemoverCompra(cpf, idCompra)) {
                testRemoverCompra = "1";
                JOptionPane.showMessageDialog(null, "Compra Removida com Sucesso");
            } else {
                testRemoverCompra = "Erro, Compra não Removida!!!";
            }
        }

        return testRemoverCompra;
    }

    public static String existeCPFCompra(String cpf) {
        String testCPFcompra = "";
        if (RepositorioCompra.getExisteClienteCompra(cpf)) {
            testCPFcompra = "1";
        } else {
            testCPFcompra = "Compra não Existe";
        }
        
        return testCPFcompra;
    }
    
    public static Compra exibirCompra(String cpf, int idCompra){
        
        Compra exibirCompra = RepositorioCompra.getExisteCompra(cpf, idCompra);

        return exibirCompra;
    }
    
    
//FimClass
}
