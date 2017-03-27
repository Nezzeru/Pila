/**
 * Modelo de la pila
 */
package Controlador;

import Modelo.Pilable;

/**
 * Implementa Pilable usando nodos
 * @author teodora  <lcarcamo1526@universidadean.edu.co>
 
 */
public class Pila implements Pilable {
    private Nodo arriba;                
    private int numeroDatos;               

    /**
     * Construye una pila vacia.
     */
    public Pila() {
	arriba = null; 
	numeroDatos = 0;
    }

    /**
     * Verifica que la pila este vacia.
     * @return true si lo esta y falso en otro caso.
     */
    @Override
    public boolean estaVacia (){ 
	return arriba == null; 
    }

    /**
     * Vacia una pila.
     */
    @Override
    public void vaciar() { 
	arriba = null; 
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
     * Devuelve el elemento del arriba de la pila (sin alterar esta)
     * o bien null si se encuentra vacia.
     * @return Object -- objeto del arriba de la pila
     */
    @Override
    public Object top() { 
	return (estaVacia()) ? null : arriba.obtenerElemento(); 
    }

    /**
     * Extrae el elemento del arriba de la pila. 
     * Devuelve null si la pila esta vacia.
     * @return Object -- objeto del arriba de la pila
     */
    @Override
    public Object pop() {
	if (estaVacia())
	    return null;

	Object dato = arriba.obtenerElemento();
	arriba = arriba.obtenerSiguiente();
	numeroDatos --;
	return dato;
    }

    /**
     * Inserta un nuevo elemento en la pila.
     * @param x el elemento a insertar.
     */
    @Override
    public void push(Object x) {
	arriba = new Nodo(x, arriba);
	numeroDatos++;
    }

    /**
     * Iterador para moverse sobre los elementos de la pila sin alterarla.
     */
    public java.util.Iterator iterador() {
       return new MiIterador(); 
    }
  
    private class MiIterador implements java.util.Iterator {
	private Nodo posicion = arriba;

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
