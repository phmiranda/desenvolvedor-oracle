/*
 * Author: Pedro
 * Project: desenvolvedor-oracle-se
 * Task Number: SRC-69
 * Description: AULA 07 - CONTROLANDO FLUXO COM LAÇOS
 * Date: 21/07/2021
 */

package br.com.phmiranda.oracle.basico.fluxo;

import java.util.Scanner;

public class TestaFluxoContador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para iniciar a contagem: ");
        int contador = scanner.nextInt();

        System.out.println("Digite um número limitador máximo: ");
        int limitador = scanner.nextInt();

        while (contador < limitador) {
            System.out.println(contador);
            contador++;
        }
        System.out.println(contador);
    }
}
