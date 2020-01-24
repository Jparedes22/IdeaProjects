package ConsumicionAplicacion;

import java.util.ArrayList;

public class Cuenta {
    ArrayList<Articulo> cuenta=new ArrayList<>();
    int id;
    boolean estado;
    public void agregarArticulos(Articulo articulo) {
cuenta.add(articulo);
    }
    public int numeroArt(){
        cuenta.size();
        return cuenta.size();
    }

public double costeTotal(){
        double costeTotal=0.0;
    for (Articulo coste:cuenta) {
        costeTotal+=coste.getCoste();
    }
    return costeTotal;
}

    public void setEstado(){
        this.estado=estado;
    }

}
