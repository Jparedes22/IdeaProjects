package gasolinera;

public class Coche {

    private String tipoGasolina;
    private int litrosDeposito;

    public Coche(String tipo){
        this.tipoGasolina=tipo;
        this.litrosDeposito=0;

    }

         public void ponerGasolina(int litros, Surtidor surtidor){
        surtidor.quitarGasolina(0);


         }
}
