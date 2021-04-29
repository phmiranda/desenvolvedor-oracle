/**
 * User: Pedro
 * Project: desenvolvedor-v3
 * Description: this class PontoFlutuante execute...!
 * Date: 29/04/2021
 */
package br.com.phmiranda.basico;

public class PontoFlutuante {
    public static void main(String[] args) {
        double idade;
        double salario;
        double divisao;
        double novaTentativa;
        int outraDivisao;

        idade = 37;
        salario = 1250.75;
        divisao = 3.14 / 2;
        outraDivisao = 5 / 2;
        novaTentativa = 5 / 2;

        System.out.println("Minha idade é: " + idade);
        System.out.println("Meu salário é: " + salario);
        System.out.println("A primeira divisão é: " + divisao);
        System.out.println("A segunda divisão é: " + outraDivisao);
        System.out.println("A nova tentativa é: " + novaTentativa);
    }
}
