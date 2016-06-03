/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshopsmart;

import AllClass.Repositorio.RepositorioAnimal;
import AllClass.Repositorio.RepositorioCliente;
import AllClass.Repositorio.RepositorioProduto;
import AllTelas.TelaLogin;
import javax.swing.UnsupportedLookAndFeelException;

public class PetshopSmart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        // TODO code application logic here

        new TelaLogin().setVisible(true);

        RepositorioCliente.setCadastroCliente("Edypo", "082.660.874-40", "8111111111", "Homem");
        RepositorioCliente.setCadastroCliente("Gleyci", "111.111.111-11", "8111111111", "Mulher");
        RepositorioAnimal.setCadastroAnimal("AAAAA", "10", "Preto", "AAAAA", "Macho", "082.660.874-40");
        RepositorioAnimal.setCadastroAnimal("AAAXX", "10", "Preto", "AAAXX", "Macho", "082.660.874-40");
        RepositorioAnimal.setCadastroAnimal("BBBBB", "5", "Branca", "BBBBB", "Femea", "111.111.111-11");
        RepositorioAnimal.setCadastroAnimal("BBBXX", "5", "Branca", "BBBXX", "Femea", "111.111.111-11");
        RepositorioProduto.setCadastroProduto("Bola JX", "New Bola SUP", "Adulto", "100", "111", "10");
        
    }
}
