/**
 * Project: oracle-se
 * Task/User History: 64
 * Description: Descrição resumida da história de usuário/tarefa e código de identificação (GRUPOCDC-64)
 * User: phmiranda
 */

package br.com.phmiranda.oracle.objeto.funcionario;

// classes abstração são genéricas e não podem ser instânciadas.
public abstract class Funcionario {
    private String nome;
    private String documento;
    private double salario;

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

    // um método abstrado não possui corpo, apenas define a sua assinatura e precisa ser implementado em suas classes filhas.
    public abstract double getBonificacao();

    //
}
