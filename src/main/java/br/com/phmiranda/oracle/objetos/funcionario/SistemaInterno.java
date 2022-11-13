/**
 * Project: oracle-se
 * Task/User History: 64
 * Description: Descrição resumida da história de usuário/tarefa e código de identificação (GRUPOCDC-64)
 * User: phmiranda
 */

package br.com.phmiranda.oracle.objetos.funcionario;

public class SistemaInterno {
    private int senha = 2222;

    public void autentica(Autenticavel autenticavel) {
        boolean autenticou = autenticavel.autenticar(this.senha);
        if (autenticou) {
            System.out.println("Pode entrar no sistema.");
        } else {
            System.out.println("Não pode entrar no sistema.");
        }
    }
}
