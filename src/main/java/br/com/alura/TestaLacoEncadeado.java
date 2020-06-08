/**
 * User: phmiranda
 * Project: desenvolvedor
 * Date: 07/06/2020
 */

package br.com.alura;

public class TestaLacoEncadeado {
    public static void main(String[] args) {
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++){
            for (int contator = 0; contator <= 10; contator++){
                System.out.print(multiplicador * contator);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
