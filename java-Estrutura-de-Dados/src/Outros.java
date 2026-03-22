import java.util.Scanner;

public class Outros {

    public static void main(String[] args){

        String nome = "Thiago";
        int Idade = 21;
        System.out.printf("Olá meu nome é %s tenho %d anos de idade \n", nome, Idade);
        System.out.println("Olá meu nome é " +nome+ " tenho " + Idade + " anos de idade");

        String msg = "Olá meu nome é " +nome+ " tenho " + Idade + " anos de idade";
        System.out.println(msg);

        boolean a = false;

        if(a == true){
            System.out.println("a é verdadeiro");
        } else{
            System.out.println("a é falso");
        }
    }
}
