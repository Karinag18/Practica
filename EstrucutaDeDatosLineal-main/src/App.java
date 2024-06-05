import Materia.Moders.Pantalla;
import Materia.Moders.PilaGenerica;
import Materia.Moders.Pilas.Pila;
import Materia.Moders.Cola;
import Materia.Moders.ColaGenerica;

public class App {
    public static void main(String[] args) throws Exception {

        Pila pila = new Pila();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);

        System.out.println("Elemento en  la cima de la pila: " + pila.peek());
        System.out.println("Elemento eliminado de la es: " + pila.pop());
        System.out.println("Elemento en  la cima de la pila: " + pila.peek());

        System.out.println();
        // Cola
        System.out.println("Cola");
        //implementacion de pila generica tipo pantalla
        Cola cola = new Cola();
        //Añadir elementos a la cola
        cola.addNode(10);
        cola.addNode(20);
        cola.addNode(30);

        //Mostrar el elemento en el frente
        System.out.println("Elemento al frente: " + cola.peek());
        //Retirar elemento cola
        System.out.println("Elemento retirado; " + cola.remove() ); //10
        System.out.println("Elemento en el frente: " + cola.peek()); //
        System.out.println("Elemento retirado; " + cola.remove() ); //10
        System.out.println("Elemento en el frente: " + cola.peek()); //

        //Ver si la cola esta vacia
        System.out.println("Cola vacia? " + (cola.isEmpty()?"Si" : "No"));

        //Pila Generica
        PilaGenerica<Pantalla> pilaPantallas = new PilaGenerica<>();
        pilaPantallas.push(new Pantalla("Home page", "/home",1));
        pilaPantallas.push(new Pantalla("Menu Page", "/home/menu", 2));
        pilaPantallas.push(new Pantalla("Set page", "/home/menu/settings", 3));
        System.out.println("Estoy en la pantalla "+pilaPantallas.peek().getNombre());
        System.out.println("Destruir pantalla "+pilaPantallas.pop().getNombre());
        System.out.println("Estoy en la pantalla "+pilaPantallas.peek().getNombre());
        pilaPantallas.push(new Pantalla("User page", "/home/menu/user", 4));
        System.out.println("Estoy en la pantalla \n\t "+pilaPantallas.peek().getNombre());

        //Cola Generica
        ColaGenerica<Pantalla> colaGenerica = new ColaGenerica<>();
        colaGenerica.addNode(new Pantalla("Home", "/Home", 5));
        colaGenerica.addNode(new Pantalla("Desktop", "/Desktop", 6));
        colaGenerica.addNode(new Pantalla("Setpage", "/Home/Menu/Settings", 7));

        System.out.println("Estoy en la pantalla \t " + colaGenerica.peek().getNombre());
        System.out.println("Pantalla destruida \t " + colaGenerica.remove().getNombre());
        System.out.println("Estoy en la pantalla \t " + colaGenerica.peek().getNombre());
        System.out.println("Pantalla destruida \t " + colaGenerica.remove().getNombre());
        System.out.println("Estoy en la pantalla \t " + colaGenerica.peek().getNombre());
        System.out.println("Pantalla destruida \t " + colaGenerica.remove().getNombre());
    }
}
