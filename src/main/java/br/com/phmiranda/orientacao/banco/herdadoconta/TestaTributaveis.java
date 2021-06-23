/*
 * Author: Pedro
 * Project: desenvolvedor-oracle
 * User Story: N/A
 * Description: N/A
 * Date: 19/06/2020
 */

package br.com.phmiranda.orientacao.banco.herdadoconta;

public class TestaTributaveis {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(222,333);
        contaCorrente.depositar(100.0);

        SeguroVida seguroVida = new SeguroVida();
        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
        calculadoraImposto.registrar(contaCorrente);
        calculadoraImposto.registrar(seguroVida);

        System.out.println(calculadoraImposto.getTotalImposto());
    }
}
