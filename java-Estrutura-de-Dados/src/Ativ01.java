import java.util.Scanner;

public class Ativ01 {
    public static void main(String[] args){

        int num1;
        int num2;

        Scanner imprimir = new Scanner(System.in);
        System.out.print("Escreva um numero: ");
        num1 = imprimir.nextInt();
        System.out.print("Escreva outro numero: ");
        num2 = imprimir.nextInt();

        if (num1 > num2){
            System.out.println(num1+ " é maior que " +num2);
        } else if (num2 > num1){
            System.out.println(num2+ " é maior que " +num1);
        } else {
            System.out.print(num1+ " é igual a " +num2);
        }
    }
}
