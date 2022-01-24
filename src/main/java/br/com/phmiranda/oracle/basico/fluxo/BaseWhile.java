/*
 * Author: Pedro
 * Project: desenvolvedor-oracle-se
 * Task Number: SRC-69
 * Description: AULA 07 - CONTROLANDO FLUXO COM LAÇOS
 * Date: 21/07/2021
 */

package br.com.phmiranda.oracle.basico.fluxo;

public class BaseWhile {
    public static void main(String[] args) {
        int contador = 0;

        while (contador < 10) {
            System.out.println(contador);
            // contador = contador + 1;
            // contador += 1;
            contador++;
        }
    }
}
