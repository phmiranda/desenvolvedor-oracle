/*
 * Author: Pedro
 * Project: desenvolvedor-oracle-se
 * Task Number: SRC-67
 * Description: AULA 05 - TRABALHANDO COM CARACTERES
 * Date: 21/07/2021
 */

package br.com.phmiranda.oracle.basico.sintaxe;

public class TestaCaractere {
    public static void main(String[] args) {
        char letra = 'a';
        char valorAsc = 66;
        valorAsc = (char) (valorAsc + 1);
        String palavra = "ISSO É UMA STRING";
        palavra = palavra + 2020;

        System.out.println(letra);
        System.out.println(valorAsc);
        System.out.println(palavra);
    }
}
