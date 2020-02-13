package Herencia2;

import java.util.ArrayList;

public class EntradaHerencia2 {

    public static void main(String[] args) {


        Trabajador trabajador = new Trabajador("nombre trabajador", "apellido trabajador");
        Trabajador trabajador2 = new Trabajador("nombre trabajador", "apellido trabajador", 1000);

        trabajador.mostrarDatos();

        Jefe jefe = new Jefe("nombre jefe", "apellido jefe", 10000, 8);
        trabajador.mostrarDatos();
        trabajador.mostrarDatos();
        JefeSupremo jefeSupremo = new JefeSupremo("edw", "wjefb", 3333, 87);
        jefe.despedir();

        System.out.println(trabajador.getClass().getSimpleName());

        ArrayList<Trabajador> listaTrabajadores = new ArrayList();
        listaTrabajadores.add(trabajador);
        listaTrabajadores.add(trabajador2);
        listaTrabajadores.add(jefe);
        listaTrabajadores.add(jefeSupremo);

        ArrayList<Jefe> listaJefes = new ArrayList();
        listaJefes.add(jefe);
        listaJefes.add(jefeSupremo);
        ArrayList<JefeSupremo> listaJefesSupremos = new ArrayList();
        listaJefesSupremos.add(jefeSupremo);
    }
}
