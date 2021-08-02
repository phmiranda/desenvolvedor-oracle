/*
 * Author: Pedro
 * Project: desenvolvedor-oracle-se
 * User Story: HUXXX - TITLE OF USER HISTORY
 * Description: N/A
 * Date: 21/07/2021
 */

package br.com.phmiranda.oracle.objeto.banco.conta;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }
}
