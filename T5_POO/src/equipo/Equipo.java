package equipo;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private int nivelAtaque, nivelCentro, nivelDefensa, goles;
    private ArrayList<Jugador> listaJugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.nivelAtaque = (int) (Math.random() * 100);
        this.nivelDefensa = (int) (Math.random() * 100);
        this.nivelCentro = (int) (Math.random() * 100);
        this.goles = 0;
        this.listaJugadores = new ArrayList();
    }

    public Equipo(String nombre, int nivelAtaque, int nivelDefensa, int nivelCentro) {
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelDefensa = nivelDefensa;
        this.nivelCentro = nivelCentro;
        this.listaJugadores = new ArrayList();
    }

    public void agregarJugador(Jugador jugador) {
        this.listaJugadores.add(jugador);
        boolean encontrado = false;
        for (int i = 0; i < listaJugadores.size(); i++) {
            Jugador jugadorActual = listaJugadores.get(i);
            if (jugadorActual.getNombre().equals(jugador.getNombre())) {
                encontrado = true;
                break;
            }
        }
        if (encontrado == true) {
            System.out.println("Lo siento, ya existe");
        } else {
            this.listaJugadores.add(jugador);
        }
    }

    public void listarDelanteros() {
        for (Jugador jugador : this.listaJugadores) {
            if (jugador.getPosicion().toLowerCase().equals("delantero")) {
                jugador.mostrarDatos();
            }
        }
    }

    public boolean atacar() {
        boolean gol = (this.nivelAtaque * (int) (Math.random() + 2) + (this.nivelCentro * (int) (Math.random()) * 2) / 2) > 90;
        if (gol == true) {
            goles++;
        }
        return gol;
    }

    public void mostrarDatos() {
        String mensaje = "Nombre: %s Ataque: %d Defensa: %d Centro: %d %n";
        System.out.printf(String.format(mensaje, this.nombre, this.nivelAtaque, this.nivelDefensa, this.nivelCentro));
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void listarPlantilla() {
        for (Jugador item : listaJugadores) {
            item.mostrarDatos();

        }

    }
}
