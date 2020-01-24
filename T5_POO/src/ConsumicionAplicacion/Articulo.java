package ConsumicionAplicacion;


public class Articulo {
    String nombre;
    int coste;

    public Articulo(String nombre, int coste ){
        this.nombre=nombre;
        this.coste=coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public int getCoste() {
        return coste;
    }
}
