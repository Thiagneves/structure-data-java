import java.util.Scanner;

public class EntradaSaida{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int idade;
        String nome;

        System.out.print("Informe o seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Informe sua idade: ");
        idade = entrada.nextInt();

        boolean maior18 = idade > 17;

        if (maior18 == true){
            System.out.println(nome + " você pode ser preso");
        } else {
            System.out.println(nome+ " você tem " +idade+ " anos de idade");
        }
    }
}
