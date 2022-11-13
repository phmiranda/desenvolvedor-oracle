/**
 * Project: oracle-se
 * Task/User History: 64
 * Description: Descrição resumida da história de usuário/tarefa e código de identificação (GRUPOCDC-64)
 * User: phmiranda
 */

package br.com.phmiranda.oracle.conteudo.basico.sintaxe;

// Nesta classe é feito o teste de conversão (casting), isso força a mudança de tipos.
public class Conversao {
    public static void main(String[] args) {
        double salario = 1270.50;
        int salarioConvertido = (int) salario;

        System.out.println("Double: " + salario);
        System.out.println("Casting: " + salarioConvertido);
    }
}
