/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import static Controller.ControlConecBD.conectarBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jol
 */
public class ControlDBEstoque {
    public  void insere(Model.ModelEstoque es) throws SQLException {
        try {
<<<<<<< HEAD
                String sql = "INSERT INTO estoque (cod_estoque,tipo,quantidade) VALUES (?, ?, ?)";
            Connection conexao = ControlConecBD.conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, es.cod_estoque);
            statement.setString(2, es.tipo_estoque);
            statement.setInt(3, es.quantidade_estoque);
=======
                String sql = "INSERT INTO estoque (tipo,quantidade) VALUES (?, ?)";
            Connection conexao = ControlConecBD.conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, es.tipo_estoque);
            statement.setInt(2, es.quantidade_estoque);
>>>>>>> origin/master
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Erro:" + e);

        }

        }
    private ResultSet rs;

public void Atualiza(int cod_estoque, String tipo, int quantidade) throws SQLException {
        try {
            String sql = "UPDATE estoque SET cod_estoque = ?, tipo = ?, quantidade= ? WHERE tipo = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, cod_estoque);
            statement.setString(2, tipo);
            statement.setInt(3, quantidade);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Erro:" + e);

        }
    }
    public  void remove(Model.ModelEstoque es) throws SQLException {
        try {
            String sql = "DELETE FROM estoque WHERE tipo = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, es.tipo_estoque);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Erro:" + e);

        }
    }
        public Model.ModelEstoque buscaPelotipo (String tipo) throws SQLException {
        try {
            String sql = "SELECT * FROM servico WHERE tipo = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, tipo);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                Model.ModelEstoque f1 = new Model.ModelEstoque();
                f1.setCod_estoque(result.getInt("cod_estoque"));
                f1.setTipo_estoque(result.getString("tipo"));
                f1.setQuantidade_estoque(result.getInt("quantidade"));
                return f1;
            } else {

                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro:" + e);
            return null;

        }
        }
<<<<<<< HEAD
        
=======
>>>>>>> origin/master
        public ResultSet FillTable() throws SQLException{
            String sql="select * from estoque";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            rs = statement.executeQuery();
            return rs;
        }

 
}
