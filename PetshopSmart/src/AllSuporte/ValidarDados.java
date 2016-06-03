/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllSuporte;

/**
 *
 * @author Felly
 */
public class ValidarDados {

    private static String cpf;
    private static String telefone;

    private static void removerCaracteres() {
        ValidarDados.cpf = ValidarDados.cpf.replace("-", "");
        ValidarDados.cpf = ValidarDados.cpf.replace(".", "");
    }

    private static boolean verificarSeTamanhoInvalido(String cpf) {
        if (cpf.length() != 11) {
            return true;
        }
        return false;
    }

    private static boolean verificarSeDigIguais(String cpf) {
        //char primDig = cpf.charAt(0);
        char primDig = '0';
        char[] charCpf = cpf.toCharArray();
        for (char c : charCpf) {
            if (c != primDig) {
                return false;
            }
        }
        return true;
    }

    char primDig = '0';
    //char primDig = cpf.charAt(0);

    private static String calculoComCpf(String cpf) {
        int digGerado = 0;
        int mult = cpf.length() + 1;
        char[] charCpf = cpf.toCharArray();
        for (int i = 0; i < cpf.length(); i++) {
            digGerado += (charCpf[i] - 48) * mult--;
        }
        if (digGerado % 11 < 2) {
            digGerado = 0;
        } else {
            digGerado = 11 - digGerado % 11;
        }
        return String.valueOf(digGerado);
    }

    public static boolean validarCpf(String cpf) {
        if (cpf == null) {
            return false;
        } else {
            String cpfGerado = "";
            ValidarDados.cpf = cpf;

            removerCaracteres();
            if (verificarSeTamanhoInvalido(ValidarDados.cpf)) {
                return false;
            }

            if (verificarSeDigIguais(ValidarDados.cpf)) {
                return false;
            }

            cpfGerado = ValidarDados.cpf.substring(0, 9);
            cpfGerado = cpfGerado.concat(calculoComCpf(cpfGerado));
            cpfGerado = cpfGerado.concat(calculoComCpf(cpfGerado));

            if (!cpfGerado.equals(ValidarDados.cpf)) {
                return false;
            }
        }
        return true;
    }
    //Validando - CPF

    //Validando - Telefone
    private static void removerCaracteresTell() {
        ValidarDados.telefone = ValidarDados.telefone.replace("(", "");
        ValidarDados.telefone = ValidarDados.telefone.replace(")", "");
        ValidarDados.telefone = ValidarDados.telefone.replace("-", "");
    }

    private static boolean verificarSeTamanhoTell(String telefone) {
        if (telefone.length() != 10) {
            return true;
        }
        return false;
    }

    public static boolean validarTelefone(String telefone) {
        if (telefone == null) {
            return false;
        } else {
            ValidarDados.telefone = telefone;
            removerCaracteresTell();
            if (verificarSeTamanhoTell(ValidarDados.telefone)) {
                return false;
            }
            
        }
        return true;
    }

}
