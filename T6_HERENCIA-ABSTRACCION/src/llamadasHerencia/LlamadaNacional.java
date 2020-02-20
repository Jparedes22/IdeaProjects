package llamadasHerencia;

public class LlamadaNacional extends Llamada {

   private int franja;

    public LlamadaNacional(int nOrigen, int nDestino, double duracion, int franja) {
        super(nOrigen, nDestino, duracion);
        this.franja = franja;

    }

    public double costeNacional(int duracion) {

        return coste;
    }

    @Override
    public void calcularCoste() {

    }
}
