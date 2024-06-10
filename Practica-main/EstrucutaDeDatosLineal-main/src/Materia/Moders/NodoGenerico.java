package Materia.Moders;

public class NodoGenerico<T> {

    T data;
    NodoGenerico<T> next;

    NodoGenerico(T data) {
        this.data = data;
        next = null;
    }
}
