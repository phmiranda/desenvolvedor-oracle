/**
 * Project: desenvolvedor
 * Date: 12/06/2020
 * User: phmiranda
 * Descrição:
 */

package br.com.alura.sintaxeBasicaHeranca.funcionario;

public class TestaFuncionarioReferencia {
    public static void main(String[] args) {
        // instancia objetos do tipo: Funcionario, EditorDeVideo e GerenteDeConta.
        FuncionarioDesignerGrafico designer = new FuncionarioDesignerGrafico();
        FuncionarioEditorVideo editor = new FuncionarioEditorVideo();
        FuncionarioGerente gerente = new FuncionarioGerente();


        // comentário.
        editor.setSalario(2500.00);
        designer.setSalario(2000.00);
        gerente.setSalario(5000.00);

        // comentário.
        FuncionarioBonificacao funcionarioBonificacao = new FuncionarioBonificacao();
        funcionarioBonificacao.registra(editor);
        funcionarioBonificacao.registra(designer);
        funcionarioBonificacao.registra(gerente);

        // comentário.
        System.out.println(funcionarioBonificacao.getSoma());
    }
}
