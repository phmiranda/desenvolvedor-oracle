/*
 * Author: Pedro
 * Project: desenvolvedor-oracle-se
 * User Story: HU001
 * Description: DESENVOLVEDOR ORACLE SE [PARTE 01]
 * Date: 21/07/2021
 */

package br.com.phmiranda.oracle.basico.sintaxe;

public class PontoFlutuante {
    public static void main(String[] args) {
        double idade;
        double salario;
        double divisao;
        double novaTentativa;
        int outraDivisao;

        idade = 37;
        salario = 1250.75;
        divisao = 3.14 / 2;
        outraDivisao = 5 / 2;
        novaTentativa = 5 / 2;

        System.out.println("Minha idade é: " + idade);
        System.out.println("Meu salário é: " + salario);
        System.out.println("A primeira divisão é: " + divisao);
        System.out.println("A segunda divisão é: " + outraDivisao);
        System.out.println("A nova tentativa é: " + novaTentativa);
    }
}
