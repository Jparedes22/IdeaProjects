package pedidos;

import java.util.Scanner;

public class Carrito {
    public static void main(String[] args) {
        Producto producto;
        Pedidos pedidos = new Pedidos();

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("==============================================");
            System.out.println("1. Añadir Producto");
            System.out.println("2. Ver Carrito");
            System.out.println("3. Salir");
            System.out.println("==============================================");
            System.out.println("Elige la opción que quieras");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce nombre");
                    String nombre = sc.next();

                    System.out.println("Introduce localización");
                    String localizacion = sc.next();

                    System.out.println("Introduce el precio");
                    double precio = sc.nextDouble();

                    System.out.println("Introduce código");
                    String codigo = sc.next();

                    producto = new Producto(nombre, localizacion, precio, codigo);
                    pedidos.agregarProducto(producto);

                    break;
                case 2:
                    pedidos.listarProducto();
                    break;
                case 3:
                    System.out.println("Gracias por su compra");
                    break;
                default:
                    System.out.println("Introduce una opción válida");
                    break;
            }
        } while (opcion != 3);
    }
}
