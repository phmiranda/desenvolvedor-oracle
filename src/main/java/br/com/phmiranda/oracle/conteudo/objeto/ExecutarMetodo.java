/**
 * Project: oracle-se
 * Task/User History: nº 99
 * Description: N/A
 * User: Pedro
 */
package br.com.phmiranda.oracle.conteudo.objeto;

import br.com.phmiranda.oracle.conteudo.objeto.src.Metodo;

public class ExecutarMetodo {
    public static void main(String[] args) {
        Metodo retorno = new Metodo();
        retorno.setIdentificacao(2022L);
        retorno.setTexto("Escrevendo texto aleatório.");
        retorno.imprimirRetorno();
    }
}
