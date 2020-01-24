package Taller;

public class Coche {
    //variables de clase --> Propiedades, Caraterísticas

    private int cv, velocidad;
    private String marca, modelos, matricula;

    private Motor motor;
    //metodos --> Acciones

    public Coche(Motor motor){
        this.motor=motor;
    }
    public Coche() {
        this.velocidad = 0;
        this.velocidad = 0;
        this.modelos = "generico";
        this.matricula = "generica";
        this.marca = "generica";
    }

    public Coche(String marca, String modelos, int cv) {
        this.marca = marca;
        this.modelos = modelos;
        this.cv = cv;
    }

    public Coche(String marca, String modelos, String matricula, int cv, int velocidad) {
        this.marca = marca;
        this.modelos = modelos;
        this.cv = cv;
        this.matricula = matricula;
        this.velocidad = velocidad;
    }



    public void setCv(int cv) {
        this.cv = cv;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelos(String modelos) {
        this.modelos = modelos;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCv() {
        return cv;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelos() {
        return modelos;
    }

    public String getMatricula() {
        return matricula;
    }

    public void getDatos() {
        String mensaje = "Marca: %s Modelo: %s CV: %d Velocidad: %d";
        System.out.println(String.format(mensaje, marca, modelos, cv, velocidad));
    }

    public String getDatosDos() {
        String mensaje = "Marca: %s Modelo: %s CV: %d Velocidad: %d";
        // System.out.println(String.format(mensaje, marca, modelos, cv, velocidad));
        return String.format(mensaje, marca, modelos, cv, velocidad);
    }
    private void metodoPrivado(){
        // lo que sea
    }
}


