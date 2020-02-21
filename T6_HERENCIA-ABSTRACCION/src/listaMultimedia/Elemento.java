package listaMultimedia;

public abstract class Elemento {
    int idenificador;
    String titulo;
    String autor;
    String formato;
    double tamaño;

    public Elemento(int idenificador, String titulo, String autor, String formato, double tamaño) {
        this.idenificador = idenificador;
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.tamaño = tamaño;
    }

    public String mostrarDatos() {
        String mensaje = "%d %s %s %s %.2f";
        return String.format(mensaje, this.idenificador, this.titulo, this.autor, this.formato, this.tamaño);
    }
}
