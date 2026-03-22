package algoritimos.busca;

public class BuscaSimples {
    public static int buscalinear(int[] vetor, int valor){
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == valor){
                return i;
            }
        }
        return -1;
    }
}
