package listaMultimedia;

public final class Audio extends Elemento {

    private double duracion;
    private String soporte;

    public Audio(int idenificador, String titulo, String autor, String formato, double tamaño, int duracion, String soporte) {
        super(idenificador, titulo, autor, formato, tamaño);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    public double getDuracion() {
        return duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + String.format(" %.2f, %s %n", duracion, soporte);
    }
}
