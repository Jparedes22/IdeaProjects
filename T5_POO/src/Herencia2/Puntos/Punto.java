package Herencia2.Puntos;


import java.awt.*;

public class Punto {
    Point point;
    int x;
    int y;

    public Punto(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public void mover(int x, int y) {
        point.move(1, 2);
    }

    public void trasladar(int dx, int dy) {
        point.translate(4, 5);
    }
}
