package algoritimos.ordenacao;

public class QuickSort {
    // Função principal (usuário só passa o vetor)
    public static void ordenar(int[] vetor){
        quickSort(vetor, 0, vetor.length - 1);
    }

    // Função recursiva
    private static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = particionar(vetor, inicio, fim);

            // Ordena as duas metades
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }

    // Função que separa menores e maiores que o pivô
    private static int particionar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[fim]; // pivô é o último elemento
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (vetor[j] < pivo) { // troca se for menor que o pivô
                i++;
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }

        // Coloca o pivô na posição correta
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = temp;

        return i + 1; // retorna a posição final do pivô
    }
}

