/*
 * Author: Pedro
 * Project: desenvolvedor-oracle-se
 * User Story: HU001
 * Description: DESENVOLVEDOR ORACLE SE [PARTE 01]
 * Date: 21/07/2021
 */

package br.com.phmiranda.oracle.basico.sintaxe;

// o CHAR guarda apenas um caractere, pois é um tipo primitivo e utiliza aspas simples.
public class Caractere {

    public static void main(String[] args) {
        char letra = 'a';
        System.out.println("IMPRESSÃO LITERAL: " + letra);

        char valor = 66;
        System.out.println("IMPRESSÃO DE CODIFICAÇÃO (ASC): " + valor);

        String palavra = "ALGUMA FRASE AQUI !";
        System.out.println(palavra);

        palavra = palavra + 2020;
        System.out.println(palavra);
    }
}
