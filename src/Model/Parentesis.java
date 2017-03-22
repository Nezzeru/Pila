package Model;
/**
 *
 * Clase para verificar que los parentesis de una expresion estan balanceados
 * (Al ejecutarlo poner entre comillas la expresion por los parentesis)
 * @author ALG
 * @version 1a. ed.
 */
public class Parentesis {
  Pila pila = new Pila();  // Pila para guardar los parentesis de apertura

  public static void main (String [] pps) {
      if (pps.length != 1) {
	  System.out.println("Forma de uso: java Parentesis expresion");
      } else {
	  new Parentesis(pps[0]);
      }
  }

    /*
     * Metodo para verificar que una expresion tiene balanceados sus parentesis
     * @param linea -- cadena que tiene la expresion a examinar
     */
  public Parentesis (String linea) {
      for (int i = 0; i < linea.length(); i++) {
	  if (linea.charAt(i) == '(') pila.push(new Character(')'));
	  else if (linea.charAt(i) == '{') pila.push(new Character('}'));
	  else if (linea.charAt(i) == '[') pila.push(new Character(']'));
	  else if (linea.charAt(i) == ')') verifica(')');
	  else if (linea.charAt(i) == '}') verifica('}');
	  else if (linea.charAt(i) == ']') verifica(']');
      }

      if (pila.estaVacia())
	  System.out.println("Parentesis balanceados");
      else 
	  System.out.println("Parentesis NO balanceados");	  
  }

    /*
     * Metodo privado que recibe un parentesis de cerrado y verifica que en
     * el tope de la pila se encuentre el de apertura
     * @param c -- parentesis de cerrado
     */
  private void verifica (char c) {
      if (pila.estaVacia()) {
	  System.out.println("Parentesis NO balanceados"); 
	  System.exit(0); 
      } else {
	  Character s = (Character) pila.pop();  
	  if (c != s.charValue()) {
	      System.out.println("Parentesis NO balanceados"); 
	      System.exit(0); 
	  }
      }
  }
}