import java.util.Scanner;
//Utilizando while: Faça um programa que solicite infinitos números inteiros para o usuário
// até que o usuário informe o valor 0. Em seguida imprima a média aritmética entre os números informados.
public class Ativ05 {
    public static void main(String[] args){

        int numero;
        int quantidade = 0;
        int soma = 0;
        Scanner num = new Scanner(System.in);

        do{
            System.out.println("Escreva um nuemro: ");
            numero = num.nextInt();

            quantidade++;
            soma += numero;

        }while (numero != 0);

        System.out.println("A soma de todos os numeros informados é: "+soma);
    }
}
