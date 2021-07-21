/*
 * Author: Pedro
 * Project: desenvolvedor-oracle-se
 * User Story: HUXXX - TITLE OF USER HISTORY
 * Description: N/A
 * Date: 21/07/2021
 */

package br.com.phmiranda.oracle.oo.funcionario;

public abstract interface Autenticavel {
    public abstract void setSenha(int senha);
    public abstract boolean autenticar(int senha);
}
