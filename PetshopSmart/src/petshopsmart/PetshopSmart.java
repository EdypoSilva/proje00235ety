/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshopsmart;

import AllClass.Animal;
import AllClass.Cliente;
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

        
        Animal a = new Animal("AAAAA", 10, "Preto", "AAAAA", "Macho", "082.660.874-40",0);
        Animal b = new Animal("ABBBA", 10, "Preto", "AAAXX", "Macho", "082.660.874-40",1);
        Animal c = new Animal("CCCCC", 5, "Preto", "AAAAA", "Macho", "111.111.111-11",2);
        Animal d = new Animal("CDDDC", 5, "Preto", "AAAAA", "Macho", "111.111.111-11",3);
        Cliente CliA = new Cliente("Edypo", "082.660.874-40", "(81)1111-1111", "Homem");
        Cliente CliB = new Cliente("Gleyci", "111.111.111-11", "(81)1111-1111", "Mulher");
        
        RepositorioCliente.setCadastroCliente(CliA);
        RepositorioCliente.setCadastroCliente(CliB);
        RepositorioAnimal.setCadastroAnimal(a);
        RepositorioAnimal.setCadastroAnimal(b);
        RepositorioAnimal.setCadastroAnimal(c);
        RepositorioAnimal.setCadastroAnimal(d);
        RepositorioProduto.setCadastroProduto("Bola JX", "New Bola SUP", "Adulto", "100", "111", "10");
        
    }
}
