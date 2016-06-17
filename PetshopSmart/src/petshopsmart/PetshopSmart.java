/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshopsmart;

import AllClass.Animal;
import AllClass.Cliente;
import AllClass.Produto;
import AllClass.Repositorio.RepositorioAnimal;
import AllClass.Repositorio.RepositorioCliente;
import AllClass.Repositorio.RepositorioProduto;
import AllClass.Repositorio.RepositorioServicoBasico;
import AllClass.ServicoBasico;
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
        Cliente cliA = new Cliente("Maxuel", "222.222.222-22", "(81)2222-2222", "Homem");
        Cliente cliB = new Cliente("Fernanda", "111.111.111-11", "(81)1111-1111", "Mulher");
        Produto proA = new Produto("Bola JX", "New Bola SUP", "Adulto", 100, 111, 10);
        ServicoBasico serv1 = new ServicoBasico("Banho", "Feito por profissionais qualificados e com produtos próprios para animais", 40, 100);
        ServicoBasico serv2 = new ServicoBasico("Hidratação", "Manter a pelagem do seu amiguinho sempre bonita e sedosa. Feita juntamente com a devida escovação.", 30, 200);
        ServicoBasico serv3 = new ServicoBasico("Banho + Tosa", "Todas feitas por profissionais capacitados, buscando sempre garantir o conforto e bem estar do seu amiguinho. Todas as tosas incluem o banho.", 80, 300);
        ServicoBasico serv4 = new ServicoBasico("Banho + Hidratação", "Banho + Manter a pelagem do seu amiguinho sempre bonita e sedosa. Feita juntamente com a devida escovação.", 70, 400);
        ServicoBasico serv5 = new ServicoBasico("Consulta Veterinário", "Oferecemos atendimento de qualidade para seu animal através de avaliação clínica completa e rigorosa.", 120, 500);
        
        
        RepositorioCliente.setCadastroCliente(cliA);
        RepositorioCliente.setCadastroCliente(cliB);
        RepositorioAnimal.setCadastroAnimal(a);
        RepositorioAnimal.setCadastroAnimal(b);
        RepositorioAnimal.setCadastroAnimal(c);
        RepositorioAnimal.setCadastroAnimal(d);
        RepositorioProduto.setCadastroProduto(proA);
        RepositorioServicoBasico.setCadServico(serv1);
        RepositorioServicoBasico.setCadServico(serv2);
        RepositorioServicoBasico.setCadServico(serv3);
        RepositorioServicoBasico.setCadServico(serv4);
        RepositorioServicoBasico.setCadServico(serv5);
    }
}
