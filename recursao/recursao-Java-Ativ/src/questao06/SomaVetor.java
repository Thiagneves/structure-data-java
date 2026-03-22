package questao06;

public class SomaVetor {
    public int somar(int[] vetor, int n) {
        if (n < 0) return 0;

        return vetor[n] + somar(vetor, n-1);

    }
}
