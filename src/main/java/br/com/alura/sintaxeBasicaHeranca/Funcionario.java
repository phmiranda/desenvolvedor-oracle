/**
 * Project: desenvolvedor
 * Date: 10/06/2020
 * User: phmiranda
 * Descrição:
 */

package br.com.alura.sintaxeBasicaHeranca;

public class Funcionario {
    private String nome;
    private String documento;
    private double salario;

    // método de aplicação da bonificação do funcionário.
    public double bonificacao(){
        return this.salario * 0.1;
    }

    // métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
