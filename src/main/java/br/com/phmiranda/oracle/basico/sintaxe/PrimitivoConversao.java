/*
 * Author: Pedro
 * Project: desenvolvedor-oracle-se
 * User Story: HUXXX - TITLE OF USER HISTORY
 * Description: N/A
 * Date: 21/07/2021
 */

package br.com.phmiranda.oracle.basico.sintaxe;

public class PrimitivoConversao {
    // comment
    public static void main(String[] args) {
        double salario = 1270.50;
        int valor = (int) salario;

        System.out.println("Double: " + salario);
        System.out.println("Casting: " + valor);
    }
}
