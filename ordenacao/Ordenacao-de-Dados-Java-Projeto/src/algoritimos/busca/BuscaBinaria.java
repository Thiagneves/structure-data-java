package algoritimos.busca;

import algoritimos.ordenacao.BubbleSort;

public class BuscaBinaria {
    public static int buscaIterativa(int[] vetor, int valor){

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.ordenar(vetor);

        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim){
            int meio = (inicio + fim)/2;

            if (vetor[meio] == valor){
                return meio;
            }
            else if (vetor[meio] < valor) {
                inicio = meio + 1;
            }
            else {
                fim = meio - 1;
            }
        }

        return -1;
    }

    public static int buscaRecursiva(int[] vetor, int valor){
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.ordenar(vetor);

        return buscaRecursivaInterna(vetor, valor, 0, vetor.length -1);
    }

    private static int buscaRecursivaInterna(int[] vetor, int valor, int inicio, int fim){

        // Verificador
        if (inicio > fim){
            return -1;
        }

        int meio = (inicio + fim)/2;

        if (vetor[meio] == valor) {
            return meio;
        }
        else if (vetor[meio] < valor) {
            return buscaRecursivaInterna(vetor, valor, meio + 1, fim);
        }
        else {
            return buscaRecursivaInterna(vetor, valor, inicio, meio -1);
        }
    }
}
