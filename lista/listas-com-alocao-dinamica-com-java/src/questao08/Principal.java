package questao08;

import lista.Lista;

public class Principal {
    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<>();

        lista.inserirNoInicio(1);
        lista.inserirNoFim(2);
        lista.inserirNoFim(2);
        lista.inserirNoFim(3);
        lista.inserirNoFim(4);
        lista.inserirNoFim(4);
        lista.inserirNoFim(5);

        lista.imprimir();

        lista.removerDuplicados();

        lista.imprimir();
    }
}
