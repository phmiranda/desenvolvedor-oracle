/**
 * Project: oracle-se
 * Task/User History: 64
 * Description: Descrição resumida da história de usuário/tarefa e código de identificação (GRUPOCDC-64)
 * User: phmiranda
 */

package br.com.phmiranda.oracle.objetos.funcionario;

public abstract interface Autenticavel {
    public abstract void setSenha(int senha);
    public abstract boolean autenticar(int senha);
}
