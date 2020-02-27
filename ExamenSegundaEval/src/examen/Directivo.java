package examen;

public final class Directivo extends Persona {


    public Directivo(String nombre, String apellido, String dni, int edad) {
        super(nombre, apellido, dni, edad);
    }


    @Override
    public void recibirBonificacion() {
        System.out.println("No aplicable");
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos();
    }
}
