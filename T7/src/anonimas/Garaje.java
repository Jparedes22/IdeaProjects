package anonimas;

import java.util.ArrayList;

public class Garaje {

    private ArrayList<Coche> coches;

    public Garaje() {
        coches = new ArrayList();
    }

    public void addCoche(Coche c) {
        if (coches.contains(c)) {
            System.out.println("El coche ya está en el garaje");
        }
    }

    public void removerCoche(Coche c) {
        if (coches.contains(c)) {
            System.out.println("Coche eliminado");
            coches.remove(c);
        } else {
            System.out.println("No se ha podido eliminar el coche");
        }
    }
}
