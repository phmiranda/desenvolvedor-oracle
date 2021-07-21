/*
 * Author: Pedro
 * Project: desenvolvedor-oracle
 * User Story: N/A
 * Description: N/A
 * Date: 19/06/2020
 */

package br.com.phmiranda.oracle.oo.funcionario;

public class AutenticacaoUtil {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Senha autenticada");
            return true;
        }else {
            System.out.println("Problema na autenticação da senha");
            return false;
        }
    }
}
