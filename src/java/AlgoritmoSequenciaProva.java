package provas.provaA;

public class AlgoritmoSequenciaProva {

    /**
     * Implemente o método que recebe um array de Inteiros de uma maneira que retorne uma String com os
     * números organizados nas seguintes condições:
     * <p>
     * Condição 1:  "-"(hífen)    Quando os números forem sequenciais, deve-se mostrar o primeiro e o último número do período apenas colocando um "-" no meio deles.
     * Condição 2:  ","(vírgula)  Quando existir uma quebra na sequência dos números, deve-se colocar "," e em seguida o número que quebrou a sequência.
     * Condição 3:  " "(espaço)   Você não precisa se preocupar em colocar o caractere espaço " " entre os números na formatação da sua String.
     * <p>
     * Para melhor entendimento, veja alguns exemplos de entrada/saída do que se espera do algoritmo:
     * <p>
     * Exemplo 1 : Entrada : {1,2,3,4,5,6,7,8,9,10}
     * Saída   : "1-10"
     * <p>
     * Exemplo 2 : Entrada : {1,2,3,4,6,7,8,9}
     * Saída   : "1-4,6-9"
     * <p>
     * Exemplo 3 : Entrada : {1,2,3,4,5,8,10,11,12,13,14,15}
     * Saída   : "1-5,8,10-15"
     * <p>
     * Exemplo 4 : Entrada : {1,2,3,5,7,10,11,12,13,20}
     * Saída   : "1-3,5,7,10-13,20"
     * <p>
     * Exemplo 5 : Entrada : {1,3,5,6,9,10,11,12}
     * Saída   : "1,3,5-6,9-12"
     */

    public static void main(String args[]) {
//        int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] valores = {1,2,3,4,6,7,8,9};
//        int[] valores = {1,2,3,4,5,8,10,11,12,13,14,15};
//        int[] valores =  {1,2,3,5,7,10,11,12,13,20};
        int[] valores =  {1,3,5,6,9,10,11,12};
        System.out.println(obterSequenciaFormatada(valores));
    }


    public static String obterSequenciaFormatada(int[] valores) {

        StringBuilder resposta = new StringBuilder();
        int sequencial = 0;

        for (int i = 0; i < valores.length; i++) {

            if (i < valores.length - 1) {
                if (valores[i] + 1 != valores[i + 1]) {
                    if (valores[i] != valores[i] - 1) {
                        resposta.append(valores[i]);
                        resposta.append(",");
                    } else {
                        resposta.append(valores[i]);
                        resposta.append("-");
                    }
                    sequencial = 0;
                } else if (sequencial == 0) {
                    resposta.append(valores[i]);
                    resposta.append("-");
                    sequencial++;
                }
            }
            if ((i == valores.length - 1)) {
                resposta.append(valores[valores.length - 1]);
            }
        }

        return resposta.toString();
    }

}

