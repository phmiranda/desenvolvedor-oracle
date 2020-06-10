/**
 * Project: desenvolvedor
 * Date: 10/06/2020
 * User: phmiranda
 * Descrição:
 */

package br.com.alura.sintaxeBasicaHeranca;

public class TestaGerente {
    public static void main(String[] args) {
        GerenteDeConta gerente = new GerenteDeConta();
        gerente.setNome("Marco");
        gerente.setDocumento("000.000.000-99");
        gerente.setSalario(6000.00);
        gerente.setSenha(2222);

        boolean autenticou = gerente.autentica(2222);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getDocumento());
        System.out.println(gerente.getSalario());
        System.out.println(gerente.getSenha());
        System.out.println(autenticou);
    }
}
