/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import static Controller.ControlConecBD.conectarBanco;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jol
 */
public class ControlDBCliente {
          public  void insere(Model.ModelHospede es) throws SQLException {
        try {
            String sql = "INSERT INTO hospede (nome,rg,cpf,tipo,data_nasc) VALUES (?, ?, ?, ?, ?)";
            Connection conexao = ControlConecBD.conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, es.nome_cliente);
            statement.setString(2,es.RG_cliente);
            statement.setString(3, es.CPF_cliente);
            statement.setString(4,es.tipo_cliente);
            statement.setDate(5, es.data_nasc_cliente);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Erro:" + e);

        }

        }

public void Atualiza(int cod_cliente, String nome, String rg, String cpf, String tipo, Date data_nasc) throws SQLException {
        try {
            String sql = "UPDATE hospede SET  cod_cliente = ?, nome = ?, rg = ?, cpf= ?, tipo = ?, data_nasc = ? WHERE cod_cliente = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, cod_cliente);
            statement.setString(2, nome);
            statement.setString(3, rg);
            statement.setString(4, cpf);
            statement.setString(5, tipo);
            statement.setDate(6, data_nasc);
            statement.setInt(7, cod_cliente);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Erro:" + e);

        }
    }
    public  void remove(Model.ModelHospede es) throws SQLException {
        try {
            String sql = "DELETE FROM hospede WHERE nome = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, es.nome_cliente);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Erro:" + e);

        }
    }
        public  Model.ModelHospede buscaPeloNome(String nome) throws SQLException {
        try {
            String sql = "SELECT * FROM hospede WHERE nome = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, nome);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                Model.ModelHospede f1 = new Model.ModelHospede();
                f1.setCod_cliente(result.getInt("cod_cliente"));
                f1.setNome_cliente(result.getString("nome"));
                f1.setRG_cliente(result.getString("rg"));
                f1.setCPF_cliente(result.getString("cpf"));
                f1.setTipo_cliente(result.getString("tipo"));
                f1.setData_nasc_cliente(result.getDate("data_nasc"));
                return f1;
            } else {

                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro:" + e);
            return null;

        }
        }
        public  Model.ModelHospede buscaPeloCPF(String cpf) throws SQLException {
        try {
            String sql = "SELECT * FROM hospede WHERE cpf = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, cpf);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                Model.ModelHospede f1 = new Model.ModelHospede();
                f1.setCod_cliente(result.getInt("cod_cliente"));
                f1.setNome_cliente(result.getString("nome"));
                f1.setRG_cliente(result.getString("rg"));
                f1.setCPF_cliente(result.getString("cpf"));
                f1.setTipo_cliente(result.getString("tipo"));
                f1.setData_nasc_cliente(result.getDate("data_nasc"));
                return f1;
            } else {

                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro:" + e);
            return null;

        }
        }
       

}

