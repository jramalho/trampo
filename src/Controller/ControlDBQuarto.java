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
public class ControlDBQuarto {
    public static void insere(Model.ModelQuarto es) throws SQLException {
        try {
            String sql = "INSERT INTO quarto (num_cama,num_acomod,tipo,preco,andar,num_quarto, disponibilidade) VALUES (?, ?, ?, ?, ?, ?, ?)";
            Connection conexao = ControlConecBD.conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, es.num_cam);
            statement.setInt(2, es.num_acomo);
            statement.setString(3,es.tipo_quarto);
            statement.setFloat(4,es.preco_quarto);
            statement.setInt(5, es.andar);
            statement.setInt(6, es.num_quarto);
            statement.setBoolean(7, es.disponibilidade_quarto);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Erro:" + e);

        }

        }
    private ResultSet rs;

public void Atualiza(int cod_quarto, int num_cama, int num_acomod, String tipo, Float preco, int andar, int num_quarto, Boolean disponibilidade) throws SQLException {
        try {
            String sql = "UPDATE quarto SET cod_quarto = ?, num_cama = ?, num_acomod = ?, tipo = ?, preco = ?, andar = ?, num_quarto = ?, disponibilidade = ? WHERE cod_quarto = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, cod_quarto);
            statement.setInt(2, num_cama);
            statement.setInt(3, num_acomod);
            statement.setString(4, tipo);
            statement.setFloat(5, preco);
            statement.setInt(6, andar);
            statement.setInt(7, num_quarto);
            statement.setBoolean(8, disponibilidade);
            statement.setInt(9, cod_quarto);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Erro:" + e);

        }
    }  

    public static void remove(Model.ModelQuarto es) throws SQLException {
        try {
            String sql = "DELETE FROM quarto WHERE num_quarto = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, es.num_quarto);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Erro:" + e);

        }
    }

        public Model.ModelQuarto buscaPeloNumero(int num_quarto) throws SQLException {
        try {
            String sql = "SELECT * FROM quarto WHERE num_quarto = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, num_quarto);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                Model.ModelQuarto f1 = new Model.ModelQuarto();
                f1.setCod_quarto(result.getInt("cod_quarto"));
                f1.setNum_cam(result.getInt("num_cama"));
                f1.setNum_acomo(result.getInt("num_acomod"));
                f1.setTipo_quarto(result.getString("tipo"));
                f1.setPreco_quarto(result.getFloat("preco"));
                f1.setAndar(result.getInt("andar"));
                f1.setNum_quarto(result.getInt("num_quarto"));
                f1.setDisponibilidade_quarto(result.getBoolean("disponibilidade"));
                return f1;
            } else {

                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro:" + e);
            return null;

        }
        }

        public  Model.ModelQuarto buscaPeladisponibilidade(boolean b) throws SQLException {
        try {
            String sql = "SELECT * FROM quarto WHERE disponibilidade = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setBoolean(1, b);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                Model.ModelQuarto f1 = new Model.ModelQuarto();
                f1.setCod_quarto(result.getInt("cod_quarto"));
                f1.setNum_cam(result.getInt("num_cama"));
                f1.setNum_acomo(result.getInt("num_acomod"));
                f1.setTipo_quarto(result.getString("tipo"));
                f1.setPreco_quarto(result.getFloat("preco"));
                f1.setAndar(result.getInt("andar"));
                f1.setNum_quarto(result.getInt("num_quarto"));
                f1.setDisponibilidade_quarto(result.getBoolean("disponibilidade"));
                return f1;
            } else {

                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro:" + e);
            return null;

        }
        }
        public ResultSet FillCombo() throws SQLException{
            String sql="select * from quarto";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            rs = statement.executeQuery();
            return rs;
        }
}
