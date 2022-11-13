/**
 * Project: GRUPOCDC
 * Task/User History: 64
 * Description: Estudo do capítulo 01, onde é apresentado as noções básicas do Java.
 * User: phmiranda
 */

package br.com.phmiranda.oracle.app.biblioteca;

import br.com.phmiranda.oracle.app.biblioteca.src.Livro;

public class CadastrarLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setIsbn("978-85-66250-46-6");
        livro.setNome("Java 8");
        livro.setDescricao("Aprendendo Java 8");
        livro.setPreco(59.90);
        livro.imprimirDetalhamento();

        Livro outroLivro = new Livro();

        outroLivro.setIsbn("978-85-66250-46-6");
        outroLivro.setNome("Java 11");
        outroLivro.setDescricao("Aprendendo Java 11");
        outroLivro.setPreco(51.98);
        outroLivro.imprimirDetalhamento();
    }
}
