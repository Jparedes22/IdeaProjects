package equipo;

public class EntradaEquipo {
    public static void main(String[] args) {
        Equipo equipoA = new Equipo("Betis");
        Equipo equipoB = new Equipo("Westham");
        int contadorBetis = 0;
        int contadorWest = 0;
       /* for (int i = 0; i < 3; i++) {
            equipoA = new Equipo("Betis");
            equipoA.atacar();
            if (equipoA.atacar() == true) {
                contadorBetis++;
            }
            equipoB = new Equipo("Westham");
            equipoB.atacar();
            if (equipoB.atacar() == true) {
                contadorWest++;
            }
        } */
        equipoA.mostrarDatos();
        equipoB.mostrarDatos();


        Jugador jugador = new Jugador("Lucas Vazquez", "delantero", 67);
        equipoA.agregarJugador(jugador);
        jugador = new Jugador("Benzema", "delantero", 99);
        equipoA.agregarJugador(jugador);

        jugador = new Jugador("Messi", "delantero", 99);
        equipoB.agregarJugador(jugador);

        if (equipoA.getListaJugadores().isEmpty() || equipoB.getListaJugadores().isEmpty()) {
            System.out.println("No se puede jugar el partido");
        } else {
            for (int i = 0; i < 3; i++) {
                equipoA = new Equipo("Betis");
                equipoA.atacar();
                if (equipoA.atacar() == true) {
                    contadorBetis++;
                }
                equipoB = new Equipo("Westham");
                equipoB.atacar();
                if (equipoB.atacar() == true) {
                    contadorWest++;
                }
            }
        }
        System.out.printf("Betis %d - Westham %d %n", contadorBetis, contadorWest);
        equipoA.listarPlantilla();
        equipoB.listarPlantilla();
    }


}

