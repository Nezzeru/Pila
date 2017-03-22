/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Pila;

public class Balanceador {

    public Pila obtenerMonton() {
        return monton;
    }

    public void asignarMonton(Pila monton) {
        this.monton = monton;
    }
    private Pila monton;

    public String estaBalanceado(String usrInput) {
        String mensaje = "";

        monton = new Pila();

        for (int i = 0; i < usrInput.length(); i++) {

            if (usrInput.charAt(i) == '(' || usrInput.charAt(i) == '{' || usrInput.charAt(i) == '[' || usrInput.charAt(i) == '<') {
                monton.push(usrInput.charAt(i));
            }
            if (usrInput.charAt(i) == ')' && monton.pop().equals('(')) {
                monton.pop();
                System.out.println("Esta balanceado");
            }
            if (usrInput.charAt(i) == '}' && monton.pop().equals('{')) {
                monton.pop();
                System.out.println("Esta balanceado");

            }

            if (usrInput.charAt(i) == ']' && monton.pop().equals('[')) {
                monton.pop();
                System.out.println("Esta balanceado");

            }
            if (usrInput.charAt(i) == '>' && monton.pop().equals('<')) {
                monton.pop();
                System.out.println("Esta balanceado");

            }
            if (usrInput.charAt(i) != '(' && usrInput.charAt(i) != '{' && usrInput.charAt(i) != '[' && usrInput.charAt(i) != '<'
                    && usrInput.charAt(i) != ')' && usrInput.charAt(i) != '}' && usrInput.charAt(i) != ']' && usrInput.charAt(i) != '>') {

            }
           
        }

        if (!usrInput.equalsIgnoreCase("") || !usrInput.equalsIgnoreCase("{") || !usrInput.equalsIgnoreCase("<") || !usrInput.equalsIgnoreCase(">") || !usrInput.equalsIgnoreCase(")") || !usrInput.equalsIgnoreCase("(") || !usrInput.equalsIgnoreCase("[") || !usrInput.equalsIgnoreCase("]")) {
            mensaje = "Verifica si ingresastes correctamente el orden de los signos o los signos correctos";

        }
        if (usrInput.equalsIgnoreCase("{}") || usrInput.equalsIgnoreCase("()") || usrInput.equalsIgnoreCase("<>") || usrInput.equalsIgnoreCase("[]")) {
            if (monton.estaVacia()) {
                mensaje = "Los signos  estan balanceados";
            }
        } else {
            mensaje = "Verifica si ingresastes correctamente el orden de los signos o los signos correctos";
        }

        return mensaje;
    }
}
