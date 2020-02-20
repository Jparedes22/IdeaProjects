package trigonometriaHerencia;

public class EntradaTrigonometria {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(2, 15);
        Rectangulo rectangulo = new Rectangulo(5, 6);
        Circulo circulo = new Circulo(6);


        triangulo.lanzarMensaje();
        triangulo.calcularArea();
        Figura figura = new Rectangulo(23, 23);
        figura.lanzarMensaje();

    }
}
