/**
 * Project: oracle-se
 * Task/User History: 64
 * Description: Descrição resumida da história de usuário/tarefa e código de identificação (GRUPOCDC-64)
 * User: phmiranda
 */


package br.com.phmiranda.oracle.backup.funcionario;

public class Bonificacao {
    private double soma;

    // recebe a bonificação referente a cada classe passada no parâmetro, pois ele pega o método específico de bonificação de cada classe.
    public void registra(Funcionario funcionario) {
        double bonificacao = funcionario.getBonificacao();
        this.soma = this.soma + bonificacao;
    }

    public double getSoma() {
        return soma;
    }
}
