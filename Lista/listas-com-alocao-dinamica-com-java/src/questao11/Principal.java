package questao11;

import lista.Lista;

public class Principal {
    public static void main(String[] args) {
        Lista<Integer> lista1 = new Lista<>();

        lista1.inserirNoInicio(1);
        lista1.inserirNoFim(2);
        lista1.inserirNoFim(3);

        Lista<Integer> lista2 = new Lista<>();

        lista2.inserirNoInicio(4);
        lista2.inserirNoFim(5);
        lista2.inserirNoFim(6);

        Lista<Integer> lista = lista1.intercalar(lista2);
        lista.imprimir();
    }
}
