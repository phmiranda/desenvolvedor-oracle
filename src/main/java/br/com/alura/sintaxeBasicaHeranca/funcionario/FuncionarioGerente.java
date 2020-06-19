/**
 * Project: desenvolvedor
 * Date: 10/06/2020
 * User: phmiranda
 * Descrição: a classe FuncionarioGerente com o extends herda todos os atributos e métodos da classe mais genérica Funcionario.
 */

package br.com.alura.sintaxeBasicaHeranca.funcionario;

public class FuncionarioGerente extends Funcionario {
    private int senha;

    // métodos getters e setters.
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    // método que valida a autenticação do usuário com perfil de GerenteDeConta.
    public boolean autentica(int senha) {
        if (this.senha == senha){
            return true;
        }else {
            return false;
        }
    }

    // reescrita do método bonificação na classe mãe/genérica Funcionario.bonificacao().
    @Override
    public double getBonificacao() {
        System.out.println("Bonificação: GERENTE DE CONTA");
        return super.getSalario() * 0.1;
    }

}
