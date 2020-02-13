package Herencia2;

public class Trabajador extends PersonaH {
    protected int sueldo;

    public Trabajador(String nombreNuevo, String apellidoNuevo) {
        super(nombreNuevo, apellidoNuevo);
    }

    public Trabajador(String nombreNuevo, String apellidoNuevo, int sueldo) {
        super(nombreNuevo, apellidoNuevo);
        this.sueldo = sueldo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tambié lo llamo desde Trabajador");
    }
}
