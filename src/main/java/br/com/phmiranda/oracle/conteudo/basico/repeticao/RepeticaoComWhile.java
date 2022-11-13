/**
 * Project: oracle-se
 * Task/User History: 64
 * Description: Descrição resumida da história de usuário/tarefa e código de identificação (GRUPOCDC-64)
 * User: phmiranda
 */

package br.com.phmiranda.oracle.conteudo.basico.repeticao;

public class RepeticaoComWhile {
    public static void main(String[] args) {
        int contador = 0;
        String texto = "";
        while (contador <= 10) {
            System.out.println(contador);
            // Formas de iterar o valor de CONTADOR:
            //contador = contador + 1;
            //contador += 1;
            contador++;
        }
    }
}
