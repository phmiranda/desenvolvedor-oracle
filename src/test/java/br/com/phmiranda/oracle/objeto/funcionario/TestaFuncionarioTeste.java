/*
 * Author: Pedro
 * Project: desenvolvedor-oracle
 * User Story: N/A
 * Description: N/A
 * Date: 10/06/2020
 */

package br.com.phmiranda.oracle.objeto.funcionario;

public class TestaFuncionarioTeste {
    public static void main(String[] args) {
        FuncionarioTeste funcionarioTeste = new FuncionarioTeste();

        funcionarioTeste.setNome("");
        funcionarioTeste.setDocumento("");
        funcionarioTeste.setSalario(1500.00);
        funcionarioTeste.setTipo(3);

        System.out.println("O perfil do funcionário é: " + funcionarioTeste.getTipo());
        System.out.println("A bonificação aplicada foi: R$ " + funcionarioTeste.bonificacao());
    }
}
