package trabajadoresHerencia;

public abstract class Contratado extends Trabajador{

   protected boolean contratado;
   protected int sueldo;

    public Contratado(String nombre, String apellido, String dni, int sueldo) {
        super(nombre, apellido, dni);
        this.contratado = true;
        this.sueldo = sueldo;
    }

    public boolean isContratado() {
        return contratado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+String.format(" ,%d, %b",sueldo,contratado);
    }
}
