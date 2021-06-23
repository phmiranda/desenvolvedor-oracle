/*
 * Author: Pedro
 * Project: desenvolvedor-oracle
 * User Story: N/A
 * Description: N/A
 * Date: 19/06/2020
 */

package br.com.phmiranda.orientacao.funcionario;

public abstract interface Autenticavel {
    public abstract void setSenha(int senha);
    public abstract boolean autenticar(int senha);
}
