package inicio;

import java.util.Hashtable;
import java.util.Scanner;

public class AgendaHashtables {
    static Hashtable<Integer, Object[]> persona;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        persona = new Hashtable<>();

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

                    break;
                case 2:
                    System.out.println("Introduce un DNI");
                    String newDni = sc.next();

                    break;
                case 3:
                    System.out.println("Introduce el DNI de la persona que quieres eliminar");
                    String dniBorrar = sc.next();

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Introduce una opción válida");
                    break;
            }
        }while (opcion!=5);
    }
}
