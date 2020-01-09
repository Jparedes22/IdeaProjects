package inicio;

import java.io.OutputStream;
import java.util.ArrayList;

public class ArrayListEntrada {
    static ArrayList<String> listaPalabras;

    public static void main(String[] args) {
        int longitud;
        boolean completado;
        listaPalabras = new ArrayList();
        agregarElemento("palabra uno");
        agregarElemento("palabra dos");
        agregarElemento("palabra tres");
        agregarElemento("palabra cuatro");
        agregarElemento("palabra cinco");
        listaPalabras.size();

        longitud = listaPalabras.size();

        //recorrerCualquierArray(listaPalabras);
        //listaPalabras.remove("palabra uno");
        //listaPalabras.remove(0);
        borrarElemento("palabra uno");
        listaPalabras.size();
        longitud = listaPalabras.size();
        recorrerArray();
        System.out.println(longitud);
    }


    public static void agregarElemento(String palabra) {
        listaPalabras.add(palabra);

    }

    public static void recorrerArray() {
        for (String palabra : listaPalabras) {
            System.out.println(palabra);
        }
    }

    public static void recorrerCualquierArray(ArrayList lista) {
        for (Object dato : lista) {
            System.out.println(dato);
        }
    }

    public static void borrarElemento(String elemento) {
for(int i=0;i<listaPalabras.size();i++){
    if(elemento.equals(listaPalabras.get(i))){
        listaPalabras.remove(i);
        break;
    }
}
    }
}
