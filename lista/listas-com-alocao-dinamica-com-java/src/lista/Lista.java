package lista;

public class Lista<T> {

    private No<T> primeiro;

    // Metodo para inserir um valor no início da lista
    public void inserirNoInicio(T valor){
        No<T> novoNo = new No<>(valor);
        novoNo.proximo = this.primeiro;
        this.primeiro = novoNo;
    }

    // Metodo para inserir um valor no final da lista
    public void inserirNoFim(T valor){
        No<T> novoNo = new No<>(valor);
        if(this.primeiro == null){
            this.primeiro = novoNo;
        } else {
            No<T> atual = this.primeiro;
            while(atual.proximo != null){
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    // Metodo para inserir um valor numa posição específica
    public void inserirNaPosicao(int indice, T valor){
        if (primeiro == null){
            return;
        }

        int posicao = 0;

        for (No<T> atual = this.primeiro; atual != null; atual = atual.getProximo()){
            if (posicao == indice){

            }
            posicao++;
        }
    }

    public void removerNoInicio(){
        if (this.primeiro !=null){
            this.primeiro = this.primeiro.getProximo();
        }
    }

    // Metodo para remover o último valor da lista
    public void removerDoFim(){
        if (primeiro == null){
            return;
        }

    }

    public void removerPorValor(T valor){
        No<T> atual = this.primeiro;
        No<T> anterior = null;

        while(atual != null){
            if (atual.getValor().equals(valor)){
                break;
            }

            anterior = atual;
            atual = atual.getProximo();
        }

        if (atual != null){
            anterior.setProximo(anterior.getProximo());
        }
    }

    // Método para remover um valor de uma posição específica
    public void removerNaPosicao(int indice){

    }

    // Metodo para imprimir os valores da lista
    public void imprimir(){
        for(No<T> atual = this.primeiro; atual != null; atual = atual.proximo){
            System.out.print(atual.valor + " ");
        }
        System.out.println(" ");
    }

    // Metodo para obter a quantidade de elementos na lista
    public int quantidade(){
        Lista<T> lista = new Lista<>();
        No<T> atual = this.primeiro;

        int quant = 1;

        while(atual.proximo != null){
            atual = atual.proximo;
            quant++;
        }

        return quant;
    }

    // Método para verificar se a lista está vazia
    public boolean estaVazio(){
        return this.primeiro == null;
    }

    // Método para limpar a lista, removendo todos os elementos
    public void limpar(){

    }

    // Método para buscar um elemento por índice
    T buscarPorIndice(int indice){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Método para buscar um elemento por valor e retornar o seu índice
    public int buscarPorValor(T valor){
        throw new UnsupportedOperationException("Not supported yet.");
    }


    // 0. Cria uma lista a partir de um vetor
    public Lista fromArray(int[] array) {
        Lista<T> lista = new Lista<>();

        for(int i = 0; i < array.length; i++) {
            lista.inserirNoFim((T) array);
        }
        return lista;
    }

    // 1. Concatena a lista atual com outra lista, retornando uma nova lista
    public Lista<T> concatenar(Lista<T> outraLista) {
        Lista<T> lista = new Lista<>(); //Cria uma nova lista

        // Percorre a lista atual (this) e adiciona os elementos na nova lista
        No<T> atual = this.primeiro;

        while (atual != null) {
            lista.inserirNoFim(atual.getValor()); // metodo que insere no fim
            atual = atual.getProximo();
        }

        // Percorre a outra lista e adiciona também
        No<T> outro = outraLista.primeiro;
        while (outro != null) {
            lista.inserirNoFim(outro.getValor());
            outro = outro.getProximo();
        }

        return lista;
    }

    // 2. Remove os n primeiros elementos da lista
    public boolean removerNPrimeiros(int n) {

        for (int i = 0; i < n; i++){
            if (this.primeiro !=null){
                this.primeiro = this.primeiro.getProximo();
            }
        }
        return false;
    }

    // 3. Troca de posição de dois elementos de uma lista
    public boolean trocarPosicao(int pos1, int pos2) {
        // Verifica se as posições são válidas

        int tamanho = quantidade();

        if (pos1 < 0 || pos2 < 0 || pos1 >= tamanho || pos2 >= tamanho) {
            return false;
        }

        // Percorre até o nó pos1
        No<T> atual1 = primeiro;
        for (int i = 0; i < pos1; i++){
            atual1 = atual1.getProximo();
        }

        // Percorre até o nó pos2
        No<T> atual2 = primeiro;
        for (int i = 0; i < pos2; i++){
            atual2 = atual2.getProximo();
        }

        // Trocar os valores
        T temp = atual1.getValor();
        atual1.setValor(atual2.getValor());
        atual2.setValor(temp);

        return true;
    }

    // 4. Fazer uma função que cópia uma lista L1 em outra lista L2.
    public Lista<T> copiar() {
        Lista<T> lista = new Lista<>(); //Cria uma nova lista

        // Percorre a lista atual (this) e adiciona os elementos na nova lista
        No<T> atual = this.primeiro;

        while (atual != null) {
            lista.inserirNoFim(atual.getValor()); // metodo que insere no fim
            atual = atual.getProximo();
        }

        return lista;
    }

    // 5. Fazer uma função para inverter uma lista L1 colocando o resultado em L2.
    public Lista<T> inverter() {
        Lista<T> lista = new Lista<>();

        No<T> atual = this.primeiro;

        while (atual != null){
            lista.inserirNoInicio(atual.getValor());
            atual = atual.getProximo();
        }
        return lista;
    }

    // 6. Fazer uma função para inverter uma lista L1 alterando o seu próprio estado.
    public void autoInverter() {
        No<T> anterior = null;
        No<T> atual = primeiro;
        No<T> proximo = null;

        while (atual != null){
            proximo = atual.getProximo(); // guardar o próximo nó
            atual.proximo = anterior;     // inverter a seta
            anterior = atual;             // avança o "anterior"
            atual = proximo;              // avança o "atual"
        }

        primeiro = anterior; // novo início da lista
    }

    // 7. Escreva uma função que verifica se duas listas dadas são iguais.
    public boolean saoIguais(Lista<T> outraLista) {
        No<T> atual1 = this.primeiro;
        No<T> atual2 = outraLista.primeiro;

        while (atual1 != null && atual2 != null){
            if (!atual1.valor.equals(atual2.valor)) {
                return false;
            }
            atual1 = atual1.proximo;
            atual2 = atual2.proximo;
        }

        return atual1 == null && atual2 == null;
    }

    // 8. Crie uma função que remova todos os elementos duplicados de uma lista.
    public void removerDuplicados() {
        No<T> atual = primeiro;

        while (atual != null){
            No<T> anterior = atual;
            No<T> verificador = atual.proximo;

            while (verificador != null){
                if (verificador.valor.equals(atual.valor)){
                    // remover o valor duplicado

                    anterior.proximo = verificador.proximo;
                }
                else {
                    anterior = verificador; // avançar o anterior
                }
                verificador = verificador.proximo; // avançar o verificador
            }

            atual = atual.proximo; // avançar o nó da lista
        }
    }

    // 9. Implemente uma função que rotacione a lista para a esquerda por um número k de posições.
    public void rotacionar(int k) {
        if (primeiro == null || k <= 0) return;

        int tamanho = 1;
        No<T> ultimo = primeiro;

        // encontra o último nó e conta o tamanho
        while (ultimo.proximo != null) {
            ultimo = ultimo.proximo;
            tamanho++;
        }

        k = k % tamanho; // evita rotação maior que o tamanho da lista
        if (k == 0) return;

        No<T> atual = primeiro;
        // percorre até o k-ésimo nó
        for (int i = 1; i < k; i++) {
            atual = atual.proximo;
        }

        No<T> novoPrimeiro = atual.proximo;
        atual.proximo = null;      // corta a lista
        ultimo.proximo = primeiro; // liga o fim da lista antiga ao começo
        primeiro = novoPrimeiro;   // atualiza o novo primeiro
    }

    // 10. Escreva uma função que retorne uma nova lista contendo os elementos de um índice `inicio` até um índice `fim`.
    public Lista<T> sublista(int inicio, int fim) {
        Lista<T> novaLista = new Lista<>();

        if (primeiro == null || inicio > fim || inicio < 0) return novaLista;

        No<T> atual = primeiro;
        int indice = 0;

        // percorre até o índice inicio
        while (atual != null && indice < inicio) {
            atual = atual.proximo;
            indice++;
        }

        // copia os elementos de inicio até fim
        while (atual != null && indice <= fim) {
            novaLista.inserirNoFim(atual.valor);
            atual = atual.proximo;
            indice++;
        }

        return novaLista;
    }

    // 11. Crie uma função que intercale os elementos de duas listas.
    public Lista<T> intercalar(Lista<T> outraLista) {
        Lista<T> novaLista = new Lista<>();

        No<T> atual1 = this.primeiro;
        No<T> atual2 = outraLista.primeiro;

        // intercala enquanto houver elementos em ambas
        while (atual1 != null && atual2 != null) {
            novaLista.inserirNoFim(atual1.valor);
            novaLista.inserirNoFim(atual2.valor);

            atual1 = atual1.proximo;
            atual2 = atual2.proximo;
        }

        // se restarem elementos na primeira lista
        while (atual1 != null) {
            novaLista.inserirNoFim(atual1.valor);
            atual1 = atual1.proximo;
        }

        // se restarem elementos na segunda lista
        while (atual2 != null) {
            novaLista.inserirNoFim(atual2.valor);
            atual2 = atual2.proximo;
        }

        return novaLista;
    }
}
