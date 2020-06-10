/**
 * Project: desenvolvedor
 * Date: 09/06/2020
 * User: phmiranda
 * Descrição:
 */

package br.com.alura.sintaxeBasicaFluxo;

public class TestaFluxoCondicional {
    public static void main(String[] args) {
        int idade = 18;
        int quantidadePessoas = 1;

        System.out.println("Testando fluxo condicional.");

        // fluxo condicional com IF e ELSE.
        if (idade >= 18) {
            System.out.println("Você tem mais de 18 anos, então sua entrada foi permitida.");
        }else {
            System.out.println("Você não tem mais de 18 anos, sua entrada foi probibida.");
        }

        // usando operador condicional: E, as duas condições precisam ser satisfeitas para ser true.
        if (idade >= 18 && quantidadePessoas >= 2) {
            System.out.println("Você tem mais de 18 anos e está acompanhado,a sua entrada foi permitida.");
        }else {
            System.out.println("Você não tem mais de 18 anos e não está acompanhado, sua entrada foi probibida.");
        }

        // usando operador condicional: OU, uma das duas condições precisam ser satisfeitas para ser true.
        if (idade >= 18 || quantidadePessoas >= 2) {
            System.out.println("Você tem 18 anos ou está acompanhado e sua entrada foi permitida.");

        }else {
            System.out.println("Você não tem mais de 18 anos ou não está acompanhado, sua entrada foi probibida.");
        }
    }
}
