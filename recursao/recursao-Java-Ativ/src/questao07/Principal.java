package questao07;

public class Principal {
    public static void main(String[] args) {
        InverterVetor inverterVetor = new InverterVetor();
        int vetor[] = {1, 2, 3, 4, 5};
        inverterVetor.inverter(vetor, vetor.length-1);
    }
}
