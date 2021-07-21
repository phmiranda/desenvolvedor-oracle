/*
 * Author: Pedro
 * Project: desenvolvedor-oracle
 * User Story: N/A
 * Description: N/A
 * Date: 19/06/2020
 */

package br.com.phmiranda.oracle.oo.funcionario;

public class Cliente implements Autenticavel {
    private AutenticacaoUtil autenticador;

    public Cliente(){
       this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autenticar(int senha) {
        return this.autenticador.autentica(senha);
    }
}
