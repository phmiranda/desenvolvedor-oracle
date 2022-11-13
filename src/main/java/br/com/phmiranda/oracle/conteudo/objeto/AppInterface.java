/**
 * Project: oracle-se
 * Task/User History: nº 99
 * Description: N/A
 * User: Pedro
 */

package br.com.phmiranda.oracle.conteudo.objeto;

import br.com.phmiranda.oracle.conteudo.objeto.src.Interface;

public class AppInterface implements Interface {

    @Override
    public String assinaturaInterface(String parametro) {
        System.out.println(parametro);
        return parametro;
    }
}
