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
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Jol
 */
public class ControlDBServico {
          public void insere(Model.ModelServico es) throws SQLException {
        try {
                String sql = "INSERT INTO servico (tipo,area,cod_funcionario,cod_estoque) VALUES (?, ?, ?, ?)";
            Connection conexao = ControlConecBD.conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, es.tipo_servico);
            statement.setString(2, es.area_servico);
            statement.setInt(3, es.codfunc);
            statement.setInt(4, es.codestoque);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Erro:" + e);

        }

        }
    private ResultSet rs;

    public void Atualiza(int cod_servico, String tipo, String area, int cod_funcionario, int cod_estoque) throws SQLException {
        try {
            String sql = "UPDATE servico SET cod_servico = ?, tipo = ?, area= ?, cod_funcionario, cod_estoque WHERE tipo = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, cod_servico);
            statement.setString(2, tipo);
            statement.setString(3, area);
            statement.setInt(4, cod_funcionario);
            statement.setInt(5, cod_estoque);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Erro:" + e);
        }
    }
    public void remove(Model.ModelServico es) throws SQLException {
        try {
            String sql = "DELETE FROM servico WHERE tipo = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, es.tipo_servico);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Erro:" + e);

        }
    }
        public Model.ModelServico buscaPelaArea(String area) throws SQLException {
        try {
            String sql = "SELECT * FROM servico WHERE area = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, area);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                Model.ModelServico f1 = new Model.ModelServico();
                f1.setCod_servico(result.getInt("cod_servico"));
                f1.setTipo_servico(result.getString("tipo"));
                f1.setArea_servico(result.getString("area"));
                f1.setCodfunc(result.getInt("cod_funcionario"));
                f1.setCodestoque(result.getInt("code_estoque"));
                return f1;
            } else {

                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro:" + e);
            return null;

        }
        }
        public ResultSet FillTable() throws SQLException{
            String sql="select * from servico";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            rs = statement.executeQuery();
            return rs;
        }

}

