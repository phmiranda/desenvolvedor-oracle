/*
 * Author: Pedro
 * Project: desenvolvedor-oracle-se
 * User Story: HU001
 * Description: DESENVOLVEDOR ORACLE SE [PARTE 01]
 * Date: 21/07/2021
 */

package br.com.phmiranda.oracle.basico.sintaxe;

// declaração de variáveis primitivas, forma básica de declaração com tipo primitivo no Java
public class Variavel {
    public static void main(String[] args) {
        int idade;
        idade = 37;

        //System.out.println(idade);
        System.out.println("Idade: " + idade);

        idade = 30 + 10;
        //System.out.println(idade);
        System.out.println("Idade Somada: " + idade);

        idade = (7*5) + 2 ;
        //System.out.println(idade);
        System.out.println("Idade Multiplicada: " + idade);
    }
}
