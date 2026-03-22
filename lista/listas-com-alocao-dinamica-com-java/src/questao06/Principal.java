package questao06;

import lista.Lista;

public class Principal {

    public static void main(String[] args) {

        Lista<Integer> lista = new Lista<>();

        lista.inserirNoInicio(1);
        lista.inserirNoFim(2);
        lista.inserirNoFim(3);

        lista.imprimir();

        lista.autoInverter();

        lista.imprimir();
    }
}
