/**
 * Project: desenvolvedor
 * Date: 12/06/2020
 * User: phmiranda
 * Descrição:
 */

package br.com.phmiranda.sintaxe.funcionario;

public class TestaReferencia {
    public static void main(String[] args) {
        // instancia objetos do tipo: Funcionario, EditorDeVideo e GerenteDeConta.
        DesignerGrafico designer = new DesignerGrafico();
        EditorVideo editor = new EditorVideo();
        Gerente gerente = new Gerente();


        // comentário.
        editor.setSalario(2500.00);
        designer.setSalario(2000.00);
        gerente.setSalario(5000.00);

        // comentário.
        Bonificacao bonificacao = new Bonificacao();
        bonificacao.registra(editor);
        bonificacao.registra(designer);
        bonificacao.registra(gerente);

        // comentário.
        System.out.println(bonificacao.getSoma());
    }
}
