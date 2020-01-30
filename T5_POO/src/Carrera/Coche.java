package Carrera;

public class Coche {
    private int cv, velocidad;
    private String matricula, modelo;
    private double km;

    public Coche() {
        this.cv = 0;
        this.velocidad = 0;
        this.matricula = "0000AAA";
        this.modelo = "sin especificar";
        this.km = 0.0;
    }

    public Coche(String matricula, String modelo, int cv) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.cv = cv;
        this.velocidad = 0;
        this.km = 0.0;
    }

    public void acelerar(int velocidadAumentar) {
        if (this.velocidad + velocidadAumentar >= 180) {
            this.velocidad = 180;
            System.out.println("cuidado, vas muy rápido");
        } else {
            this.velocidad += velocidadAumentar;
        }
        double aleatorio = (Math.random() * 9) + 1;
        this.km += (this.velocidad * (this.cv * aleatorio));

    }


    public void frenar(int velocidadFrenar) {
        if ((this.velocidad = velocidadFrenar) <= 0) {
            this.velocidad = 0;
            System.out.println("has frenado demasiado");

        } else {
            this.velocidad -= velocidadFrenar;
        }
    }

    public void parar() {
        this.velocidad = 0;
    }

    public void resetear() {
        this.velocidad = 0;  //-> Tambien se puede poner parar();

        this.km = 0;
    }

    public void mostrarDatos() {
        String mensaje = "Matricula: %s Modelo:%s CV: %d Velocidad: %d KM: %.2f %n";
        System.out.printf(String.format(mensaje, this.matricula, this.modelo, this.cv, this.velocidad, this.km));
    }

    public double getKm() {
        return km;
    }

    public int getCv() {
        return cv;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setKm(double km) {
        this.km = km;
    }
}
