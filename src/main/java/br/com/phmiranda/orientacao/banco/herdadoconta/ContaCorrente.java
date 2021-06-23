/*
 * Author: Pedro
 * Project: desenvolvedor-oracle
 * User Story: N/A
 * Description: N/A
 * Date: 15/06/2020
 */

package br.com.phmiranda.orientacao.banco.herdadoconta;

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
