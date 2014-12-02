/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author Jol
 */
public class ModelServico {
    public int codfunc;
    public int cod_servico;
    public String tipo_servico;
    public String area_servico;
    public int codestoque;
    

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

    public int getCodfunc() {
        return codfunc;
    }

    public void setCodfunc(int codfunc) {
        this.codfunc = codfunc;
    }
    public int getCodestoque(){
        return codestoque;
    }
    public void setCodestoque(int codestoque){
        this.codestoque=codestoque;
    }
}
