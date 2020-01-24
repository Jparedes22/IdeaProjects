package Taller;

public class Motor {
   private int cv;
   private double cilindrada;
   public Motor (int cv, double cilindrada){
       this.cv=cv;
       this.cilindrada=cilindrada;
   }
    public int getCV(){
        return cv;
    }
    public double getCilindrada(){
        return cilindrada;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
}
