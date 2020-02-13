package Herencia2;

import herencia.Persona;

public class Jefe extends Trabajador {
    protected int horas;

    public Jefe(String nombreNuevo, String apellidoNuevo, int sueldo) {
        super(nombreNuevo, apellidoNuevo, sueldo);
        this.horas = horas;

    }

    public Jefe(String nombreNuevo, String apellidoNuevo, int sueldo, int horas) {
        super(nombreNuevo, apellidoNuevo, sueldo);
        this.horas = horas;
    }

    public void despedir() {

    }
}

