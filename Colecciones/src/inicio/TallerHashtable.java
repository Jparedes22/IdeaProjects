package inicio;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class TallerHashtable {
    static Scanner sc = new Scanner(System.in);
    static Hashtable<String, Object[]> coches;

    public static void main(String[] args) {
        coches = new Hashtable();
        int opcion;
        do {
            System.out.println("1. Agregar coche");
            System.out.println("2. Listar coche");
            System.out.println("3. Buscar coche");
            System.out.println("4. Eliminar coche");
            System.out.println("5. Calcular costes");
            System.out.println("6. Vaciar coches");
            System.out.println("7. Salir");
            System.out.println("Introduce una opción");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    agregarCoche();

                    break;
                case 2:
                    listarCoches();

                    break;
                case 3:
                    break;
                case 4:


                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    System.out.println("Saliendo...");

                    break;
                default:
                    System.out.println("Introduzca una opción válida");
                    break;
            }
        } while (opcion != 7);
    }

    public static void buscarMatricula(String matricula) {
        if(coches.contains(matricula));
        Object[] encontrado = coches.get(matricula);
    }

    public static void listarCoches() {
        Enumeration<Object[]> cochesRecuperados = coches.elements();
        while (cochesRecuperados.hasMoreElements()) {
            Object[] recuperado = cochesRecuperados.nextElement();
            for(Object item:recuperado){
                System.out.print(item + " ");
            }
        }
    }

    public static void agregarCoche() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce modelo");
        String modelo = sc.next();
        System.out.println("Introduce cv");
        int cv = sc.nextInt();
        System.out.println("Introduce matricula");
        String matricula = sc.next();
        System.out.println("Introduce coste");
        double coste = sc.nextDouble();

        if (coches.containsKey(matricula)) {
            System.out.println("No puedo agregarlo");
        } else {
            Object[] unCoche = {modelo, cv, matricula, coste};
            coches.put(matricula, unCoche);
            System.out.println("Coche agregado correctamente");
        }
    }
}
