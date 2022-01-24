/*
 * Author: phmiranda
 * Project: desenvolvedor-oracle-se
 * Task Number: HU-XXX
 * Description: N/A
 * Date: 24/01/2022
 */

package br.com.phmiranda.oracle.basico.fluxo;

public class TestaFluxoMultiplicacao {
    public static void main(String[] args) {
        int contador;
        int multiplicador;

        for (multiplicador = 1; multiplicador <= 10; multiplicador++) {
            for (contador = 0; contador <= 10; contador++) {
                System.out.print(multiplicador * contador);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
