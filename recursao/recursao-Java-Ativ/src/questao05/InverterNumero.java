package questao05;

public class InverterNumero {
    int resultado = 0;
    public int inverter(int n) {

        if (n > 0){
            int atualizar = n%10;
            resultado = atualizar + (resultado * 10);
            inverter(n/10);
        }

        return resultado;
    }
}
