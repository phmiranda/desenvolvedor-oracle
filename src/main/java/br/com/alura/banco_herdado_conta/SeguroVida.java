/**
 * Project: banco
 * Date: 19/06/2020
 * User: phmiranda
 * Description: N/A
 */

package br.com.alura.banco_herdado_conta;

public class SeguroVida implements Tributavel {
    @Override
    public double getValorImposto() {
        return 42;
    }
}
