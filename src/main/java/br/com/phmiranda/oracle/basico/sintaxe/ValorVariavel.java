/**
 * Project: oracle-se
 * Task/User History: 64
 * Description: Descrição resumida da história de usuário/tarefa e código de identificação (GRUPOCDC-64)
 * User: phmiranda
 */

package br.com.phmiranda.oracle.basico.sintaxe;

// a variável guarda um valor e não uma referência, neste caso que não é aplicado orientação a objetos.
public class ValorVariavel {
    public static void main(String[] args) {
        int primeiro = 1;
        int segundo = 5;
        segundo = primeiro;
        primeiro = 10;
    }
}
