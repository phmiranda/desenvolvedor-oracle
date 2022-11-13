/**
 * Project: oracle-se
 * Task/User History: nº 99
 * Description: N/A
 * User: Pedro
 */
package br.com.phmiranda.oracle.conteudo.objeto.src;

public class Metodo {
    private Long identificacao;
    private String texto;

    public Long getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(Long identificacao) {
        this.identificacao = identificacao;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void imprimirRetorno(){
        System.out.println(getIdentificacao());
        System.out.println(getTexto());
    }
}
