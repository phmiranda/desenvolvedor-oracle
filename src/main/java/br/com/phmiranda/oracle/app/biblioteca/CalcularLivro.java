/**
 * Project: GRUPOCDC
 * Task/User History: 64
 * Description: Estudo do capítulo 01, onde é apresentado as noções básicas do Java.
 * User: phmiranda
 */

package br.com.phmiranda.oracle.app.biblioteca;

import java.text.DecimalFormat;

public class CalcularLivro {
    public static void main(String[] args) {
        double soma = 0;
        double contador;

        for (contador = 0; contador < 35; contador++) {
            soma += 59.90;
        }

        if(soma < 150) {
            System.out.println("O valor da soma é R$ " + soma + ", portanto o seu estoque está muito baixo.");
        } else if (soma >= 2000) {
            System.out.println("O valor da soma é R$ "  + soma + ",portanto o seu estoque está muito alto.");
        } else {
            System.out.println("O valor da soma é R$ " + soma + ",portanto o seu estoque está bom.");
        }
    }
}
