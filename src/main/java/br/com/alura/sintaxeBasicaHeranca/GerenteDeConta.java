/**
 * Project: desenvolvedor
 * Date: 10/06/2020
 * User: phmiranda
 * Descrição: a classe FuncionarioGerente com o extends herda todos os atributos e métodos da classe mais genérica Funcionario.
 */

package br.com.alura.sintaxeBasicaHeranca;

public class GerenteDeConta extends Funcionario {
    private int senha;

    // comentário.
    public double bonificacao(){
        return this.getSalario();
    }

    // comentário.
    public boolean autentica(int senha){
        if (this.senha == senha){
            return true;
        }else {
            return false;
        }
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
