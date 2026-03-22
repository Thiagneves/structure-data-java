package questao12;

public class ImpressaoNumeros {
    private int aux = 0;
    public void crescente(int n) {
        if (n == 1 || n == 0){
            System.out.println(n);
        }
        if (aux != n+1){
            System.out.print(aux + " ");
            aux++;
            crescente(n);
        }
    }

    public void decrescente(int n) {
        if (n >= 0){
            System.out.print(n + " ");
            decrescente(n-1);
        }
    }
}
