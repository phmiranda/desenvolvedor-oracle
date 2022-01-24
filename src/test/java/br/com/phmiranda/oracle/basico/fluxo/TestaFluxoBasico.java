/*
 * Author: Pedro
 * Project: desenvolvedor-oracle-se
 * Task Number: SRC-68
 * Description: AULA 06 - PRATICANDO CONDICIONAIS
 * Date: 21/07/2021
 */

package br.com.phmiranda.oracle.basico.fluxo;

import java.util.Scanner;

public class TestaFluxoBasico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");

        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("RESULTADO: VOCÊ TEM MAIS DE 18 ANOS.");
        } else {
            System.out.println("RESULTADO: VOCÊ NÃO TEM MAIS DE 18 ANOS.");
        }
    }
}
