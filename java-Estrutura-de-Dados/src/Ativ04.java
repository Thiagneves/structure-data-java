import java.util.Scanner;
// Utilizando for: Faça um programa que solicite do usuário um número positivo
// e imprima todos os números impares entre 0 e o número informado.
public class Ativ04 {
    public static void main(String[] args){

        int numero;
        Scanner imprimir = new Scanner(System.in);

        System.out.print("Escolha um numero: ");
        numero = imprimir.nextInt();

        for (int i = 0; i < numero; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
