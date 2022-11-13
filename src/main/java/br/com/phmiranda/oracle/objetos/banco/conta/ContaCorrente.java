/**
 * Project: oracle-se
 * Task/User History: 64
 * Description: Descrição resumida da história de usuário/tarefa e código de identificação (GRUPOCDC-64)
 * User: phmiranda
 */

package br.com.phmiranda.oracle.objetos.banco.conta;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void depositar(double valor) {
        super.saldo = super.saldo + valor;
    }

    @Override
    public boolean sacar(double valor) {
        double valorSacado = valor + 0.2;
        return super.sacar(valorSacado);
    }

    @Override
    public double getValorImposto() {
        return 0;
    }
}
