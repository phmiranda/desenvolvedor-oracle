/*
 * Author: Pedro
 * Project: desenvolvedor-oracle
 * User Story: N/A
 * Description:  essa classe exemplifica a utilização de CASTING (conversão de tipos)
 * Date: 26/04/2021
 */

package br.com.phmiranda.sintaxe.basica;

public class PrimitivoConversao {
    // comment
    public static void main(String[] args) {
        double salario = 1270.50;
        int valor = (int) salario;

        System.out.println("Double: " + salario);
        System.out.println("Casting: " + valor);
    }
}
