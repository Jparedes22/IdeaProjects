package examen;

public abstract class Persona {
    protected String nombre, apellido, dni;
    protected int edad;

    public Persona(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String mostrarDatos() {
        String mensaje = "Nombre: %s, Apellido: %s, Edad: %d";
        return String.format(mensaje, nombre, apellido, edad);
    }

    public abstract void recibirBonificacion();
}
