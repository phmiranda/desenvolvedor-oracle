/**
 * Project: desenvolvedor
 * Date: 12/06/2020
 * User: phmiranda
 * Descrição:
 */

package br.com.alura.sintaxeBasicaHeranca;

public class FuncionarioEditorVideo extends Funcionario {
    public double getBonificacao() {
        System.out.println("Bonificação: EDITOR DE VIDEO");
        return super.getBonificacao() + 100;
    }
}
