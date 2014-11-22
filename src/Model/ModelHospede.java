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
public class ModelHospede {
    private int cod_cliente;
    private String nome_cliente;
    private String RG_cliente;
    private String CPF_cliente;
    private String tipo_cliente;
    private Date data_nasc_cliente;

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getRG_cliente() {
        return RG_cliente;
    }

    public void setRG_cliente(String RG_cliente) {
        this.RG_cliente = RG_cliente;
    }

    public String getCPF_cliente() {
        return CPF_cliente;
    }

    public void setCPF_cliente(String CPF_cliente) {
        this.CPF_cliente = CPF_cliente;
    }

    public String getTipo_cliente() {
        return tipo_cliente;
    }

    public void setTipo_cliente(String tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    public Date getData_nasc_cliente() {
        return data_nasc_cliente;
    }

    public void setData_nasc_cliente(Date data_nasc_cliente) {
        this.data_nasc_cliente = data_nasc_cliente;
    }

 
}
