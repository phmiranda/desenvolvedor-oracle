/**
 * User: phmiranda
 * Project: desenvolvedor
 * Date: 07/06/2020
 */

package br.com.alura;

public class TestaAliquota {
    public static void main(String[] args) {
        double salario = 3300.0;

        if(salario >= 1900.0 && salario <= 2800.0){
            System.out.println("Sua alíquota é de 7% e sua dedução é de R$ 142,00.");
        }else if (salario >= 2800.01 && salario <= 3751.0) {
            System.out.println("Sua alíquota é de 15% e sua dedução é de R$ 350,00.");
        }else if (salario >= 3751.01 && salario <= 4664.0) {
            System.out.println("Sua alíquota é de 22,5% e sua dedução é de R$ 636,00.");
        }else {
            System.out.println("Não existe alíquota para o valor informado");
        }
    }
}
