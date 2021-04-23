/**
 * Project:
 * Date: 19/06/2020
 * User: phmiranda
 * Description: esta classe realiza a execução dos métodos declarados através de uma fila de execução.
 */

package br.com.phmiranda.sintaxe.excecao;

public class Fluxo {
    public static void main(String[] args) {
        System.out.println("------ Início do Main ------");
        //metodo1();
        try{
            metodo1();
        }catch (ArithmeticException | NullPointerException | MinhaExcecao exception) {
            System.out.println("Exceção: " + exception.getMessage());
            exception.printStackTrace();
        }
        System.out.println("------ Fim do Main ------");
    }

    private static void metodo1() {
        System.out.println("------ Início do Método 01 ------");
        metodo2();
        System.out.println("------ Fim do Método 01 ------");
    }

    private static void metodo2() {
        System.out.println("------ Início do Método 02 ------");
        Conta conta = new Conta();

        //ArithmeticException exception = new ArithmeticException();
        //throw exception;

        throw new MinhaExcecao("Lançando mensagem na exceção !");

        //System.out.println("------ Fim do Método 02 ------");
    }
}
