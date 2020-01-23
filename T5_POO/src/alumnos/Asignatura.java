package alumnos;

public class Asignatura {
    private int identificador;
    private double calificacion;
        //CONSTRUCTOR
    public Asignatura(int identificador) {
        this.identificador = identificador;
        calificacion = 0.0;
    }


    public int getIdentificador() {
        return identificador;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
