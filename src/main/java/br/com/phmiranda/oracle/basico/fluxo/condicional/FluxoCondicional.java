/*
 * Author: Pedro
 * Project: desenvolvedor-oracle-se
 * User Story: HU001
 * Description: DESENVOLVEDOR ORACLE SE [PARTE 01]
 * Date: 21/07/2021
 */

package br.com.phmiranda.oracle.basico.fluxo.condicional;

// o IF e ELSE verifica se um resultado é VERDADEIRO ou FALSO.
public class FluxoCondicional {
    public static void main(String[] args) {
        int idade = 18;
        int quantidadePessoas = 1;

        System.out.println("Testando fluxo condicional.");

        if (idade >= 18) {
            System.out.println("VOCÊ TEM MAIS DE 18 ANOS, A SUA ENTRADA FOI AUTORIZADA.");
        }else {
            System.out.println("VOCÊ NÃO TEM MAIS DE 18 ANOS, A SUA ENTRADA NÃO FOI AUTORIZADA.");
        }

        // usando operador condicional: E, as duas condições precisam ser satisfeitas para ser true.
        if (idade >= 18 && quantidadePessoas >= 2) {
            System.out.println("VOCÊ TEM MAIS DE 18 ANOS E ESTÁ ACOMPANHADO, A SUA ENTRADA FOI AUTORIZADA.");
        }else {
            System.out.println("VOCÊ NÃO TEM MAIS DE 18 ANOS E NÃO ESTÁ ACOMPANHADO, A SUA ENTRADA NÃO FOI AUTORIZADA.");
        }

        // usando operador condicional: OU, uma das duas condições precisam ser satisfeitas para ser true.
        if (idade >= 18 || quantidadePessoas >= 2) {
            System.out.println("VOCÊ TEM MAIS DE 18 ANOS OU ESTÁ ACOMPANHADO, A SUA ENTRADA FOI AUTORIZADA.");

        }else {
            System.out.println("VOCÊ NÃO TEM MAIS DE 18 ANOS OU NÃO ESTÁ ACOMPANHADO, A SUA ENTRADA NÃO FOI AUTORIZADA.");
        }
    }
}
