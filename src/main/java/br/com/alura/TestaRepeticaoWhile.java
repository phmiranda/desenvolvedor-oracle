/**
 * User: phmiranda
 * Project: desenvolvedor
 * Date: 07/06/2020
 */

package br.com.alura;

public class TestaRepeticaoWhile {
    public static void main(String[] args) {
        int contador = 0;
        while(contador <= 10){
            System.out.println("Número impresso: " + contador);
            contador++;
        }
        System.out.println("O último número é: " + contador);
    }
}
