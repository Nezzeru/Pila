/**
 * Clase balanceador
 * @author Teodora
 */
package Controlador;
/**
 * Balancea entre textos
 * @author teodora <lcarcamo1526@universidadean.edu.co>
 */
public class Balanceador {
/*
 * Verifica que el texto que ingreso el usuario esta balanceado
 * @param textoUsuario texto que el usuario ingresa
 * @return mensaje de confirmacion
 */
    public String balancear(String textoUsuario) {

        Pila pila = new Pila();
        int intentos = 0;
        for (int i = 0; i < textoUsuario.length(); i++) {
            switch (textoUsuario.charAt(i)) {

                case '{':
                    pila.push(textoUsuario.charAt(i));
                    break;
                case '(':
                    pila.push(textoUsuario.charAt(i));
                    break;
                case '<':
                    pila.push(textoUsuario.charAt(i));
                    break;
                case '[':
                    pila.push(textoUsuario.charAt(i));
                    break;
                case '}':
                    if (pila.pop().equals('{')) {
                        pila.pop();
                        break;
                    }
                    intentos++;
                    break;
                case ')':
                    if (pila.pop().equals('(')) {
                        pila.pop();
                        break;
                    }

                    intentos++;
                    break;
                case ']':
                    if (pila.pop().equals('[')) {
                        pila.pop();
                        break;
                    }
                    intentos++;
                    break;

                case '>':
                    if (pila.pop().equals('<')) {
                        pila.pop();
                        break;
                    }
                    intentos++;
                    break;

                default:
                    intentos++;
                    break;
            }
        }

        if (intentos > 0) {
            textoUsuario = "No balanceados,porfavor verifique que ingreso los caracteres correctamente o en el orden correcto";
        }

        if (intentos == 0 && pila.estaVacia()) {
            textoUsuario = "Estan  balanceados";
        }

        return textoUsuario;
    }

}
