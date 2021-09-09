/*
 * Author: Pedro
 * Project: desenvolvedor-oracle-se
 * User Story: HU001
 * Description: DESENVOLVEDOR ORACLE SE [PARTE 01]
 * Date: 21/07/2021
 */

package br.com.phmiranda.oracle.basico.sintaxe;

// Nesta classe é feito o teste de conversão (casting), isso força a mudança de tipos.
public class ConversaoTipo {
    public static void main(String[] args) {
        double salario = 1270.50;
        int salarioConvertido = (int) salario;

        System.out.println("Double: " + salario);
        System.out.println("Casting: " + salarioConvertido);
    }
}
