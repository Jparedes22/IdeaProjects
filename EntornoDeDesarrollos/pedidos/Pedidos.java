package pedidos;

import java.util.Enumeration;
import java.util.Hashtable;

public class Pedidos {

    private Hashtable<String, Producto> pedido = new Hashtable();


    public void agregarProducto(Producto producto) {

        if (pedido.isEmpty()) {
            pedido.put(producto.getCodigo(), producto);
        } else {
            if (pedido.containsKey(producto.getCodigo())) {
                System.out.println("\nEste código ya esta registrado, no se puede añadir");
            } else {
                pedido.put(producto.getCodigo(), producto);
                System.out.println("\nProducto guardado");
            }
        }
    }

    public void listarProducto() {
        if (pedido.isEmpty()) {
            System.out.println("Opcion no disponible, el carrito está vacío");
        } else {
            Enumeration<Producto> pedidos = pedido.elements();
            while (pedidos.hasMoreElements()) {
                Producto listaProductos = pedidos.nextElement();
                System.out.println(listaProductos.getDatos());
            }
        }
    }
}
