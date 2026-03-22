package questao10;

public class MultiplicacaoSomas {
    public int multiplicar(int a, int b) {
        if (a == 0 || b == 0){
            return 0;
        }
        return a + multiplicar(a, b -1);
    }
}
