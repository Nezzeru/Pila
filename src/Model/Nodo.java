/**
 * Modelo del nodo
 */
package Model;

/**
 * Nodo de la pila
 *
 * @author teodora
 *
 */
public class Nodo {

    private Object elemento;
    private Nodo siguiente;

    /**
     * Metodo para crear un nodo con elemento igual a valor y apuntando al
     * vacio.
     *
     * @param valor -- objeto que es el valor de nodo
     */
    Nodo(Object valor) {
        this(valor, null);
    }

    /**
     * Constructor vacio de nodo
     *
     * @param valor valor de nodo
     * @param n apunta
     */
    Nodo(Object valor, Nodo n) {
        elemento = valor;
        siguiente = n;
    }

    /**
     * Devuelve el valor de un nodo
     *
     * @return Object el valor del nodo
     */
    public Object obtenerElemento() {
        return elemento;
    }

    /**
     * Devuelve el siguiente nodo
     *
     * @return Nodo siguiente
     */
    public Nodo obtenerSiguiente() {
        return siguiente;
    }
}
