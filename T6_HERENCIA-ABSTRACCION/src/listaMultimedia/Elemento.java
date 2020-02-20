package listaMultimedia;

public abstract class Elemento {

    protected int idenificador;
    protected String titulo, autor, formato;
    protected double tamaño;

    public Elemento(int idenificador, String titulo, String autor, String formato, double tamaño) {
        this.idenificador = idenificador;
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.tamaño = tamaño;
    }

    public int getIdenificador() {
        return idenificador;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFormato() {
        return formato;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setIdenificador(int idenificador) {
        this.idenificador = idenificador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }


    public String mostrarDatos() {
        return String.format("%d, %s, %s, %s, %.2f,", idenificador, titulo, autor, formato, tamaño);
    }
}
