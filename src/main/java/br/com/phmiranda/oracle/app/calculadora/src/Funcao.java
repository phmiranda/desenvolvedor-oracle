/**
 * Project: oracle-se
 * Task/User History: nº 99
 * Description: N/A
 * User: Pedro
 */

package br.com.phmiranda.oracle.app.calculadora.src;

public class Funcao {
    private Double valorX;
    private Double valorY;
    private Double resultado;

    public Double somar(Double valorX, Double valorY) {
        resultado = valorX + valorY;
        System.out.println("A soma dos valores é: " + resultado);
        return resultado;
    }

    public Double subtrair() {
        resultado = valorX - valorY;
        System.out.println("A subtração dos valores é: " + resultado);
        return resultado;
    }

    public Double multiplicar() {
        resultado = valorX * valorY;
        System.out.println("A multiplicação dos valores é: " + resultado);
        return resultado;
    }

    public Double dividir() {
        resultado = valorX / valorY;
        System.out.println("A divisão dos valores é: " + resultado);
        return resultado;
    }
}
