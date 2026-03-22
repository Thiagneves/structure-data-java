package lista;

public class No<T> {
    public T valor;
    public No<T> proximo;

    public No(T valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public T getValor() {
        return valor;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
}
