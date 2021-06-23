/*
 * Author: Pedro
 * Project: desenvolvedor-oracle
 * User Story: N/A
 * Description: N/A
 * Date: 15/06/2020
 */

package br.com.phmiranda.orientacao.banco.herdadoconta;

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
