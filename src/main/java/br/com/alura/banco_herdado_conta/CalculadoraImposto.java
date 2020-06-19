/**
 * Project:
 * Date: 19/06/2020
 * User: phmiranda
 * Description: N/A
 */
package br.com.alura.banco_herdado_conta;

public class CalculadoraImposto {
    private double totalImposto;

    public void registrar(Tributavel tributavel) {
        double valor = tributavel.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
