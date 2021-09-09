/*
 * Author: Pedro
 * Project: desenvolvedor-oracle-se
 * User Story: HUXXX - TITLE OF USER HISTORY
 * Description: N/A
 * Date: 21/07/2021
 */

package br.com.phmiranda.oracle.objeto.banco.conta;

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
