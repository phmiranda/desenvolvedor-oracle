/**
 * Project: desenvolvedor
 * Date: 15/06/2020
 * User: phmiranda
 * Descrição:
 */

package br.com.alura.sintaxeBasicaHeranca;

public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean sacar(double valor) {
        double valorSacado = valor + 0.2;
        return super.sacar(valorSacado);
    }
}
