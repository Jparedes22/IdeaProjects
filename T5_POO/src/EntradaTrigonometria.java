import Trigonometria.Triangulo;

import java.util.Scanner;

public class EntradaTrigonometria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int opcionT;
        int opcionC;
        int opcionCuad;
        do {
            System.out.println("1. Trabajar con triangulo");
            System.out.println("2. Trabajar con círculo");
            System.out.println("3. Trabajar con cuadrado");
            System.out.println("4. Salir");
            System.out.println("Introduce la opcion que quieras");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    //TRIANGULO
                    do {
                        System.out.println("Introuce base");
                        int base = sc.nextInt();
                        System.out.println("Introuce altura");
                        int altura = sc.nextInt();
                        System.out.println("1. Calcular área");
                        System.out.println("2. Mostrar datos");
                        System.out.println("3. Salir");
                        opcionT = sc.nextInt();
                        switch (opcionT) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                System.out.println("Saliendo...");
                                break;
                            default:
                                System.out.println("Introduce una opción válida");
                        }
                    } while (opcionT != 3);

                    break;
                case 2:
                    // CIRCULO
                    System.out.println("Introduce diametro");
                    int diametro = sc.nextInt();
                    System.out.println("¿Qué operación quieres hacer?");
                    System.out.println("1. Calcular área");
                    System.out.println("2. Calcular diametro");
                    System.out.println("3. Mostrar datos");
                    System.out.println("4. Salir");
                    opcionC = sc.nextInt();
                    switch (opcionC) {
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.out.println("Introduce una opción válida");
                            break;

                    }
                    break;
                case 3:
                    //CUADRADO

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Introduce una opcion correcta");
            }
        } while (opcion != 4);
    }
}
