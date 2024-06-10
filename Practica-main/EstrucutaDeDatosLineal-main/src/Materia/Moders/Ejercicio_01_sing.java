package Materia.Moders;
import Materia.Moders.PilaGenerica;

public class Ejercicio_01_sing {
    public boolean esValido(String expresion) {
        PilaGenerica<Character> pila = new PilaGenerica<>();

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (pila.isEmpty()) {
                    return false; // Hay un corchete de cierre sin su par de apertura
                }

                char topChar = pila.pop();
                if ((c == ')' && topChar != '(') || (c == '}' && topChar != '{') || (c == ']' && topChar != '[')) {
                    return false; // Corchetes no coinciden
                }
            }
        }

        return pila.isEmpty(); // La pila debe estar vacía si la expresión es válida
    }
}
