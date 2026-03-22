public class ListaEncadeada <T> {
    private No<T> inicio;

    // Inserir no inicio da lista
    public void inserirNoInicio(T valor) {
        No<T> novoNo = new No<>(valor);

        if (inicio != null) {                        // Se já tiver um elemento inicial
            novoNo.setProximo(this.inicio);         // O novo nó será inserido antes do atual
        }
        this.inicio = novoNo;                       // O novo nó inicial agora é o novo nó
    }

    // Inserir no final da lista
    public void inserirNoFinal(T valor) {
        No<T> novoNo = new No<>(valor);
        No<T> atual = this.inicio;

        if (inicio == null) {                       // Verificar se há algum início
            this.inserirNoInicio(valor);           // Chama função Inserir no início
            return;
        }

        while (atual.getProximo() != null) {        // Passe elemento por elemento até chegar no ultimo
            atual = atual.getProximo();            // Move a referência 'atual' para o próximo nó,
        }
        atual.setProximo(novoNo);                  // Faz o último nó apontar para o novo nó (novoNo)
    }

    public void imprimir() {
        if (this.inicio == null) {
            System.out.println("Não existe elementos na Lista");
            return;
        }
        for (No<T> atual = this.inicio; atual != null; atual = atual.getProximo()) {
            System.out.println(atual.getElemento());
        }
    }
    public int PesquisaDeElemento(T elemento) {
        if (inicio == null) {
            return -1;
        }
        int indice = 0;

        for (No<T> atual = this.inicio; atual != null; atual = atual.getProximo()) {
            if (atual.getElemento() == elemento) {
                return indice;
            }
            indice++;
        }
        return -1;
    }
}