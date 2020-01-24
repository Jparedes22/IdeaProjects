package agenda;

public class Persona {
    private String nombre, dni;
    private int telefono;

    public Persona(String nombre, String dni, int telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setNombre(String persona_editada_correctamente) {
        this.nombre = nombre;
    }

    public void setDni() {
        this.dni = dni;
    }

    public void setTelefono() {
        this.telefono = telefono;
    }
    public void mostrarDatos(){
        String mensaje="Nombre: %s, DNI:%s, Teléfono: %d %n";
        System.out.printf(String.format(mensaje,getNombre(),getDni(),getTelefono()));
    }

}
