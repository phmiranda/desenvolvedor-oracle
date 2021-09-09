/*
 * Author: Pedro
 * Project: desenvolvedor-oracle-se
 * User Story: HUXXX - TITLE OF USER HISTORY
 * Description: N/A
 * Date: 21/07/2021
 */

package br.com.phmiranda.oracle.objeto.banco.conta;

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
