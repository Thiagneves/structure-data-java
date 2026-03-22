package questao06;

public class Principal {
    public static void main(String[] args) {
        SomaVetor somaVetor = new SomaVetor();
        int vetor[] = {1, 2, 3, 4, 5};
        System.out.println(somaVetor.somar(vetor, vetor.length-1));
    }
}
