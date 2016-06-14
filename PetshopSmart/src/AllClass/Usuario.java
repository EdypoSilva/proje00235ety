/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClass;

/**
 *
 * @author Felly
 */
public class Usuario {

    private static String nome = "123";
    private static String senha = "123";

    public static boolean setUsuario(String nome, String senha) {
        boolean statusLogin = false;
        if ((Usuario.nome.equals(nome)) && (Usuario.senha.equals(senha))) {
            statusLogin = true;
        } else {
            statusLogin = false;
        }
        return statusLogin;
    }

}
