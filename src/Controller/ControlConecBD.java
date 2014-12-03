/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jol
 */
public class ControlConecBD{
     public static Connection conectarBanco() throws SQLException {

        try {
            String url = "jdbc:postgresql://localhost:5432/BMS";

            String usuario = "postgres";
            String senha = "1234";

            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            return conexao;
        } catch (SQLException e) {
            System.out.println("Erro:" + e);
            return null;
        }
        
    }
}