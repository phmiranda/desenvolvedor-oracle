/**
 * Project: desenvolvedor
 * Date: 09/06/2020
 * User: phmiranda
 * Descrição:
 */

package br.com.phmiranda.sintaxe.fluxo;

public class TestaDesafioFatorial {
    public static void main(String[] args) {
        int fatorial = 1;
        for (int i = 1; i < 11; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }
    }
}
