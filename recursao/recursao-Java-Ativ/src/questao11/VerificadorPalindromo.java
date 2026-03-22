package questao11;

public class VerificadorPalindromo {
    public boolean isPalindromo(String s) {
        return isPalindromoAux(s, 0, s.length() - 1);
    }
    private boolean isPalindromoAux(String s, int inicio, int fim){
        if (inicio >= fim){
            return true;
        }
        if (s.charAt(inicio) != s.charAt(fim)){
            return false;
        }
        return isPalindromoAux(s, inicio + 1, fim - 1);
    }
}
