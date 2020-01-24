import agenda.Agenda;
import agenda.Persona;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class EntradaAgenda {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Agenda listaAgenda = new Agenda();


        int opcion;
        do {
            System.out.println("1. Agregar a la persona");
            System.out.println("2. Borrar persona");
            System.out.println("3. Editar persona");
            System.out.println("4. Buscar persona");
            System.out.println("5. Listar persona");
            System.out.println("6. Salir");
            System.out.println("Elige la opción que quieras");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    String nombre = sc.next();
                    String dni = sc.next();
                    int telefono = sc.nextInt();
                    Persona persona = new Persona(nombre, dni, telefono);

                    // agregarPersona(persona);
                    listaAgenda.agregarPersona(persona);

                    break;

                case 2:
                    String dniBorrar = sc.next();
                    listaAgenda.borrar(dniBorrar);
                    break;
                case 3:
                    String dniEditar = sc.next();
                    listaAgenda.editarPersona(dniEditar);
                    break;
                case 4:
                    String dniBuscar = sc.next();
                    listaAgenda.buscarPersona(dniBuscar);
                    break;
                case 5:
                    listaAgenda.listarPersona();
                    break;
                case 6:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Introduce una opción válida");
                    break;
            }
        } while (opcion != 6);

    }
}
