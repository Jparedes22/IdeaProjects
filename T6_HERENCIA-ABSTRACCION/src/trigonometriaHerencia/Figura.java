package trigonometriaHerencia;

public abstract class Figura {

    protected double area;

    public abstract double calcularArea();

    public void lanzarMensaje() {
        System.out.println("Mensaje lanzaado desde la clase figura");
    }
}
