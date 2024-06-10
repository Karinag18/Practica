package Materia.Moders;
import Materia.Moders.Pilas.Pila;

public class Ejercicio_02_sorting {

    public void ordenarPila(Pila pila) {
        Pila stackAux = new Pila();

        while (!pila.isEmpety()) {
            int temp = pila.pop();

            while (!stackAux.isEmpety() && stackAux.peek() > temp) {
                pila.push(stackAux.pop());
            }
            stackAux.push(temp);
        }

        while (!stackAux.isEmpety()) {
            pila.push(stackAux.pop());
        }
    
    }
    public static void mostrarPila(Pila pila) {
        Pila stackAux = new Pila();

        // Mostrar la pila y guardarla en stackAux
        while (!pila.isEmpety()) {
            int valor = pila.pop();
            System.out.print(valor + " ");
            stackAux.push(valor);
        }

        // Devolver los elementos a la pila original
        while (!stackAux.isEmpety()) {
            pila.push(stackAux.pop());
        }
        System.out.println();
    }

}
