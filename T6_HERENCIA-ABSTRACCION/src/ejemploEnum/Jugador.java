package ejemploEnum;

public class Jugador {

    public enum enumAnidado{
        VALOR1,VALOR2,VALOR3;
    }

    Posicion posicion;
    private String nombre,apellido;

    public Jugador(String nombre, String apellido, Posicion posicion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
}
