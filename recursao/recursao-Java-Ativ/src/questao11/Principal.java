package questao11;

public class Principal {
    public static void main(String[] args) {
        VerificadorPalindromo verificadorPalindromo = new VerificadorPalindromo();
        System.out.println(verificadorPalindromo.isPalindromo("java"));
        System.out.println(verificadorPalindromo.isPalindromo("Arara"));
        System.out.println(verificadorPalindromo.isPalindromo("arara"));
    }
}
