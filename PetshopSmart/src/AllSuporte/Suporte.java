package AllSuporte;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Suporte {
    private static boolean verificandoTelaMenu;
    private static boolean verificandoLogin = false;

    public static String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static void setMudarStatusAtual(boolean statusTelaAtual) {
        verificandoTelaMenu = statusTelaAtual;
    }

    public static boolean consultarStatusTela (){
        return verificandoTelaMenu;
    }
    
    public static boolean loginRealizado(){
        return verificandoLogin;
    }
    
    public static void setMudarLogin(boolean login){
        verificandoLogin = login;
    }

}