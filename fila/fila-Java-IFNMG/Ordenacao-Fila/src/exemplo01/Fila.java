package exemplo01;

public class Fila {
    public static void ordenar(int[] vetor){
        int n = vetor.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (vetor[j] > vetor[j+1]){
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
    }

    public static void ordenar2(int[] vetor){
        int n = vetor.length;
        for (int i = 1; i < n; i++){
            int key = vetor[i];
            int j = i - 1;

            while (j > 0 && vetor[j] > key){
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = key;
        }
    }

    public static void ordenar3(int[] vetor){
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++){
            int minPos = i;
            for (int j = i + 1; j < n; j++){
                if (vetor[j] < vetor[minPos]){
                    minPos = j;
                }
            }
            int aux = vetor[minPos];
            vetor[minPos] = vetor[i];
            vetor[i] = aux;
        }
    }
}
