import java.util.Scanner;
// Utilizando for: Faça um programa que solicite um número positivo para o usuário
// e calcule a soma de todos os número estre zero (0) e o número informado.
public class Ativ03 {
    public static void main(String[] args){

        int numero;
        int soma = 0;
        Scanner opcao = new Scanner(System.in);

        System.out.print("Escolha um numero: ");
        numero = opcao.nextInt();

        for (int i = 0; i <= numero; i++){
            soma = soma + i;
        }

        System.out.println(soma);
    }
}
