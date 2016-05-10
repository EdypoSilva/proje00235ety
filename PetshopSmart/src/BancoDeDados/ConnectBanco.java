/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ConnectBanco {
    
    private Connection connection;
    private Connection con;
    
    
    public ConnectBanco() {
        con = new ConnectBanco().getConnection();
    }

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(
          "jdbc:mysql://localhost/petshopsmart", "root", "efm070");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
        
    public void setInserirClienteBD(String nome, int cpf, int telefone, double saldo) throws SQLException{
        String sql = "insert into cliente" +
                " (NomeC,Cpf,Telefone,Saldo)" +
                " values (?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        
// preenchendo valores banco
        
    stmt.setString(1, nome);
    stmt.setInt(2, cpf);
    stmt.setInt(3, telefone);
    stmt.setDouble(4, saldo);
    stmt.execute();
    stmt.close();
    
    System.out.println("Cliente Gravado!");
    
    con.close();
    }
    
    public void setInserirAnimalBD(String nome, int idade,String cor, String raca, String sexo, int cpf) throws SQLException{
        
        String sql = "insert into animal" +
                " (NomeA,Idade,Cor,Raca,Sexo,cliente_Cpf)" +
                " values (?,?,?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        
// preenchendo valores banco
        
    stmt.setString(1, nome);
    stmt.setInt(2, idade);
    stmt.setString(3, cor);
    stmt.setString(4, raca);
    stmt.setString(5, sexo);
    stmt.setInt(6,cpf);
    
    stmt.execute();
    stmt.close();
    
    System.out.println("Animal Gravado!");
    
    con.close();   
    }
    
    public void setInserirProdutoBD(){
        
        
    }
    
    public void setInserirUsiarioBD(){
        
        
    }
    
    
    
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
    ConnectBanco TestBanco = new ConnectBanco();
    TestBanco.setInserirClienteBD("Neto", 874445544, 8888899, 0);
    }
}
