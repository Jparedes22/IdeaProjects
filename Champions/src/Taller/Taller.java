package Taller;

import java.util.ArrayList;
import java.util.Scanner;

public class Taller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Equipos = new ArrayList<>();
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
            }
        } while (opcion != 7);
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
        Object[] unCoche = {modelo, cv, coste, matricula};

    }
}
