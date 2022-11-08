/**
 * Project: oracle-se
 * Task/User History: 64
 * Description: Descrição resumida da história de usuário/tarefa e código de identificação (GRUPOCDC-64)
 * User: phmiranda
 */

package br.com.phmiranda.oracle.basico.fluxo;

public class BaseWhile {
    public static void main(String[] args) {
        int contador = 0;

        while (contador < 10) {
            System.out.println(contador);
            // contador = contador + 1;
            // contador += 1;
            contador++;
        }
    }
}
