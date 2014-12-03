/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.Date;

/**
 *
 * @author Jol
 */
public class ModelHospedagem {
    public String pagamento;
    public Date data_entrada;
    public Date data_saida;
    public float valor_total;
    public int num_hospedes;
    public int cod_funcionario;
    public int cod_quarto;
    public int cod_cliente;

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public Date getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }

    public Date getData_saida() {
        return data_saida;
    }

    public void setData_saida(Date data_saida) {
        this.data_saida = data_saida;
    }

    public float getValor_total() {
        return valor_total;
    }

    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }

    public int getNum_hospedes() {
        return num_hospedes;
    }

    public void setNum_hospedes(int num_hospedes) {
        this.num_hospedes = num_hospedes;
    }

    public int getCod_funcionario() {
        return cod_funcionario;
    }

    public void setCod_funcionario(int cod_funcionario) {
        this.cod_funcionario = cod_funcionario;
    }

    public int getCod_quarto() {
        return cod_quarto;
    }

    public void setCod_quarto(int cod_quarto) {
        this.cod_quarto = cod_quarto;
    }

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

}
