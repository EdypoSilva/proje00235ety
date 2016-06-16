/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllControlador;

import AllSuporte.Suporte;
import AllTelas.TelaMenu;
import javax.swing.JOptionPane;

public class ControladorSuporte {

    public static String dateTime() {

        String dataHora = Suporte.getDateTime();

        return dataHora;
    }

    public static boolean consultarStatusTelas() {
        boolean statusAtual = Suporte.consultarStatusTela();
        return statusAtual;
    }

    public static void mudarTelaStatus(boolean statusAtual) {
        Suporte.setMudarStatusAtual(statusAtual);
    }

    public static boolean consultarLogin() {
        boolean statusAtual = Suporte.loginRealizado();
        return statusAtual;
    }

    public static void liberarTelaLogin(boolean libera) {
        Suporte.setMudarLogin(libera);
    }

    public static boolean fazerLogin(String nome, String senha) {
        boolean statusLogin = false;
        boolean ativar;

        if (AllClass.Usuario.setUsuario(nome, senha)) {
            ativar = true;
            liberarTelaLogin(ativar);
            statusLogin = true;
            JOptionPane.showMessageDialog(null, "Bem Vindo!");
            new TelaMenu().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Login Incorreto!!!");
            ativar = false;
            statusLogin = false;
            liberarTelaLogin(ativar);
        }
        return statusLogin;
    }

}
