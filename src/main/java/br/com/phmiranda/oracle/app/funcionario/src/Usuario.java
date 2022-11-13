/**
 * Project: oracle-se
 * Task/User History: nº 999
 * Description: N/A
 * User: Pedro
 */

package br.com.phmiranda.oracle.app.funcionario.src;

public class Usuario implements Autenticar {
    private String nomeCompleto;
    private String documento;
    private String email;
    private Integer sexo;

    @Override
    public boolean autenticar(boolean funcao) {
        if (funcao == true) {
            System.out.println("O usuário tem cadastro de administrador.");
        } else if (funcao == false) {
            System.out.println("O usuário não tem cadastro de administrador.");
        } else {
            System.out.println("O usuário não tem função cadastrada.");
        }
        return funcao;
    }

    public void imprimirInformacao() {

    }
}
