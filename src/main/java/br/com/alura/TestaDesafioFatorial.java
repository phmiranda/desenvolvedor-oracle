/**
 * User: phmiranda
 * Project: desenvolvedor
 * Date: 07/06/2020
 */

package br.com.alura;

public class TestaDesafioFatorial {
    public static void main(String[] args) {
        int fatorial = 1;
        for (int numero = 1; numero < 11; numero++) {
            fatorial *= numero;
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }
}
