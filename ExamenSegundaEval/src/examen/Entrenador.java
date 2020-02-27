package examen;

public final class Entrenador extends Persona implements Seleccionable {
    private int sueldo;
    Vocaciones vocacion;

    public Entrenador(String nombre, String apellido, String dni, int edad, int sueldo,Vocaciones vocacion) {
        super(nombre, apellido, dni, edad);
        this.sueldo = sueldo;
        this.vocacion=vocacion;
    }

    @Override
    public void recibirBonificacion() {
        int eSueldo = this.sueldo + (int) (Math.random() * 200) + 100;
    }

    @Override
    public int pagarSueldo() {
        return this.sueldo;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + String.format("Sueldo: %s ", sueldo) + "Vocacion: " + vocacion;
    }
}
