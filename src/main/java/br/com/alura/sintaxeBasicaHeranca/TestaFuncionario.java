/**
 * Project: desenvolvedor
 * Date: 10/06/2020
 * User: phmiranda
 * Descrição:
 */

package br.com.alura.sintaxeBasicaHeranca;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Nico Steppat");
        funcionario.setDocumento("000.000.000-00");
        funcionario.setSalario(2600.00);

        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Documento: " + funcionario.getDocumento());
        System.out.println("Valor do salário: " + funcionario.getSalario());
        System.out.println("Valor da bonificação: " + funcionario.bonificacao());
    }
}
