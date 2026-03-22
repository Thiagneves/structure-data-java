package questao02;

import algoritimos.busca.BuscaBinaria;
import algoritimos.busca.BuscaSimples;

public class Ferramentas {

    public static int[] gerarVetor(int tamanho){
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++){
            vetor[i] = i+1;
        }
        return vetor;
    }

    public static void testar(String tipo, int[] vetor, int valor, String descricao) {
        long inicio = System.currentTimeMillis();
        int posicao = -1;

        switch (tipo) {
            case "Busca Linear":
                posicao = BuscaSimples.buscalinear(vetor, valor);
                break;
            case "Busca Binária Iterativa":
                posicao = BuscaBinaria.buscaIterativa(vetor, valor);
                break;
            case "Busca Binária Recursiva":
                posicao = BuscaBinaria.buscaRecursiva(vetor, valor);
                break;
        }

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;

        System.out.printf("%s - %-25s -> Tempo: %4d ms  | Resultado: %s%n",
                tipo, descricao, tempo, (posicao == -1 ? "Não encontrado" : "Posição " + posicao));
    }
}
