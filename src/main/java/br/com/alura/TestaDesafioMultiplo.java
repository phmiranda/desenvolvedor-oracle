/**
 * User: phmiranda
 * Project: desenvolvedor
 * Date: 07/06/2020
 */

package br.com.alura;

public class TestaDesafioMultiplo {
    public static void main(String[] args) {
        for (int numero = 1; numero < 100; numero++) {
            if (numero % 3 == 0) {
                System.out.println("Número: " + numero);
            }
        }
    }
}
