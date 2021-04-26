/**
 * Project: desenvolvedor
 * Date: 19/06/2020
 * User: phmiranda
 * Description: classe responsável por assinar um contrato com quem for implementar essa interface.
 */

package br.com.phmiranda.sintaxe.funcionario;

public abstract interface Autenticavel {
    public abstract void setSenha(int senha);
    public abstract boolean autenticar(int senha);
}
