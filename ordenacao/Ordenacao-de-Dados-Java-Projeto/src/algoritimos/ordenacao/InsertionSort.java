package algoritimos.ordenacao;

public class InsertionSort {
    public static void ordenar(int[] vetor){
        int quantidade = vetor.length;

        for (int i = 1; i < quantidade; i++){
            int key = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > key){
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = key;
        }
    }
}
