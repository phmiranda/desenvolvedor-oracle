/*
 * Author: Pedro
 * Project: desenvolvedor-oracle-se
 * Task Number: SRC-69
 * Description: AULA 07 - CONTROLANDO FLUXO COM LAÇOS
 * Date: 21/07/2021
 */

package br.com.phmiranda.oracle.basico.fluxo;

public class TestaFluxoSomatorio {
    public static void main(String[] args) {
        int contador = 0;
        int limitador = 10;
        int total = 0;

        while (contador <= limitador) {
            total = total +contador;
            System.out.println(total);
            contador++;
        }
    }
}
