/**
 * Project: GRUPOCDC
 * Task/User History: 64
 * Description: Estudo do capítulo 01, onde é apresentado as noções básicas do Java.
 * User: phmiranda
 */

package br.com.phmiranda.oracle.app.biblioteca.src;

public class Livro {
    private String isbn;
    private String nome;
    private String descricao;
    private Double preco;


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void imprimirDetalhamento() {
        System.out.println("------ Informações do Livro ------");
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Nome do Livro: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Preço (R$): " + getPreco());
        System.out.println("------ Fim do Detalhamento ------\n");
    }
}
