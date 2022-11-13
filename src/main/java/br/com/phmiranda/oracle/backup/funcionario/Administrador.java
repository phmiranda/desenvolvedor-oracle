/**
 * Project: oracle-se
 * Task/User History: 64
 * Description: Descrição resumida da história de usuário/tarefa e código de identificação (GRUPOCDC-64)
 * User: phmiranda
 */

package br.com.phmiranda.oracle.backup.funcionario;

public class Administrador extends Funcionario implements Autenticavel{
    private final AutenticacaoUtil autenticador;

    public Administrador (){
        this.autenticador = new AutenticacaoUtil();
    }

    // reescrita do método bonificação na classe mãe/genérica Funcionario.bonificacao().
    @Override
    public double getBonificacao() {
        System.out.println("Bonificação: ADMINISTRADOR DE SISTEMAS");
        return 50;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autenticar(int senha) {
        return this.autenticador.autentica(senha);
    }
}
