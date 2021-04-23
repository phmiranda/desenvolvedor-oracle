/**
 * Project: desenvolvedor
 * Date: 15/06/2020
 * User: phmiranda
 * Descrição:
 */

package br.com.phmiranda.banco.herdadoconta;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }
}
