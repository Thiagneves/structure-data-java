package questao04;

import lista.Lista;

public class Principal {
    public static void main(String[] args) {
        Lista<Integer> lista1 = new Lista<>();

        lista1.inserirNoInicio(1);
        lista1.inserirNoFim(2);
        lista1.inserirNoFim(3);

        Lista<Integer> lista2 = lista1.copiar();

        lista2.imprimir();
    }
}
