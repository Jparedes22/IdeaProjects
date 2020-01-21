package UR;

import java.util.Scanner;

public class FMSESP {
    static Scanner sc = new Scanner(System.in);
    static int opcionDos;

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("1. Ver Tabla");
            System.out.println("2. Elegir Participante");
            System.out.println("3. Ver Ascenso");
            System.out.println("4. Salir");
            System.out.println("Elige la opción que quieras");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    tabla();
                    break;
                case 2:
                    participantes();

                    break;
                case 3:
                    ascenso();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Introduce una opción válida");
                    break;
            }
        } while (opcion != 4);
    }

    public static void participantes() {
        do {
            System.out.println("1. Chuty");
            System.out.println("2. Skone");
            System.out.println("3. Bnet");
            System.out.println("4. Blon");
            System.out.println("5. Errecé");
            System.out.println("6. Walls");
            System.out.println("7. Mr. Ego");
            System.out.println("8. Zasko");
            System.out.println("9. Force");
            System.out.println("10. BTA");
            System.out.println("11. Salir");
            System.out.println("");
            System.out.println("===========================================");
            System.out.println("Elige la opción que quieras");

            opcionDos=sc.nextInt();

            switch (opcionDos) {
                case 1:
                    System.out.println("J1. Victoria");
                    System.out.println("J2. Victoria");
                    System.out.println("J3. Victoria");
                    System.out.println("J4. Derrota con Réplica");
                    System.out.println("J5. Victoria");
                    System.out.println("J6. Victoria");
                    System.out.println("J7. Victoria");
                    System.out.println("J8. Victoria");
                    System.out.println("J9. Victoria");
                    System.out.println("");
                    System.out.println("===========================================");
                    break;
                case 2:
                    System.out.println("J1. Victoria");
                    System.out.println("J2. Victoria");
                    System.out.println("J3. Derrota");
                    System.out.println("J4. Victoria con Réplica");
                    System.out.println("J5. Victoria");
                    System.out.println("J6. Victoria");
                    System.out.println("J7. Victoria");
                    System.out.println("J8. Victoria con Réplica");
                    System.out.println("J9. Victoria");
                    System.out.println("");
                    System.out.println("===========================================");
                    break;
                case 3:
                    System.out.println("J1. Victoria");
                    System.out.println("J2. Victoria");
                    System.out.println("J3. Victoria");
                    System.out.println("J4. Victoria");
                    System.out.println("J5. Victoria");
                    System.out.println("J6. Derrota con Réplica");
                    System.out.println("J7. Victoria");
                    System.out.println("J8. Derrota");
                    System.out.println("J9. Derrota");
                    System.out.println("");
                    System.out.println("===========================================");
                    break;
            }
        } while (opcionDos != 11);
    }

    public static void ascenso() {
        System.out.println("1. Mnak 104.750 pts");
        System.out.println("2. Gazir 103.550 pts");
        System.out.println("3. Sweet Pain 91.900 pts");
        System.out.println("4. Tirpa 74.300 pts");
        System.out.println("5. Jesús LC 60.400 pts");
        System.out.println("6. Botta 47.750 pts");
        System.out.println("7. Vivi 43.150 pts");
        System.out.println("8. Aigor 36.150 pts");
        System.out.println("9. Hander 34.700 pts");
        System.out.println("10. Xinako 30.050 pts");
        System.out.println("");
        System.out.println("===========================================");
    }

    public static void tabla() {
        System.out.println("1. Chuty 25 pts");
        System.out.println("2. Skone 21 pts");
        System.out.println("3. Bnet 19 pts");
        System.out.println("4. Blon 16 pts");
        System.out.println("5. Errecé 12 pts");
        System.out.println("6. Walls 11 pts");
        System.out.println("7. Mr. Ego 10 pts");
        System.out.println("8. Zasko 8 pts");
        System.out.println("9. Force 7 pts");
        System.out.println("10. BTA 6 pts");
        System.out.println("");
        System.out.println("===========================================");
    }

}