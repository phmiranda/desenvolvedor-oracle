/**
 * Project: desenvolvedor
 * Date: 11/06/2020
 * User: phmiranda
 * Descrição: Uma função (método) que receba um número inteiro e retorne o quadrado do número somado ao milissegundo do horário atual.
 */

package br.com.alura.sintaxeDesafio;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TestaQuadrado {
    public static void main(String[] args) {
        int numero;
        int resultado;
        Scanner entrada;
        Calendar calendario = Calendar.getInstance();
        long milissegundos = calendario.getTimeInMillis();
        entrada = new Scanner(System.in);
        System.out.print("Digite um número para calcular: ");
        numero = entrada.nextInt();


        resultado = (int) ((numero * numero) + milissegundos);
        System.out.println("Resultado: " + resultado);
    }
}
