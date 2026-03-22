public class Numeros {

    void NumerosPares(int num1){

        if (num1 % 2 == 0){
            if (num1 > 0){
                System.out.println(num1);
                NumerosPares(num1-2);
            }
        }
        else {
            NumerosPares(num1 - 1);
        }
        if (num1 <= 0){
            System.out.println("Fim");
        }
    }

    int Fatorial(int num2){
        int i = 0;
        if (num2 == 0 || num2 == 1){
            return 1;
        }
        else if (num2 > 1){
            i = num2 * Fatorial(num2 - 1);
        }
        else {
            throw new RuntimeException("Erro 404!");
        }
        return i;
    }

}
