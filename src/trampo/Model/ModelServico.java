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
public class ModelServico {
    private int cod_servico;
    private String tipo_servico;
    private String area_servico;

    public int getCod_servico() {
        return cod_servico;
    }

    public void setCod_servico(int cod_servico) {
        this.cod_servico = cod_servico;
    }

    public String getTipo_servico() {
        return tipo_servico;
    }

    public void setTipo_servico(String tipo_servico) {
        this.tipo_servico = tipo_servico;
    }

    public String getArea_servico() {
        return area_servico;
    }

    public void setArea_servico(String area_servico) {
        this.area_servico = area_servico;
    }
    
}
