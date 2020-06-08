/**
 * User: phmiranda
 * Project: desenvolvedor
 * Date: 07/06/2020
 */

package br.com.alura;

public class TestaEscopoVariavel {
    public static void main(String[] args) {
        int idade = 18;
        int quantidadePessoas = 3;
        boolean acompanhado;

        if (quantidadePessoas >= 2){
            acompanhado = true;
        }else {
            acompanhado = false;
        }

        if (idade >= 18 && acompanhado) {
            System.out.println("Seja bem vindo, sua entrada foi autorizada.");
        } else {
            System.out.println("Infelizmente, por conta da sua idade não podemos permitir seu acesso.");
        }
    }
}
