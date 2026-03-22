package algoritimos.arvore;

import javax.swing.plaf.PanelUI;

public class ArvoreBinariaBusca {
    No raiz;

    public void inserir(int valor) {
        this.raiz = interirRec(this.raiz, valor);
    }
    private No interirRec(No no, int valor) {
        No novo = new No(valor);
        // Verificar se o No é null
        if (no == null) {
            return novo;
        }

        if (valor < no.valor) {
            no.esquerda = interirRec(no.esquerda, valor);
        }
        else if (valor > no.valor) {
            no.direita = interirRec(no.direita, valor);
        }
        else {
            System.out.println("Elemento já inserido!");
        }
        return no;
    }
    public void imprimirInOrdem() {
        emOrdem(this.raiz);
    }
    private void emOrdem(No no) {
        if (no != null){
            emOrdem(no.esquerda);
            System.out.printf("Elemento: %d\n", no.valor);
            emOrdem(no.direita);
        }
    }

    public void imprimirPosOrdem() {
        PosOrdem(this.raiz);
    }

    private void PosOrdem(No no) {
        if (no != null){
            emOrdem(no.esquerda);
            emOrdem(no.direita);
            System.out.printf("Elemento: %d\n", no.valor);
        }
    }

    public void imprimirPreOrdem() {
        PreOrdem(this.raiz);
    }

    private void PreOrdem(No no) {
        if (no != null){
            System.out.printf("Elemento: %d\n", no.valor);
            emOrdem(no.esquerda);
            emOrdem(no.direita);
        }
    }

    public boolean buscar(int valor) {
        return buscaRec(this.raiz, valor);
    }

    private boolean buscaRec(No no, int valor) {
        if (no == null) {
            return false;
        }
        else if (valor == no.valor) {
            return true;
        }
        else if (valor < no.valor) {
            return buscaRec(no.esquerda, valor);
        }
        return buscaRec(no.direita, valor);

    }
    // ------------------------------------------------- //
    public int buscarMenorValor(){
        return buscarMenor(this.raiz);
    }

    private int buscarMenor(No no) {
        if (no.esquerda == null) {
            return no.valor;
        }
        return buscarMenor(no.esquerda);
    }

    public int buscarMenorValorIterativo(){
        //return buscarMenorIterativo(this.raiz);
        return 0;
    }

    /*
    * CÓDIGO
    */

    // ------------------------------------------------- //
    public int buscarMaiorValor() {
        return buscarMaior(this.raiz);
    }

    private int buscarMaior(No no) {
        if (no.direita == null) {
            return no.valor;
        }
        return buscarMaior(no.direita);
    }
    public int buscarMaiorValorIterativo() {
        //return buscarMaiorIterativo(this.raiz);
        return 0;
    }

    /*
     * CÓDIGO
     */

    // ------------------------------------------------- //

    public No removerElemento(int valor){
        return removerElementoRec(this.raiz, valor);
    }

    private No removerElementoRec(No no, int valor) {
        if (no == null){
            return null;
        }

        else if (valor < no.valor) {
            no.esquerda = removerElementoRec(no.esquerda, valor);
        }

        else if (valor > no.valor) {
            no.direita = removerElementoRec(no.direita, valor);
        }

        else {
            if (no.esquerda == null) {
                return no.direita;
            }

            else if (no.direita == null) {
                return no.esquerda;
            }

            else {
                int min = buscarMenor(no.direita);
                no.valor = min;
                no.direita = removerElementoRec(no.direita, min);
            }
        }
        return no;
    }

}
