/*
 * Author: Pedro
 * Project: desenvolvedor-oracle-se
 * Task Number: SRC-69
 * Description: AULA 07 - CONTROLANDO FLUXO COM LAÇOS
 * Date: 21/07/2021
 */

package br.com.phmiranda.oracle.basico.fluxo;

import java.util.Scanner;

public class TestaFluxoContadorFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contator = scanner.nextInt();
        int limitador = scanner.nextInt();
        int total;

        for (int contador = 0; contador <= 10 ; contador++) {
            System.out.println(contador);
        }
    }
}
