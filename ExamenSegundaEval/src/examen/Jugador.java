package examen;

public final class Jugador extends Persona implements Seleccionable {

    private int sueldo;
    Posiciones posicion;

    public Jugador(String nombre, String apellido, String dni, int edad, int sueldo, Posiciones posicion) {
        super(nombre, apellido, dni, edad);
        this.sueldo = sueldo;
        this.posicion = posicion;
    }

    public int getSueldo() {
        return sueldo;
    }


    public Posiciones getPosicion() {
        return posicion;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void setPosiciones(Posiciones posicion) {
        this.posicion = posicion;
    }

    @Override
    public int pagarSueldo() {
        return sueldo;
    }

    @Override
    public void recibirBonificacion() {
        int jSueldo = this.sueldo + (int) (Math.random() * 500) + 100;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + String.format("Sueldo: %s ", sueldo) + "Posicion: " + posicion;

    }
}
