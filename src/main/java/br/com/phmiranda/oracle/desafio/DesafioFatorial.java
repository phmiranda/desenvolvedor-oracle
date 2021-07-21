/*
 * Author: Pedro
 * Project: desenvolvedor-oracle-se
 * User Story: HUXXX - TITLE OF USER HISTORY
 * Description: N/A
 * Date: 21/07/2021
 */

package br.com.phmiranda.oracle.desafio;

public class DesafioFatorial {
    public static void main(String[] args) {
        int fatorial = 1;
        for (int i = 1; i < 11; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }
    }
}
