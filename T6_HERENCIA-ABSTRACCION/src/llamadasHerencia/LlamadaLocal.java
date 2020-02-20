package llamadasHerencia;

public class LlamadaLocal extends Llamada {

    public LlamadaLocal(int nOrigen, int nDestino, int duracion) {
        super(nOrigen, nDestino, duracion);
    }

    public double costeLocal(int duracion) {
        this.coste = duracion * 0;
        return coste;
    }

    @Override
    public void calcularCoste() {

    }
}
