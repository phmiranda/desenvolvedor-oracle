/*
 * Author: Pedro
 * Project: desenvolvedor-oracle-se
 * Task Number: SRC-67
 * Description: AULA 05 - TRABALHANDO COM CARACTERES
 * Date: 21/07/2021
 */

package br.com.phmiranda.oracle.basico.sintaxe;

// a variável guarda um valor e não uma referência, neste caso que não é aplicado orientação a objetos.
public class ValorVariavel {
    public static void main(String[] args) {
        int primeiro = 1;
        int segundo = 5;
        segundo = primeiro;
        primeiro = 10;
    }
}
