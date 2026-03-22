package questao01;

import java.util.Arrays;
import java.util.Random;
import algoritimos.ordenacao.*;

public class Ferramentas {

    public static int[] gerarAleatorio(int tamanho) {
        Random random = new Random();
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(tamanho);
        }
        return vetor;
    }

    public static int[] gerarCrescente(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = i;
        }
        return vetor;
    }

    public static int[] gerarDecrescente(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = tamanho - i;
        }
        return vetor;
    }

    public static void testar(String nome, int[] vetorOriginal) {
        int[] vetor = Arrays.copyOf(vetorOriginal, vetorOriginal.length);

        long inicio = System.nanoTime();

        switch (nome) {
            case "Bubble Sort":
                BubbleSort.ordenar(vetor);
                break;
            case "Selection Sort":
                SelectionSort.ordenar(vetor);
                break;
            case "Insertion Sort":
                InsertionSort.ordenar(vetor);
                break;
            case "Merge Sort":
                MergeSort.ordenar(vetor);
                break;
            case "Quick Sort":
                QuickSort.ordenar(vetor);
                break;
            default:
                System.out.println("Algoritmo não reconhecido!");
                return;
        }

        long fim = System.nanoTime();
        double tempo = (fim - inicio) / 1_000_000.0;

        System.out.println(nome + " → Tempo: " + tempo + " ms");
    }
}
