package questao07;

public class InverterVetor {
    public void inverter(int[] vetor, int n) {
        if (n < 0) return;
        System.out.print(vetor[n] + " ");
        inverter(vetor, n - 1);
    }
}
