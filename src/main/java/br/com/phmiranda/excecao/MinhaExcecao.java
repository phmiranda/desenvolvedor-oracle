/*
 * Author: Pedro
 * Project: desenvolvedor-oracle
 * User Story: N/A
 * Description: essa classe cria uma exceção própria para tratamento de exceção.
 * Date: 08/07/2020
 */

package br.com.phmiranda.excecao;

public class MinhaExcecao extends RuntimeException {
    public MinhaExcecao(String msg) {
        super(msg);
    }
}
