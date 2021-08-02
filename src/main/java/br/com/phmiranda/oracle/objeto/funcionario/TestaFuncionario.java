/*
 * Author: Pedro
 * Project: desenvolvedor-oracle
 * User Story: N/A
 * Description: N/A
 * Date: 10/06/2020
 */

package br.com.phmiranda.oracle.objeto.funcionario;

public class TestaFuncionario {
    public static void main(String[] args) {
        // instância da classe GerenteDeConta.
        Funcionario funcionario = new Gerente();

        // define os valores dos atributos.
        funcionario.setNome("Nico Steppat");
        funcionario.setDocumento("000.000.000-00");
        funcionario.setSalario(2600.00);

        // imprime os atributos que foram definidos acima.
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Documento: " + funcionario.getDocumento());
        System.out.println("Valor do salário: " + funcionario.getSalario());
        System.out.println("Valor da bonificação: " + funcionario.getBonificacao());
    }
}
