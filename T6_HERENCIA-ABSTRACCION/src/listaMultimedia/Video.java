package listaMultimedia;

public final class Video extends Elemento {

    private String director, actores;

    public Video(int idenificador, String titulo, String autor, String formato, double tamaño, String director, String actores) {
        super(idenificador, titulo, autor, formato, tamaño);
        this.director = director;
        this.actores = actores;
    }

    public String getDirector() {
        return director;
    }

    public String getActores() {
        return actores;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + String.format(" %s, %s %n", director, actores);
    }
}
