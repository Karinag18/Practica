package Materia.Moders.Pilas;

import java.util.EmptyStackException;

import Materia.Moders.Node;

public class Pila {
    private Node top;


    public Pila() {
        top = null;
    }

    // Agregar elemento a la pila
    public void push(int value) {
        Node nuevoNodo = new Node(value);
        nuevoNodo.next = top;
        top = nuevoNodo;
    }

    // Sacar elemento de la pila
    public int pop() {
        if (top == null) {
            System.out.println("La pila está vacía");
            throw new EmptyStackException();
        } else {
            int value = top.value;
            top = top.next;
            return value;
        }
    }

    // Obtener el valor del elemento en la cima de la pila
    public int peek() {
        if (top == null) {
            System.out.println("La pila está vacía");
            //throw new EmptySatckException
            return 0;
        }
        return top.value;
    }

    // Verificar si la pila está vacía
    public boolean isEmpety(){
        return top == null;
    }
}