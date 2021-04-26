/**
 * Project:
 * Date: 19/06/2020
 * User: phmiranda
 * Description: classe responsável por realizar a estrutura de autenticação com reutilização de código.
 */

package br.com.phmiranda.sintaxe.funcionario;

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
