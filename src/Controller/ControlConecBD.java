/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jol
 */
public class ControlConecBD implements DAO.DAO{
     public Connection conectarBanco() throws SQLException {

        try {
            String url = "jdbc:postgresql://localhost:5432/exemploBanco";

            String usuario = "postgres";
            String senha = "root";

            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conectado!");
            return conexao;
        } catch (SQLException e) {
            System.out.println("Erro:" + e);
            return null;
        }
        
    }
}
 /*       public void insere(Estudante es) throws SQLException {
        try {
            String sql = "INSERT INTO Estudante (nome, idade, registro) VALUES (?, ?, ?)";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, es.nome);
            statement.setInt(2, es.idade);
            statement.setString(3, es.registro);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Erro:" + e);

        }

    }

    @Override
    public void Atualiza(String Nome, String registro, int idade) throws SQLException {
        try {
//            String sql = "UPDATE Estudante SET nome = ?, idade = ? WHERE registro = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, Nome);
            statement.setInt(2, idade);
            statement.setString(3, registro);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Erro:" + e);

        }
    }

    public void remove(Estudante es) throws SQLException {
        try {
  //          String sql = "DELETE FROM Estudante WHERE registro = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, es.registro);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Erro:" + e);

        }
    }

    @Override
    public Estudante buscaPeloRegistro(String registro) throws SQLException {
        try {
            String sql = "SELECT * FROM Estudante WHERE registro = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, registro);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                Estudante estudanteBean = new Estudante();
                estudanteBean.setRegistro(result.getString("Registro"));
                estudanteBean.setNome(result.getString("nome"));
                estudanteBean.setIdade(result.getInt("Idade"));
                return estudanteBean;
            } else {

                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro:" + e);
            return null;

        }
    }

   
}
*/