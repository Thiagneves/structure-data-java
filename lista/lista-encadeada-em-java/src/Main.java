public class Main {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.inserirNoInicio(5);
        lista.inserirNoFinal(4);
        lista.inserirNoFinal(3);
        lista.inserirNoFinal(2);
        lista.inserirNoFinal(1);

        System.out.println(lista.PesquisaDeElemento(4));

        lista.imprimir();
    }
}
