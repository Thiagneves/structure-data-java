package algoritimos.ordenacao;

public class BubbleSort {
    public static void ordenar(int[] vetor){
        int num = vetor.length;

        for (int i = 0; i < num -1; i++){
            for (int j = 0; j < num -i -1; j++){
                if (vetor[j] > vetor[j+1]){
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
    }
}
