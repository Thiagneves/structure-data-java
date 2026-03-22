package algoritimos.arvore;

public class Principal {
    public static void main(String[] args) {
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
        arvore.inserir(12);
        arvore.inserir(5);
        arvore.inserir(3);
        arvore.inserir(2);
        arvore.inserir(4);
        arvore.inserir(10);

        arvore.removerElemento(5);

        arvore.imprimirInOrdem();
    }
}
