/**
 * Project: desenvolvedor
 * Date: 10/06/2020
 * User: phmiranda
 * Descrição: classe modelo para aplicação de Code Smells e elucidar problemas encontrados.
 */

package br.com.alura.sintaxeBasicaHeranca;

public class FuncionarioTeste {
    private String nome;
    private String documento;
    private double salario;
    private int tipo = 0; // 0 - Funcionário Comum, 1 - Gerente, 2 - Diretor
    private int senha;

    // método de autenticação para Gerente e Diretor.
    public boolean autentica(){
        if (this.senha == senha){
            return true;
        }else {
            return false;
        }
    }

    // método de aplicação da bonificação do funcionário.
    public double bonificacao(){
        if (tipo == 0){
            System.out.println("Tipo: Funcionário.");
            return this.salario * 0.1;
        }else if (tipo == 1){
            System.out.println("Tipo: Gerente");
            return this.salario;
        }else if (tipo == 2){
            System.out.println("Tipo: Diretor");
            return this.salario + 1000.00;
        }else {
            System.out.println("Não foi aplicado nenhuma bonificação");
            return this.salario;
        }
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
