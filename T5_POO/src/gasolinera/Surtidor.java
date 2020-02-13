package gasolinera;

public class Surtidor {
    private int capacidadTotal, capacidadActual;
    private String tipoGasolina;
    private boolean funcionamiento;

    public Surtidor(int capacidadTotal, String tipoGasolina) {
        this.capacidadActual = capacidadTotal;
        this.funcionamiento = true;
    }

    public Surtidor(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
        this.capacidadActual=0;
        this.capacidadTotal=0;
        this.tipoGasolina=null;
    }

    public void arreglar(){
        this.funcionamiento=true;

    }

    public void rellenar(int capacidad){
     this.capacidadTotal=capacidad;
    }

    public void quitarGasolina(int gasolinaQuitar){
        capacidadTotal-=gasolinaQuitar;
    }


    public int getCapacidadTotal() {
        return capacidadTotal;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public String getTipoGasolina() {
        return tipoGasolina;
    }

    public boolean isFuncionamiento() {
        return funcionamiento;
    }

    public void setCapacidadTotal(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public void setFuncionamiento(boolean funcionamiento) {
        this.funcionamiento = funcionamiento;
    }
}
