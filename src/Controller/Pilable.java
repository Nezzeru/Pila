/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author teodora
 */
public interface Pilable {
    /**
    /**
     * Metodo para determinar si una pila esta o no vacia.
     * @return boolean -- true si la pila esta vacia y false en otro caso.
     */
    public boolean estaVacia ();
    /**
     * Metodo para eliminar todos los elementos de una pila
     */
    public void vaciar() ;
    /** 
     * Metodo para obtener el elemento del tope de la pila sin alterar esta
     * @return Object -- ultimo elemento en entrar a la pila
     */
    public Object top() ;
    /** 
     * Metodo para sacar el elemento del tope de la pila
     * @return Object -- ultimo elemento en entrar a la pila
     */
    public Object pop() ;
    /**
     * Metodo para introducir un elemento en la pila
     * @param elem -- elemento a introducir en la pila
     */
    public void push(Object elem) ;
    /**
     * Metodo para obtener un iterador sobre la pila
     * @return Iterator -- iterador sobre la pila
     */
    public java.util.Iterator iterador();

    
    
}

    
   
