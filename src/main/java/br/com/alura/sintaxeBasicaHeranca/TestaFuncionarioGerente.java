/**
 * Project: desenvolvedor
 * Date: 10/06/2020
 * User: phmiranda
 * Descrição: classe de teste da classe GerenteDeConta, onde passar os parâmetros via getters e setters.
 */

package br.com.alura.sintaxeBasicaHeranca;

public class TestaFuncionarioGerente {
    public static void main(String[] args) {
        // instância da classe GerenteDeConta.
        FuncionarioGerente gerente = new FuncionarioGerente();

        // define os valores dos atributos utilizando herança.
        gerente.setNome("Marco");
        gerente.setDocumento("000.000.000-99");
        gerente.setSalario(5000.00);
        gerente.setSenha(2222);

        // defina uma senha passando via parâmetro da função autentica e depois atribuindo a variável autenticou.
        boolean autenticou = gerente.autentica(2222);

        // imprime os atributos que foram definidos acima.
        System.out.println("Nome : " + gerente.getNome());
        System.out.println("Documento :" + gerente.getDocumento());
        System.out.println("Salário: " + gerente.getSalario());
        System.out.println("Senha: " + gerente.getSenha());
        System.out.println("Bonificação: " + gerente.getBonificacao());
        System.out.println("Autenticou: " + autenticou);
    }
}
