/**
 * Project: oracle-se
 * Task/User History: 64
 * Description: Descrição resumida da história de usuário/tarefa e código de identificação (GRUPOCDC-64)
 * User: phmiranda
 */

package br.com.phmiranda.oracle.backup.banco.conta;

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
