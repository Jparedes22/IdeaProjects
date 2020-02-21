package inicio;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtablesEntrada {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable();
        hashtable.put(1, "elemento uno");
        hashtable.put(2, "elemento dos");
        hashtable.put(3, "elemento tres");
        /** System.out.println(hashtable.size());
         String elemento=hashtable.get(1);
         hashtable.remove(1);
         System.out.println(hashtable.size());
         System.out.println(elemento);**/
        /**  boolean existe = hashtable.containsKey(1);
         Enumeration elementos = hashtable.elements();
         while(elementos.hasMoreElements()){
         String elemento=(String) elementos.nextElement();
         System.out.println(elemento);
         }**/


        Enumeration<Integer> claves = hashtable.keys();
        while (claves.hasMoreElements()) {
            Integer clave = claves.nextElement();
            String objeto = hashtable.get(clave);
            System.out.println(objeto);
        }
    }
}
