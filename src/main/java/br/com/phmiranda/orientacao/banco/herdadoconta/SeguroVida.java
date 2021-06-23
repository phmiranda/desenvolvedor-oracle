/*
 * Author: Pedro
 * Project: desenvolvedor-oracle
 * User Story: N/A
 * Description: N/A
 * Date: 19/06/2020
 */

package br.com.phmiranda.orientacao.banco.herdadoconta;

public class SeguroVida implements Tributavel {
    @Override
    public double getValorImposto() {
        return 42;
    }
}
