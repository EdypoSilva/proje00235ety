/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClass;

import AllTelas.TelaLogin;
import AllTelas.TelaMenu;
import javax.swing.JOptionPane;

/**
 *
 * @author Felly
 */
public class Usuario {
    
    String nome = "123";
    String senha = "123";
    boolean Status;
    

public void setUsuario(String nome, String Senha, boolean status){
    
    if ((this.nome.equals(nome)) && (this.senha.equals(Senha))){
            JOptionPane.showMessageDialog(null,"Login Efetuado com Sucesso");
            Status = false;
            
            
            new TelaMenu().setVisible(true);
            
        }
        else {
          
           JOptionPane.showMessageDialog(null,"Nome ou senha, incorreto!!! ");
        }
    
}    
}