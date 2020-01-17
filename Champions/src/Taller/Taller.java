package Taller;

import java.util.ArrayList;
import java.util.Scanner;

public class Taller {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Object[]> coches;

    public static void main(String[] args) {
        coches = new ArrayList<>();
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
                    System.out.println("Introduce la matricula");
                    String newMatricula = sc.next();
                    buscarCoche(newMatricula);
                    break;
                case 4:

                    System.out.println("Introduce la matricula del coche que quieres eliminar");
                    String matriculaBorrar = sc.next();
                    eliminarCoche(matriculaBorrar);
                    break;
                case 5:
                    System.out.printf("El coste acumulado es: %.2f %n", calcularCostes());
                    System.out.printf("El coste medio es: %.2f %n", calcularCostes() / coches.size());
                    break;
                case 6:
                    coches.clear();
                    System.out.println("Lista Borrada");
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

    public static double calcularCostes() {
        double costes = 0.0;
        for (Object[] elemento : coches) {
            double costeIndividual = (double) elemento[3];
            costes += costeIndividual;
        }
        return costes;
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
        Object[] unCoche = {modelo, cv, matricula, coste};

        if (coches.isEmpty()) {
            coches.add(unCoche);
        } else {
            int encontrados = 0;
            for (Object[] elemento : coches) {
                if (elemento[2].equals(matricula)) {
                    encontrados++;
                    break;
                }
            }
            if (encontrados > 0) {
                System.out.println("El coche ya existe");

            } else {
                coches.add(unCoche);
            }
        }
    }

    public static void listarCoches() {

        for (Object[] elemento : coches) {
            for (Object item : elemento) {
                System.out.println(item + " ");
            }
            System.out.println();
        }
    }

    public static void buscarCoche(String matricula) {
if(!coches.isEmpty()) {
    for (Object[] elemento : coches) {
        if (elemento[2].equals(matricula)) {
            for (Object item : elemento) {
                System.out.println(item + " ");
            }
            System.out.println();
            break;
        }
    }
}else{
    System.out.println("La lista está vacía");
}
    }

    public static void eliminarCoche(String borrar) {
        Object[] borrado = null;
        for (int i = 0; i < coches.size(); i++) {
            Object[] elemento = coches.get(i);
            if (elemento[2].equals(borrar)) {
                borrado = coches.remove(i);
                break;
            }

        }
        if (borrado != null) {
            System.out.println("Coche borrado correctamente");
        } else {
            System.out.println("Coche no encontrado");
        }
    }
}

