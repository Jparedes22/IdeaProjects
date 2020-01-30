package Carrera;

import Carrera.Coche;

public class EntradaCoche {
    public static void main(String[] args) {
        Coche cocheA = new Coche();
        Coche cocheB = new Coche("1234ASD", "Ford", 100);

        cocheA.mostrarDatos();
        cocheB.mostrarDatos();
        cocheA.setVelocidad((int) (Math.random() * 20) + 10);
        cocheA.mostrarDatos();
        cocheA.setCv(130);

        System.out.println("Modificado CocheB");
        cocheB.setCv(150);
        cocheB.setMatricula("5678FGH");
        cocheB.setModelo("Opel");
        cocheB.mostrarDatos();

        cocheB.setVelocidad((int) (Math.random() * 20) + 10);
        cocheB.mostrarDatos();

        cocheA.acelerar(123);
        cocheB.acelerar(12);
        cocheA.acelerar(5);
        cocheB.acelerar(150);

        System.out.println("Los coches son acelerados");
        cocheA.mostrarDatos();
        cocheB.mostrarDatos();


        Coche cocheGanador = null;
        if (cocheA.getKm() > cocheB.getKm()) {
            cocheGanador = cocheA;
        } else if (cocheA.getKm() < cocheB.getKm()) {
            cocheGanador = cocheB;
        }
        if (cocheGanador != null) {
            String mensaje = "El ganador es: %s %s %.2f";
            System.out.println(String.format(mensaje, cocheGanador.getMatricula(), cocheGanador.getModelo(), cocheGanador.getKm()));
        } else {
            System.out.println("Empate");
        }

        System.out.println("Carrera Automática");
        int kmEtapa = 100000;

        cocheA.resetear();
        cocheB.resetear();



        do {
            cocheA.acelerar((int) (Math.random() * 50));
            cocheB.acelerar((int) (Math.random() * 50));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("vuelta");
            cocheA.mostrarDatos();
            cocheB.mostrarDatos();
        } while (cocheA.getKm()<kmEtapa||cocheB.getKm()<kmEtapa);




       /* cocheGanador = null;
        if (cocheA.getKm() > cocheB.getKm()) {
            cocheGanador = cocheA;
        } else if (cocheA.getKm() < cocheB.getKm()) {
            cocheGanador = cocheB;
        }
        if (cocheGanador != null) {
            String mensaje = "El ganador es: %s %s %.2f";
            System.out.println(String.format(mensaje, cocheGanador.getMatricula(), cocheGanador.getModelo(), cocheGanador.getKm()));
        } else {
            System.out.println("Empate");
        }*/
    }
}
