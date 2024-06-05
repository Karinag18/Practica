package Materia.Moders;

import java.util.NoSuchElementException;

public class ColaGenerica <T> {
    int tamano;
    private NodoGenerico<T>front;
    private NodoGenerico<T>last;
    
    public ColaGenerica(){
        this.last=null;
    }

    public void addNode(T data){
        NodoGenerico<T> nuevoNodo = new NodoGenerico<>(data);
        if(isEmpty()){
            front = nuevoNodo;
            last = nuevoNodo;
        }else{
            last.next = nuevoNodo;
            last = nuevoNodo;
        }
        tamano ++;
    }
    public T remove(){
        if (isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        T value = front.data;
        front = front.next;

        if(front == null){
            last = null;
        }
        tamano --;
        return value;
    }

    public T peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return front.data;
    }

    public boolean isEmpty(){
        return front == null;
    }

    //Todo:
    public int size(){
        return tamano;
    }
}
