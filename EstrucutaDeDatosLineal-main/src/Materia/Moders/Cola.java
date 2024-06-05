package Materia.Moders;
import java.util.NoSuchElementException;

public class Cola {
    private Node front;
    private Node last;
    
    public Cola() {
        this.front = null;
        this.last = null;
    }
    
    ///Metodo para agregar un Node a la cola
    public void addNode(int value){
        Node nuevoNodo = new Node(value);
        if(isEmpty()){
            front = nuevoNodo;
            last = nuevoNodo;
        
        }else{
            last.next = nuevoNodo;
            last = nuevoNodo;
        }
    }

    public int remove(){
        if (isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        int value = front.value;
        front = front.next;
        if(front == null){
            last = null;
        }
        return value;
    }
    
    public int peek(){
        if(isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        return front.value;

    }
    public boolean isEmpty(){
        return front == null;
    }
}
