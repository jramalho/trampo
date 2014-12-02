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
public class ControlDBHospedagem {
        public void insere(Model.ModelHospedagem es) throws SQLException {
        try {
            String sql = "INSERT INTO hospedagem (pagamento,data_entrada,data_saida,valor_total,num_hospedes,cod_funcionario,cod_quarto,cod_cliente) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            Connection conexao = ControlConecBD.conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, es.pagamento);
            statement.setDate(2, (Date) es.data_entrada);
            statement.setDate(3, (Date) es.data_saida);
            statement.setFloat(4, es.valor_total);
            statement.setInt(5, es.num_hospedes);
            statement.setInt(6, es.cod_funcionario);
            statement.setInt(7, es.cod_quarto);
            statement.setInt(8, es.cod_cliente);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Erro:" + e);

        }

        }

public void Atualiza(String pagamento, Date data_entrada, Date data_saida, float valor_total, int num_hospedes, int cod_funcionario, int cod_quarto, int cod_cliente) throws SQLException {
        try {
            String sql = "UPDATE hospedagem SET pagamento = ?, data_entrada=?, data_saida=?, valor_total=?, num_hospedes=?, cod_funcionario=?, cod_quarto=?, cod_cliente=? WHERE cod_cliente = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, pagamento);
            statement.setDate(2,data_entrada);
            statement.setDate(3,data_saida);
            statement.setFloat(4,valor_total);
            statement.setInt(5,num_hospedes);
            statement.setInt(6,cod_funcionario);
            statement.setInt(7,cod_quarto);
            statement.setInt(8,cod_cliente);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Erro:" + e);

        }
    }


    public static void remove(Model.ModelHospedagem es) throws SQLException {
        try {
            String sql = "DELETE FROM hospedagem WHERE cod_cliente = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, es.cod_cliente);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Erro:" + e);

        }
    }

        public static Model.ModelHospedagem buscaPeloRegistro(int cod_cliente) throws SQLException {
        try {
            String sql = "SELECT * FROM hospedagem WHERE cod_cliente = ?";
            Connection conexao = conectarBanco();
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, cod_cliente);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                Model.ModelHospedagem f1 = new Model.ModelHospedagem();
                f1.setPagamento(result.getString("pagamento"));
                f1.setData_entrada(result.getDate("data_entrada"));
                f1.setData_saida(result.getDate("data_saida"));
                f1.setValor_total(result.getFloat("valor_total"));
                f1.setNum_hospedes(result.getInt("num_hospedes"));
                f1.setCod_funcionario(result.getInt("cod_funcionario"));
                f1.setCod_quarto(result.getInt("cod_quarto"));
                f1.setCod_cliente(result.getInt("cod_cliente"));
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
