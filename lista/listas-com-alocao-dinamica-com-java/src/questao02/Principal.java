package questao02;

import lista.Lista;

public class Principal {

    public static void main(String[] args) {

        Lista<Integer> lista = new Lista<>();

        lista.inserirNoInicio(1);
        lista.inserirNoFim(2);
        lista.inserirNoFim(3);
        lista.inserirNoFim(4);
        lista.inserirNoFim(5);
        lista.inserirNoFim(6);

        lista.imprimir();

        lista.removerNPrimeiros(3);

        lista.imprimir();
    }
}
