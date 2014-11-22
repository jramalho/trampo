/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trampo.Model;

/**
 *
 * @author Jol
 */
public class ModelEstoque {
    private int cod_estoque;
    private String tipo_estoque;
    private int quantidade_estoque;

    public int getCod_estoque() {
        return cod_estoque;
    }

    public void setCod_estoque(int cod_estoque) {
        this.cod_estoque = cod_estoque;
    }

    public String getTipo_estoque() {
        return tipo_estoque;
    }

    public void setTipo_estoque(String tipo_estoque) {
        this.tipo_estoque = tipo_estoque;
    }

    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }
}
