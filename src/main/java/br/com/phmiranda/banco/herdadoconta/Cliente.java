/**
 * Project: desenvolvedor
 * Date: 15/06/2020
 * User: phmiranda
 * Descrição:
 */

package br.com.phmiranda.banco.herdadoconta;

public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;

    // métodos getters e setters.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
