package questao02;

import algoritimos.busca.BuscaBinaria;
import algoritimos.busca.BuscaSimples;
import questao02.Ferramentas.*;

public class Principal {
    public static void main(String[] args) {

        int[] tamanhos = {1000, 10000, 100000};

        //  (int i = 0; i < tamanhos.length; i++)
        for (int tamanhoAux : tamanhos){
            int[] vetor = Ferramentas.gerarVetor(tamanhoAux);

            int primeiro = 1;
            int meio = tamanhoAux / 2;
            int ultimo = tamanhoAux;
            int naoPresente = tamanhoAux + 1;

            System.out.println("=== Testes com " + tamanhoAux + " elementos ===\n");

            // ===== Busca Linear =====
            Ferramentas.testar("Busca Linear", vetor, primeiro, "Primeiro elemento");
            Ferramentas.testar("Busca Linear", vetor, meio, "Elemento do meio");
            Ferramentas.testar("Busca Linear", vetor, ultimo, "Último elemento");
            Ferramentas.testar("Busca Linear", vetor, naoPresente, "Elemento não presente");
            System.out.println(); // separa visualmente os blocos

            // ===== Busca Binária Iterativa =====
            Ferramentas.testar("Busca Binária Iterativa", vetor, primeiro, "Primeiro elemento");
            Ferramentas.testar("Busca Binária Iterativa", vetor, meio, "Elemento do meio");
            Ferramentas.testar("Busca Binária Iterativa", vetor, ultimo, "Último elemento");
            Ferramentas.testar("Busca Binária Iterativa", vetor, naoPresente, "Elemento não presente");
            System.out.println();

            // ===== Busca Binária Recursiva =====
            Ferramentas.testar("Busca Binária Recursiva", vetor, primeiro, "Primeiro elemento");
            Ferramentas.testar("Busca Binária Recursiva", vetor, meio, "Elemento do meio");
            Ferramentas.testar("Busca Binária Recursiva", vetor, ultimo, "Último elemento");
            Ferramentas.testar("Busca Binária Recursiva", vetor, naoPresente, "Elemento não presente");
            System.out.println();
        }
    }
}
