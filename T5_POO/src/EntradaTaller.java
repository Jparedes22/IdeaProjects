import Taller.Coche;
import Taller.Motor;

public class EntradaTaller {
    public static void main(String[] args) {


        Coche miCoche = new Coche();
        miCoche.getDatos();
        Coche otroCoche = new Coche("opel", "corsa", 100);

        Motor motor=new Motor (150, 2.0);






        /**  miCoche.setCv(100);
         miCoche.setMarca("Ford");
         miCoche.setModelos("Focus");
         miCoche.setMatricula("ASD123");
         miCoche.setVelocidad(0);

         Coche otroCoche=new Coche();
         otroCoche.setCv(200);
         otroCoche.setVelocidad(50);
         otroCoche.setMarca("Opel");
         otroCoche.setModelos("Corsa");
         otroCoche.setMatricula("QWE123");
         **/
    }
}
