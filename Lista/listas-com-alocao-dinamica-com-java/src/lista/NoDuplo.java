package lista;

class NoDuplo<T> {
    T valor;
    NoDuplo<T> proximo;
    NoDuplo<T> anterior;

    public NoDuplo(T valor) {
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }
}

