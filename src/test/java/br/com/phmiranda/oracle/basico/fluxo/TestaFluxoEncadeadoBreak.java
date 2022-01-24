/*
 * Author: phmiranda
 * Project: desenvolvedor-oracle-se
 * Task Number: HU-XXX
 * Description: N/A
 * Date: 24/01/2022
 */

package br.com.phmiranda.oracle.basico.fluxo;

public class TestaFluxoEncadeadoBreak {
    public static void main(String[] args) {

        int coluna;
        int linha;

        for (linha = 0; linha < 10; linha++) {
            for (coluna = 0; coluna < linha; coluna++){
                //if (coluna > linha) {
                //    break;
                //}
                System.out.print("---*---");
            }
            System.out.println();
        }
    }
}
