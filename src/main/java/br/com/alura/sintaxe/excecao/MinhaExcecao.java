/**
 * User: phmiranda
 * Project: desenvolvedor-v3
 * Description: essa classe cria uma exceção própria para tratamento de exceção.
 * Date: 08/07/2020
 */

package br.com.alura.sintaxe.excecao;

public class MinhaExcecao extends RuntimeException {
    public MinhaExcecao(String msg) {
        super(msg);
    }
}
