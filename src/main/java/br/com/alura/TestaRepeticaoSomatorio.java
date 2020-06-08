/**
 * User: phmiranda
 * Project: desenvolvedor
 * Date: 07/06/2020
 */

package br.com.alura;

public class TestaRepeticaoSomatorio {
    public static void main(String[] args) {
        int contator = 0;
        int total = 0;
        while (contator <= 10) {
            total = total + contator;
            contator++;
        }
        System.out.println("O total é: " + total);
    }
}
