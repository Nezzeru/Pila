package Model;

import Controller.Pilable;

/**
 * Implementa Pilable usando nodos
 * @author teodora 
 
 */
public class Pila implements Pilable {
    private Nodo tope;                
    private int numeroDatos;               

    /**
     * Construye una pila vacia.
     */
    public Pila() {
	tope = null; 
	numeroDatos = 0;
    }

    /**
     * Verifica que la pila este vacia.
     * @return true si lo esta y falso en otro caso.
     */
    public boolean estaVacia (){ 
	return tope == null; 
    }

    /**
     * Vacia una pila.
     */
    public void vaciar() { 
	tope = null; 
	numeroDatos = 0;
    }

    /**
     * Devuelve el tamaño de la pila
     * @return int  cantidad de elementos en la pila
     */
    public int tamaño() {
	return numeroDatos;
    }

    /**
     * Devuelve el elemento del tope de la pila (sin alterar esta)
     * o bien null si se encuentra vacia.
     * @return Object -- objeto del tope de la pila
     */
    public Object top() { 
	return (estaVacia()) ? null : tope.obtenerElemento(); 
    }

    /**
     * Extrae el elemento del tope de la pila. 
     * Devuelve null si la pila esta vacia.
     * @return Object -- objeto del tope de la pila
     */
    public Object pop() {
	if (estaVacia())
	    return null;

	Object dato = tope.obtenerElemento();
	tope = tope.obtenerSiguiente();
	numeroDatos --;
	return dato;
    }

    /**
     * Inserta un nuevo elemento en la pila.
     * @param x el elemento a insertar.
     */
    public void push(Object x) {
	tope = new Nodo(x, tope);
	numeroDatos++;
    }

    /**
     * Iterador para moverse sobre los elementos de la pila sin alterarla.
     */
    public java.util.Iterator iterador() {
       return new MiIterador(); 
    }
  
    private class MiIterador implements java.util.Iterator {
	private Nodo posicion = tope;

	public boolean hasNext() { return posicion != null;}

	public Object next() { 
	    if (hasNext()) {
		Object o = posicion.obtenerElemento();
		posicion = posicion.obtenerSiguiente();
		return o;
	    }
	    return null;
	}

	public void remove() {
	    throw new IllegalStateException();
	}
    }
}
