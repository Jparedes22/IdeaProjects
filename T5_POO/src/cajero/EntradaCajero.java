package cajero;

import java.util.Hashtable;
import java.util.Scanner;

public class EntradaCajero {
    public static void main(String[] args) {
      /*  Cuenta cuenta = new Cuenta(1, 123, 1000);
        cuenta.ingresar(200);
        cuenta.sacar(2000);

        Persona persona = new Persona("joze", "apellido", "ASD", cuenta);
        Cuenta cuenta2 = new Cuenta(2, 1234,8756);
        persona.agregarCuenta(cuenta2);
        persona.listarCuentas();
        Persona persona2=new Persona("df","gwef","awd");
        persona2.listarCuentas(); */

        Hashtable<String, Persona> listaBanco = new Hashtable();
        Scanner sc = new Scanner(System.in);
        int id = 0;

        int opcion;
        do {
            System.out.println("1. Crear cuenta");
            System.out.println("2. Sacar dinero");
            System.out.println("3. Ingresar dinero");
            System.out.println("4 Mostrar datos");
            System.out.println("5. Salir");
            System.out.println("Introduce opción");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce nombre, apellido y DNI");
                    String nombre = sc.next();
                    String apellido = sc.next();
                    String dni = sc.next();
                    System.out.println("Introduce pin y saldo");
                    int pin = sc.nextInt();
                    double saldo = sc.nextDouble();
                    Cuenta cuenta = new Cuenta(id, pin, saldo);
                    Persona persona = new Persona(nombre, apellido, dni, cuenta);
                    listaBanco.put(persona.getDni(), persona);
                    id++;
                    break;
                case 2:
                    System.out.println("introduce dni");
                    String dniSacar=sc.next();
                    if(listaBanco.contains(dniSacar)){
                        System.out.println("introduce pin");
                        int pinSacar=sc.nextInt();
                         persona= listaBanco.get(dniSacar);

                    }
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("introduce dni");
                    String dniBuscar = sc.next();
                    if (listaBanco.contains(dniBuscar)) {
                        Persona persona1 = listaBanco.get(dniBuscar);
                        persona1.listarCuentas();
                    } else {
                        System.out.println("No hay clientes con ese dni");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;

            }
        } while (opcion != 5);

    }
}
