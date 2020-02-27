package examen;

import java.util.Enumeration;
import java.util.Hashtable;

public class Seleccion {

    Hashtable<String, Directivo> listaDirectivos = new Hashtable();
    Hashtable<String, Seleccionable> listaSeleccionables = new Hashtable();
    private String nombre;

    public Seleccion(String nombre) {

        this.nombre = nombre;
    }

    public void pagar(String dni, int sueldo) {


    }

    public void listarDirectivos() {

        Enumeration<Directivo> directivos = listaDirectivos.elements();
        while (directivos.hasMoreElements()) {
            Persona listaDirectivos = directivos.nextElement();
            System.out.println(listaDirectivos.mostrarDatos());

        }
    }

    public void listarSeleccionables() {
        Enumeration<Seleccionable> seleccionables = listaSeleccionables.elements();
        while (seleccionables.hasMoreElements()) {
            Persona listaSeleccionables = (Persona) seleccionables.nextElement();
            System.out.println(listaSeleccionables.mostrarDatos());
        }
    }

    public void contratar(Directivo directivo) {
        listaDirectivos.put(directivo.getDni(), directivo);
    }

    public void convocarJ(Jugador jugador) {
        listaSeleccionables.put(jugador.getDni(), jugador);


    }

    public void convocarE(Entrenador entrenador) {

        listaSeleccionables.put(entrenador.getDni(), entrenador);

    }

    public void mostrarGastosSueldos() {

    }

}
