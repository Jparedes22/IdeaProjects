package gasolinera;

import java.util.ArrayList;

public class Gasolinera {
    private String nombre;
    ArrayList<Surtidor> surtidores=new ArrayList();
    private int ganancias;

    public Gasolinera(String nombre){
        this.nombre=nombre;
        ganancias=0;
    }
    public int obtenerGanancias(){
        return ganancias;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Surtidor> getSurtidores() {
        return surtidores;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSurtidores(ArrayList<Surtidor> surtidores) {
        this.surtidores = surtidores;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }
}
