/**
 * User: phmiranda
 * Project: desenvolvedor
 * Date: 07/06/2020
 * Descrição:
 */

package br.com.alura;

public class TestaLacoEncadeado2 {
    public static void main(String[] args) {
        for (int linha = 0; linha < 10; linha++){
            for (int coluna = 0; coluna < 10; coluna++){
                if (coluna > linha){
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
