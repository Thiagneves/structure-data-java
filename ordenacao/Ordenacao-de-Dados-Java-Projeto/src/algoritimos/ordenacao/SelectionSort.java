package algoritimos.ordenacao;

public class SelectionSort {
    public static void ordenar(int[] vetor){
        int quantidade = vetor.length;

        for (int i = 0; i < quantidade - 1; i++){
            int minIndex = i;

            for (int j = i + 1; j < quantidade; j++){
                if (vetor[j] < vetor[minIndex]){
                    minIndex = j;
                }
            }

            int aux = vetor[minIndex];
            vetor[minIndex] = vetor[i];
            vetor[i] = aux;
        }
    }
}
