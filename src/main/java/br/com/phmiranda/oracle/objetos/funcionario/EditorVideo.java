/**
 * Project: oracle-se
 * Task/User History: 64
 * Description: Descrição resumida da história de usuário/tarefa e código de identificação (GRUPOCDC-64)
 * User: phmiranda
 */


package br.com.phmiranda.oracle.objetos.funcionario;

public class EditorVideo extends Funcionario {
    public double getBonificacao() {
        System.out.println("Bonificação: EDITOR DE VIDEO");
        return 150;
    }
}
