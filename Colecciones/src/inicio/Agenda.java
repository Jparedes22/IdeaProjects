package inicio;

import java.util.ArrayList;
import java.util.Scanner;


public class Agenda {
    static ArrayList<Object[]> persona;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        persona = new ArrayList<>();
        int opcion;
        do {
            System.out.println("1. Agregar Persona");
            System.out.println("2. Buscar Persona");
            System.out.println("3. Borrar Persona");
            System.out.println("4. Listar Persona");
            System.out.println("5. Salir");
            System.out.println("Introduce la opción que quieras");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    agregarPersona();
                    break;
                case 2:
                    System.out.println("Introduce un DNI");
                    String newDni = sc.next();
                    buscarPersona(newDni);
                    break;
                case 3:
                    System.out.println("Introduce el DNI de la persona que quieres eliminar");
                    String dniBorrar = sc.next();
                    eliminarPersona(dniBorrar);
                    break;
                case 4:
                    listarPersonas();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Introduce una opción válida");
                    break;
            }

        } while (opcion != 5);
    }


    public static void agregarPersona() {
        System.out.println("Introduce nombre");
        String nombre = sc.next();
        System.out.println("Introduce apellido");
        String apellido = sc.next();
        System.out.println("Introduce teléfono");
        int telefono = sc.nextInt();
        System.out.println("Introduce dni");
        String dni = sc.next();
        Object[] unaPersona = {nombre, apellido, telefono, dni};

        if (persona.isEmpty()) {
            persona.add(unaPersona);
        } else {
            int encontrados = 0;
            for (Object[] elemento : persona) {
                if (elemento[3].equals(dni)) {
                    encontrados++;
                    break;
                }
            }
            if (encontrados > 0) {
                System.out.println("El coche ya existe");

            } else {
                persona.add(unaPersona);
            }
        }

    }

    public static void buscarPersona(String dni) {
        if (!persona.isEmpty()) {
            for (Object[] elemento : persona) {
                if (elemento[3].equals(dni)) {
                    for (Object item : elemento) {
                        System.out.printf(item + " ");
                    }
                    System.out.println();
                    break;
                }
            }
        } else {
            System.out.println("La lista está vacía");
        }
    }

    public static void eliminarPersona(String borrar) {
        Object[] borrado = null;
        for (int i = 0; i < persona.size(); i++) {
            Object[] elemento = persona.get(i);
            if (elemento[3].equals(borrar)) {
                borrado = persona.remove(i);
                break;
            }
        }
        System.out.println("Persona eliminada correctamente");
    }

    public static void listarPersonas() {
        if (persona.isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            for (Object[] elemento : persona) {
                for (Object item : elemento) {
                    System.out.println(item + " ");
                }
                System.out.println();
            }
        }
    }
}