package Herencia2.Puntos;

import java.awt.*;

public class Punto3D extends Punto {

    protected int z;

    public Punto3D( int x, int y, int z) {

        super(x, y);
        this.z = z;
    }


    public void mover(int x, int y, int z) {
        super.mover(x, y);
        this.z = z;
    }


    public void trasladar(int dx, int dy, int dz) {
        super.trasladar(dx, dy);
        this.z += dz;
    }

    @Override
    public String toString() {
        return "Punto3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
