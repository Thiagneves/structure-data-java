package questao03;

public class Somatorio {
    public int somatorio(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        else {
            return n + somatorio(n - 1);
        }
    }
}
