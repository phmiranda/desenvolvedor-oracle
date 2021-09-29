/*
 * Author: Pedro
 * Project: desenvolvedor-oracle
 * User Story: N/A
 * Description: N/A
 * Date: 10/06/2020
 */

package br.com.phmiranda.oracle.objeto.funcionario;

public class TesteSistema {
    public static void main(String[] args) {
        // instância das classes
        Administrador administrador = new Administrador();
        Cliente cliente = new Cliente();
        Gerente gerente = new Gerente();

        // cria uma instância do Sistema Interno
        SistemaInterno sistemaInterno = new SistemaInterno();

        // define os valores dos atributos.
        administrador.setSenha(3333);
        cliente.setSenha(2222);
        gerente.setSenha(2222);

        // comentário
        sistemaInterno.autentica(administrador);
        sistemaInterno.autentica(cliente);
        sistemaInterno.autentica(gerente);
    }
}
