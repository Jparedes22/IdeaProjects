package examen;

public class Entrada {
    public static void main(String[] args) {
        Seleccion seleccion = new Seleccion("Rusia");

        Jugador jugador1 = new Jugador("I", "Akinfeyev", "1234a", 30,
                5000, Posiciones.PORTERO);
        Jugador jugador2 = new Jugador("I", "Smolnikov", "1234b", 26,
                7000, Posiciones.DEFENSA);
        Jugador jugador3 = new Jugador("A", "Dziuba", "1234c", 23,
                9000, Posiciones.DELANTERO);
        Entrenador entrenador = new Entrenador("S", "Cherchesov", "1234d",
                40, 4500,Vocaciones.OFENSIVO);

        Directivo directivo1 = new Directivo("Dimitri", "Dimitrov", "1234e", 50);
        Directivo directivo2 = new Directivo("Yuri", "Gazinski", "1234f", 40);


        seleccion.convocarJ(jugador1);
        seleccion.convocarJ(jugador2);
        seleccion.convocarJ(jugador3);
        seleccion.convocarE(entrenador);

        seleccion.contratar(directivo1);
        seleccion.contratar(directivo2);

       seleccion.listarDirectivos();
       seleccion.listarSeleccionables();

    }
}
