package herencia;

public class Persona {
    private String nombre, apellido, dni;

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;

    }
    public Persona(){

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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public void setDni(String dni) {
        this.dni = dni;
    }

   /* @Override
    public String toString() {
        return super.toString() + " " + getNombre();
    }*/
}
