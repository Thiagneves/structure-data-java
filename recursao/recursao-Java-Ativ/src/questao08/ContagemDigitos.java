package questao08;

public class ContagemDigitos {
    int digitos = 0;
    int contador = 0;
    public int contarDigito(int n, int k) {
        if (n > 0){
            digitos = n%10;
            if (digitos == k){
                contador++;
            }
            contarDigito(n/10, k);
        }
        return contador;
    }
}
