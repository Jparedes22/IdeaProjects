package listaMultimedia;

import java.util.ArrayList;

public class Coleccion {
    private ArrayList<Elemento> listaElementos;

    public Coleccion() {
        listaElementos = new ArrayList();
    }

    public void agregarElemento(Elemento elemento) {

        if (listaElementos.isEmpty() == true) {
            listaElementos.add(elemento);
        } else {

            boolean existe = false;
            for (Elemento item : listaElementos) {
                if (item.getIdenificador() == elemento.getIdenificador()) {
                    System.out.println("No se puede");
                    existe = true;
                    break;
                }
                if (existe) {
                    System.out.println("El elemento ya existe");
                }
            }
        }
    }

    public void eliminarElementos(int identificador) {
        if (listaElementos.isEmpty()) {
            System.out.println("No hay elementos para borrar");
        } else {

            boolean existe = false;
            Elemento elemento = null;
            for (Elemento item : listaElementos) {
                if (item.getIdenificador() == identificador) {
                    existe = true;
                    elemento = item;
                }
            }
            if (existe == true) {
                listaElementos.remove(elemento);
            } else {
                System.out.println("No se ha encontrado");
            }
        }
    }

    public void listarElementos(String nombreClase) {


            for (Elemento item : listaElementos) {
                if (item.getClass().getSimpleName().equals(nombreClase)) {
                System.out.println(item.mostrarDatos());
            }else {
                    for (Elemento item2 : listaElementos) {
                        if (item2.getClass().getSimpleName().equalsIgnoreCase(nombreClase)) {
                            System.out.println(item.mostrarDatos());
                        }
                    }
                }
        }
    }

}
