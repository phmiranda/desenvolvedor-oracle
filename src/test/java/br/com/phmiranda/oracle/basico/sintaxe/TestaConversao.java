/*
 * Author: Pedro
 * Project: desenvolvedor-oracle-se
 * Task Number: SRC-66
 * Description: AULA 04 - TIPOS E VARIÁVEIS
 * Date: 21/07/2021
 */

package br.com.phmiranda.oracle.basico.sintaxe;

public class TestaConversao {
    public static void main(String[] args) {
        double salario = 1270.50;
        float salariof = 1270.50f;
        long numeroGrande = 32432423523L;
        short numeroPequeno = 2131;
        byte numeroByte = 127;

        int valor = (int) salario;

        System.out.println("Sálario (int): " + valor);
        System.out.println("Sálario (double): " + salario);
        System.out.println("Sálario (float): " + salariof);
        System.out.println("Número (byte): " + numeroByte);
        System.out.println("Número grande: " + numeroGrande);
        System.out.println("Número pequeno: " + numeroPequeno);
    }
}
