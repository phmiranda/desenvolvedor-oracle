/*
 * Author: Pedro
 * Project: desenvolvedor-oracle
 * User Story: N/A
 * Description: N/A
 * Date: 10/06/2020
 */

package br.com.phmiranda.orientacao.funcionario;

public class TestaGerente {
    public static void main(String[] args) {
        // instância da classe GerenteDeConta.
        Gerente gerente = new Gerente();

        // define os valores dos atributos utilizando herança.
        gerente.setNome("Marco");
        gerente.setDocumento("000.000.000-99");
        gerente.setSalario(5000.00);
        gerente.setSenha(2222);

        // defina uma senha passando via parâmetro da função autentica e depois atribuindo a variável autenticou.
        boolean autenticou = gerente.autenticar(2222);

        // imprime os atributos que foram definidos acima.
        System.out.println("Nome : " + gerente.getNome());
        System.out.println("Documento :" + gerente.getDocumento());
        System.out.println("Salário: " + gerente.getSalario());
        System.out.println("Bonificação: " + gerente.getBonificacao());
        System.out.println("Autenticou: " + autenticou);
    }
}
