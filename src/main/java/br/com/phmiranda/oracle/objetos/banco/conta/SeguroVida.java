/**
 * Project: oracle-se
 * Task/User History: 64
 * Description: Descrição resumida da história de usuário/tarefa e código de identificação (GRUPOCDC-64)
 * User: phmiranda
 */

package br.com.phmiranda.oracle.objetos.banco.conta;

public class SeguroVida implements Tributavel {
    @Override
    public double getValorImposto() {
        return 42;
    }
}
