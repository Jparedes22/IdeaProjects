package agenda;

import java.util.Enumeration;
import java.util.Hashtable;

public class Agenda {

    Hashtable<String, Persona> listaPersonas = new Hashtable<>();

    public void agregarPersona(Persona persona) {
        if (listaPersonas.containsKey(persona.getDni())) {
            System.out.println("La persona ya existe");

        } else {
            listaPersonas.put(persona.getDni(), persona);
            System.out.println("Persona agregada correctamente");

        }

    }

    public void borrar(String dni) {
        if (listaPersonas.containsKey(dni)) {
            listaPersonas.remove(dni);
            System.out.println("Persona borrada correctamente");
        } else {
            System.out.println("La persona no existe");
        }
    }

    public void listarPersona() {
        Enumeration<Persona> personas = listaPersonas.elements();
        while (personas.hasMoreElements()) {
            Persona personaEncontrada = personas.nextElement();
            personaEncontrada.mostrarDatos();
        }

    }

    public void editarPersona(String dni) {
        if (listaPersonas.containsKey(dni)) {

            Persona personaEncontrada = listaPersonas.get(dni);
            personaEncontrada.setNombre("Persona editada correctamente");
            listaPersonas.remove(personaEncontrada.getDni(), personaEncontrada);
            System.out.println("Persona editada correctamente");
        } else {
            System.out.println("La persona no existe");
        }
    }

    public void buscarPersona(String dni) {
        if (listaPersonas.containsKey(dni)) {
            //FORMA MÁS LARGA:
            /*Persona personaEncontrada=listaPersona.get(dni);
            personaEncontrada.mostrarDatos(); */

            //FORMA MÁS SIMPLIFICADA
            listaPersonas.get(dni).mostrarDatos();
        }

    }

}
