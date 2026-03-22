package questao01;

public class Fatorial {
    public int fatorial(int n) {

        if (n == 0 || n == 1){
            return 1;
        }
        else {

            return n * fatorial(n - 1);
        }
    }
}
