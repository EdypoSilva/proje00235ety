package BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConectaBd {

    public static Connection conectabd() throws ClassNotFoundException {

        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/";
            String usuario = "postgres";
            String senha = "efm070";
            Connection con = null;
            con = DriverManager.getConnection(url, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso.");
            return con;

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, error);
            return null;
        }
    }
}
