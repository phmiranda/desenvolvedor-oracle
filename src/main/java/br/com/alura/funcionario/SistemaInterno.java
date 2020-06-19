package br.com.alura.funcionario;

public class SistemaInterno {
    private int senha = 2222;

    public void autentica(Autenticavel autenticavel) {
        boolean autenticou = autenticavel.autenticar(this.senha);
        if (autenticou) {
            System.out.println("Pode entrar no sistema.");
        }else {
            System.out.println("Não pode entrar no sistema.");
        }
    }
}
