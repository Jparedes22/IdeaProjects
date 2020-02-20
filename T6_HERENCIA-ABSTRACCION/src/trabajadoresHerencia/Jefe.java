package trabajadoresHerencia;

public final class Jefe extends Trabajador {
    private int beneficios, acciones;

    public Jefe(String nombre, String apellido, String dni, int beneficios, int acciones) {
        super(nombre, apellido, dni);
        this.beneficios = beneficios;
        this.acciones = acciones;
    }

    public void despedir(Contratado contratado) {
        contratado.setContratado(false);

    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + String.format("%d, %d %n", beneficios, acciones);
    }
}
