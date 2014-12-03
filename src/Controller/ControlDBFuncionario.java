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
public class ControlDBFuncionario {
    public  void insere(Model.ModelFuncionario es) throws SQLException {
        try {
            String sql = "INSERT INTO funcionario (nome,cpf,rg,atuacao,senha,username) VALUES (?, ?, ?, ?, ?, ?)";
            Connection conexao = ControlConecBD.conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, es.nome_funcionario);
            statement.setString(2, es.CPF_funcionario);
            statement.setString(3,es.RG_funcionario);
            statement.setString(4,es.atuacao);
            statement.setString(5, es.senha);
            statement.setString(6, es.username);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Erro:" + e);

        }

        }

 public void Atualiza(String nome, String cpf, String rg,  String atuacao, String senha, String username) throws SQLException {
        try {
            String sql = "UPDATE funcionario SET nome = ?, cpf= ?, rg = ?, atuacao = ?, senha = ?, username = ? WHERE nome = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, nome);
            statement.setString(2, cpf);
            statement.setString(3, rg);
            statement.setString(4, atuacao);
            statement.setString(5, senha);
            statement.setString(6, username);
            statement.setString(7, nome);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Erro:" + e);

        }
    }

    public static void remove(Model.ModelFuncionario es) throws SQLException {
        try {
            String sql = "DELETE FROM funcionario WHERE nome = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, es.nome_funcionario);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Erro:" + e);

        }
    }
        public static Model.ModelFuncionario buscaLogin(String username) throws SQLException {
        try {
            String sql = "SELECT * FROM funcionario WHERE username = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, username);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                Model.ModelFuncionario f1 = new Model.ModelFuncionario();
                f1.setCod_funcionario(result.getInt("cod_funcionario"));
                f1.setNome_funcionario(result.getString("Nome"));
                f1.setCPF_funcionario(result.getString("CPF"));
                f1.setRG_funcionario(result.getString("RG"));
                f1.setAtuacao(result.getString("atuacao"));
                f1.setSenha(result.getString("senha"));
                f1.setUsername(result.getString("username"));
                return f1;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro:" + e);
            return null;

        }
        }

        public  Model.ModelFuncionario buscaCod(int cod_func) throws SQLException {
        try {
            String sql = "SELECT * FROM funcionario WHERE cod_funcionario = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, cod_func);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                Model.ModelFuncionario f1 = new Model.ModelFuncionario();
                f1.setCod_funcionario(result.getInt("cod_funcionario"));
                f1.setNome_funcionario(result.getString("Nome"));
                f1.setCPF_funcionario(result.getString("CPF"));
                f1.setRG_funcionario(result.getString("RG"));
                f1.setAtuacao(result.getString("atuacao"));
                f1.setSenha(result.getString("senha"));
                f1.setUsername(result.getString("username"));
                return f1;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro:" + e);
            return null;

        }
        }

        public Model.ModelFuncionario buscaNome(String nome) throws SQLException {
        try {
            String sql = "SELECT * FROM funcionario WHERE nome = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, nome);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                Model.ModelFuncionario f1 = new Model.ModelFuncionario();
                f1.setCod_funcionario(result.getInt("cod_funcionario"));
                f1.setNome_funcionario(result.getString("nome"));
                f1.setCPF_funcionario(result.getString("cpf"));
                f1.setRG_funcionario(result.getString("rg"));
                f1.setAtuacao(result.getString("atuacao"));
                f1.setSenha(result.getString("senha"));
                f1.setUsername(result.getString("username"));
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


