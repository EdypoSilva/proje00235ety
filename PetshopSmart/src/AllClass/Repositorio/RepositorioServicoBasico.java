/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClass.Repositorio;
import AllClass.ServicoBasico;


public class RepositorioServicoBasico {
public static int ContServicoBasico;


public static void SetBancoServicoBasico(String nomeS, String inforS, String valorS, String codigoS){
    ServicoBasico ServicoBasicos = new ServicoBasico (nomeS, inforS, valorS, codigoS);
    BancoDeDados.BancoPetshop.BancoServicoBasico[ContServicoBasico] = ServicoBasicos;
    ContServicoBasico++;
}


    
}
