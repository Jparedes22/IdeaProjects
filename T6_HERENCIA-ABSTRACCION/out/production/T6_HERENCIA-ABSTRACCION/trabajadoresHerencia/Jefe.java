package TrabajadoresHerencia;

public final class Jefes extends Trabajador {
private int beneficios,acciones;

    public Jefes(String nombre, String apellido, String dni, int beneficios, int acciones) {
        super(nombre, apellido, dni);
        this.beneficios = beneficios;
        this.acciones = acciones;
    }

    public void despedir(Contratado contratado){
        contratado.setContratado(false);

    }
}
