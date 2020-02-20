package trigonometriaHerencia;

public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        area = 2 * Math.PI * Math.pow(radio, 2);
        return area;
    }
}
