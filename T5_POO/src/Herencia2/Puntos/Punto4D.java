package Herencia2.Puntos;

import java.awt.*;

public class Punto4D extends Punto3D {
    protected int w;

    public Punto4D(int x, int y, int z, int w) {
        super(x, y, z);
        this.w = w;
    }


    public void mover(int x, int y, int z, int w) {
        super.mover(x, y, z);
        this.w = w;
    }


    public void trasladar(int dx, int dy, int dz, int dw) {
        super.trasladar(dx, dy, dz);
        this.w += dw;
    }

    @Override
    public String toString() {
        return "Punto4D{" +
                "w=" + w +
                ", z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
