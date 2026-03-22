package questao12;

public class Principal {
    public static void main(String[] args) {
        ImpressaoNumeros impressaoNumeros = new ImpressaoNumeros();

        impressaoNumeros.crescente(10);
        System.out.println(" ");
        impressaoNumeros.decrescente(10);
    }
}
