package equipo;

public class Jugador {
    private String nombre, posicion;
    private int calidad;
    private boolean estrella;

    public Jugador(String nombre, String posicion, int calidad) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.calidad = calidad;
        if (calidad > 90) {
            estrella = true;
        }

    }

    public void mostrarDatos() {
        String mensaje = "Nombre: %s, Posición: %s, Calidad: %d, Estrella %b %n";
        System.out.printf(mensaje, this.nombre, this.posicion, this.calidad, this.estrella);
    }

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getCalidad() {
        return calidad;
    }

    public boolean isEstrella() {
        return estrella;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    public void setEstrella(boolean estrella) {
        this.estrella = estrella;
    }
}
