package questao07;

import lista.Lista;

public class Principal {
    public static void main(String[] args) {
        Lista<Integer> lista1 = new Lista<>();

        lista1.inserirNoInicio(1);
        lista1.inserirNoFim(2);
        lista1.inserirNoFim(3);

        Lista<Integer> lista2 = new Lista<>();

        lista2.inserirNoInicio(1);
        lista2.inserirNoFim(2);
        lista2.inserirNoFim(3);

        System.out.println(lista1.saoIguais(lista2));

    }
}
