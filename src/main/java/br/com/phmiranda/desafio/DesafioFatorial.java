/**
 * User: phmiranda
 * Project: desenvolvedor-3
 * Description: desafio de como implementar fatorial.
 * Date: 09/06/2020
 */

package br.com.phmiranda.desafio;

public class DesafioFatorial {
    public static void main(String[] args) {
        int fatorial = 1;
        for (int i = 1; i < 11; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }
    }
}
