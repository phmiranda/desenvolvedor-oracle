/*
 * Author: Pedro
 * Project: desenvolvedor-oracle-se
 * User Story: HUXXX - TITLE OF USER HISTORY
 * Description: N/A
 * Date: 21/07/2021
 */

package br.com.phmiranda.oracle.objeto.banco.conta;

public class TestaConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111,111);
        cc.depositar(100);

        ContaPoupanca cp = new ContaPoupanca(222,222);
        cp.depositar(200);

        cc.transferir(10,cp);

        System.out.println("Conta Corrente (Saldo): " + cc.getSaldo());
        System.out.println("Conta Poupança (Saldo): " + cp.getSaldo());
    }
}
