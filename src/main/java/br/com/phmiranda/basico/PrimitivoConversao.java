/**
 * User: Pedro
 * Project: desenvolvedor-v3
 * Description: essa classe exemplifica a utilização de CASTING (conversão de tipos).s
 * Date: 26/04/2021
 */

package br.com.phmiranda.basico;

public class PrimitivoConversao {
    // comment
    public static void main(String[] args) {
        double salario = 1270.50;
        int valor = (int) salario;

        System.out.println("Tipo double: " + salario);
        System.out.println("Tipo casting: " + valor);
    }
}
