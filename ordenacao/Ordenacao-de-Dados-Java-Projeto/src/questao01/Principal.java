package questao01;

import algoritimos.busca.*;
import algoritimos.ordenacao.*;

import java.util.Random;

public class Principal {

    public static void main(String[] args) {
        /*
        Random random = new Random();
        int tamanho = 1000;
        int[] vetor = new int[tamanho];

        // Gera vetor aleatório
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(100000);
        }

        System.out.println("\n=== Teste de Algoritmos de Ordenação ===\n");

        Ferramentas.testar("Bubble Sort", vetor);
        Ferramentas.testar("Selection Sort", vetor);
        Ferramentas.testar("Insertion Sort", vetor);
        Ferramentas.testar("Merge Sort", vetor);
        Ferramentas.testar("Quick Sort", vetor);

        */

        //METODO SOLICITADO PELO PROFESSOR:

        int[] tamanhos = {1000, 10000};
        String[] tipos = {"Aleatória", "Crescente", "Decrescente"};

        System.out.printf("| %-15s | %-12s | %-10s | %-12s |%n",
                "Algoritmo", "Tipo", "Tamanho", "Tempo (ms)");
        System.out.println("---------------------------------------------------------------");

        for (int tamanho : tamanhos) {
            for (String tipo : tipos) {

                int[] vetorOriginal = switch (tipo) {
                    case "Crescente" -> Ferramentas.gerarCrescente(tamanho);
                    case "Decrescente" -> Ferramentas.gerarDecrescente(tamanho);
                    default -> Ferramentas.gerarAleatorio(tamanho);
                };

                // --- Testes com dos algoritmos ---
                testar("BubbleSort", vetorOriginal.clone(), BubbleSort::ordenar, tipo, tamanho);
                testar("InsertionSort", vetorOriginal.clone(), InsertionSort::ordenar, tipo, tamanho);
                testar("MergeSort", vetorOriginal.clone(), MergeSort::ordenar, tipo, tamanho);
                testar("QuickSort", vetorOriginal.clone(), QuickSort::ordenar, tipo, tamanho);
                testar("SelectionSort", vetorOriginal.clone(), SelectionSort::ordenar, tipo, tamanho);
            }
        }
    }

    private static void testar(String nome, int[] vetor, java.util.function.Consumer<int[]> algoritmo, String tipo, int tamanho) {
        long inicio = System.nanoTime();
        algoritmo.accept(vetor);
        long fim = System.nanoTime();
        double duracaoMs = (fim - inicio) / 1_000_000.0;

        System.out.printf("| %-15s | %-12s | %-10d | %-10.2f ms |%n",
                nome, tipo, tamanho, duracaoMs);
    }

    /**
     * @authot: Thiago Neves
     * @version 1.0
     * @since 2025-10-29
     */
}