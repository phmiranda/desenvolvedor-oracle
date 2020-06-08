/**
 * User: phmiranda
 * Project: desenvolvedor
 * Date: 19/05/2020
 */

package br.com.alura;

public class TestaVariaveis {
    public static void main(String[] args) {
        // tipos de variáveis primitivas do Java.
        byte    variavelByte;
        short   variavelShort;
        int     variavelInteger;
        long    variavelLong;
        float   variavelFloat;
        double  variavelDouble;
        boolean variavelBoolean;
        char    variavelChar;

        // declaração de uma variável primitiva.
        int idade;
        int idadeSomada;
        int idadeSubtraida;
        int idadeMultiplicada;
        int idadeDividida;

        // operações aritiméticas.
        idade = 37;
        idadeSomada = 30 + 10;
        idadeSubtraida = 30 - 10;
        idadeMultiplicada = 7 * (5 + 2);
        idadeDividida = (60 / 3) + 5;

        // impressão das operações (resultado).
        System.out.println("--- INÍCIO ---");
        System.out.println("A idade declarada é: " + idade);
        System.out.println("A idade declarada e somada é: " + idadeSomada);
        System.out.println("A idade declarada e subtraída é: " + idadeSubtraida);
        System.out.println("A idade declarada e multiplicada é: " + idadeMultiplicada);
        System.out.println("A idade declarada e dividida é: " + idadeDividida);
        System.out.println("--- CONCLUSÃO ---");
    }
}
