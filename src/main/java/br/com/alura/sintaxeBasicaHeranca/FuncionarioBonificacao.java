/**
 * Project: desenvolvedor
 * Date: 12/06/2020
 * User: phmiranda
 * Descrição:
 */

package br.com.alura.sintaxeBasicaHeranca;

public class FuncionarioBonificacao {
    private double soma;

    // recebe a bonificação referente a cada classe passada no parâmetro, pois ele pega o método específico de bonificação de cada classe.
    public void registra(Funcionario funcionario) {
        this.soma += + funcionario.getBonificacao();
    }

    public double getSoma() {
        return soma;
    }
}
