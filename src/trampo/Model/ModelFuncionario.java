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
public class ModelFuncionario {
    private int cod_funcionario;
    private String nome_funcionario;
    private String CPF_funcionario;
    private String RG_funcionario;
    private String atuacao;
    private String senha;
    private String username;

    public int getCod_funcionario() {
        return cod_funcionario;
    }

    public void setCod_funcionario(int cod_funcionario) {
        this.cod_funcionario = cod_funcionario;
    }

    public String getNome_funcionario() {
        return nome_funcionario;
    }

    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    public String getCPF_funcionario() {
        return CPF_funcionario;
    }

    public void setCPF_funcionario(String CPF_funcionario) {
        this.CPF_funcionario = CPF_funcionario;
    }

    public String getRG_funcionario() {
        return RG_funcionario;
    }

    public void setRG_funcionario(String RG_funcionario) {
        this.RG_funcionario = RG_funcionario;
    }

    public String getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
}
