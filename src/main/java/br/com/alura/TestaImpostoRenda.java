/**
 * User: phmiranda
 * Project: desenvolvedor
 * Date: 06/06/2020
 */

package br.com.alura;

public class TestaImpostoRenda {
    public static void main(String[] args) {
        double salario = 200;
        if (salario < 2600.0) {
            System.out.println("A sua alíquota é de 15% e você pode deduzir até R$ 350,00");
        }
        if (salario < 3750.0){
            System.out.println("A sua alíquota é de 22,5% e você pode deduzir até R$ 636,00");
        }
    }
}
