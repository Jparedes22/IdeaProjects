package llamadasHerencia;

public abstract class Llamada {
   protected int nOrigen, nDestino;
    double coste,duracion;
    public Llamada(int nOrigen, int nDestino,  double duracion) {
        this.nOrigen = nOrigen;
        this.nDestino = nDestino;
        this.duracion=duracion;
    }

    public int getnOrigen() {
        return nOrigen;
    }

    public int getnDestino() {
        return nDestino;
    }

    public double getCoste() {
        return coste;
    }

    public void setnOrigen(int nOrigen) {
        this.nOrigen = nOrigen;
    }

    public void setnDestino(int nDestino) {
        this.nDestino = nDestino;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public abstract void calcularCoste();
}
