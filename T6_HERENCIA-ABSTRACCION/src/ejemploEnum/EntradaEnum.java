package ejemploEnum;

public class EntradaEnum {

    public static void main(String[] args) {
      /*  System.out.println(Posicion.DEFENSA.name());
        System.out.println(Posicion.DELANTERO.name());
        System.out.println(Posicion.MEDIO.name());
        System.out.println(Posicion.PORTERO.name());


        Posicion[] posiciones=Posicion.values();
        for (Posicion item:posiciones) {
            System.out.println(item.name().toLowerCase());
        }

        Jugador jugador=new Jugador("Messi","Apellido",Posicion.DELANTERO.name()); */
        System.out.println(Posicion.PORTERO.getNivel1());

        // Posicion posicion=Posicion.DELANTERO;
        //posicion.getNivel1();


        Posicion posicionDelantero = Posicion.DELANTERO;
        posicionDelantero.setSituacion("izquierda");
        posicionDelantero.setNivel1(100);
        posicionDelantero.setNivel2(100);
        posicionDelantero.setNivel3(100);

        Jugador jugador = new Jugador("messi", "chikito", posicionDelantero);
        System.out.println(jugador.getPosicion().getSituacion());

    }
}
