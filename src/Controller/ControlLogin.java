/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

/**
 *
 * @author Jol
 */
public class ControlLogin {
    public String gerarUsername(String nome){
        String username;       
        username = String.valueOf(nome.charAt(0))+String.valueOf(nome.charAt(1))+String.valueOf(nome.charAt(2))+String.valueOf(nome.charAt(3))+String.valueOf(nome.charAt(4))+String.valueOf(nome.charAt(5))+String.valueOf(nome.charAt(6))+String.valueOf(nome.charAt(7));
        return username;
    }
    public String gerarSenha(){
        String senha = "2014";
        return senha;
    }
}
