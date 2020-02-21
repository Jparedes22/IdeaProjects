package ejemploEnum;

public class LlamdaInternacional {

    public enum EnumCoste{
        TARIFA_MAÑANA,TARIFA_TARDE,TARIFA_NOCHE;
    }
    private double coste;


    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }
}
