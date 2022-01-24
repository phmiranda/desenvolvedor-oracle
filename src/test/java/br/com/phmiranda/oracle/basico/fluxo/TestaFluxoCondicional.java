/*
 * Author: Pedro
 * Project: desenvolvedor-oracle-se
 * Task Number: SRC-68
 * Description: AULA 06 - PRATICANDO CONDICIONAIS
 * Date: 21/07/2021
 */

package br.com.phmiranda.oracle.basico.fluxo;

import java.util.Scanner;

// o IF e ELSE verifica se um resultado é VERDADEIRO ou FALSO.
public class TestaFluxoCondicional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite a quantidade de pessoas: ");
        int quantidadePessoas = scanner.nextInt();

        boolean acompanhado = quantidadePessoas >= 2;

        // usando operador condicional: form mais básica de condição.
        if (idade >= 18) {
            System.out.println("VOCÊ TEM 18 ANOS, A SUA ENTRADA FOI AUTORIZADA.");
        } else {
            System.out.println("VOCÊ NÃO TEM MAIS DE 18 ANOS, A SUA ENTRADA NÃO FOI AUTORIZADA.");
        }

        // usando operador condicional: E, as duas condições precisam ser TRUE para ser satisfeitas.
        if (idade >= 18 && acompanhado) {
            System.out.println("VOCÊ TEM 18 ANOS E ESTÁ ACOMPANHADO POR MAIS DE DUAS PESSOAS, A SUA ENTRADA FOI AUTORIZADA.");
        } else {
            System.out.println("VOCÊ NÃO TEM MAIS DE 18 ANOS E NÃO ESTÁ ACOMPANHADO POR MAIS DE DUAS PESSOAS,A SUA ENTRADA NÃO FOI AUTORIZADA.");
        }

        // usando operador condicional: OU, uma das duas condições precisam ser TRUE para ser satisfeitas.
        if (idade >= 18 || acompanhado) {
            System.out.println("VOCÊ TEM 18 ANOS OU ESTÁ ACOMPANHADO POR MAIS DE DUAS PESSOAS, A SUA ENTRADA FOI AUTORIZADA.");

        } else {
            System.out.println("VOCÊ NÃO TEM MAIS DE 18 ANOS OU NÃO ESTÁ ACOMPANHADO POR MAIS DE DUAS PESSOAS, A SUA ENTRADA NÃO FOI AUTORIZADA.");
        }
    }
}
