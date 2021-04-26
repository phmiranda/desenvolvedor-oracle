/**
 * Project: desenvolvedor
 * Date: 19/06/2020
 * User: phmiranda
 * Description: classe responsável por implementar Interface (Contrato) de autenticação do cliente e estudo de conceito de interfaces
 */

package br.com.phmiranda.sintaxe.funcionario;

public class Cliente implements Autenticavel {
    private AutenticacaoUtil autenticador;

    public Cliente(){
       this.autenticador = new AutenticacaoUtil();
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
