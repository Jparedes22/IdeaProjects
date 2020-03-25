import java.util.Date;
import java.util.Scanner;

public class EntrenamientoCorona {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("================================");
            System.out.println("1.Entrenamiento de hoy");
            System.out.println("2.Entrenamiento de ayer");
            System.out.println("3.Entrenamiento de mañana");
            System.out.println("4.Entrenamiento de la semana");
            System.out.println("5.Salir");
            System.out.println("================================");
            System.out.println("Elige la opción que desees");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    entrenamientoHoy();
                    break;

                case 2:
                    entrenamientoAyer();
                    break;

                case 3:
                    entrenamientoMañana();
                    break;

                case 4:
                    entrenamientoSemana();
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

            }


        } while (opcion != 5);
    }

    public static void entrenamientoHoy() {
        Date fecha = new Date();
        int dia = fecha.getDay();
        System.out.println(fecha.getDay());
        if (dia == 1) {
            System.out.println("Hoy es lunes, hoy toca Tren Inferior:");
            System.out.println("");
            System.out.println("Calentamiento: 1 minuto de carrera suave en el sitio\n" +
                    "1 minuto de rodillas al pecho\n" +
                    "3 x 5 sentadillas explosivas\n" +
                    "3 x 6 crunchs");
            System.out.println("");
            System.out.println("Entrenamiento: 3 x 20 zancadas.\n" +
                    "3 x 30 sentadillas.\n" +
                    "3 x 15 sentadillas estilo sumo.\n" +
                    "3 x 20 crunchs.\n" +
                    "3 x 20 abdominales bicicleta");

        } else if (dia == 2) {
            System.out.println("Hoy es martes, hoy toca Tren Superior:");
            System.out.println("");
            System.out.println("Calentamiento\n" +
                    "\n" +
                    "1 minuto carrera suave en el sitio\n" +
                    "1 minuto jumping jacks\n" +
                    "3 x 5 flexiones explosivas");
            System.out.println("");
            System.out.println("Entrenamiento\n" +
                    "\n" +
                    "4 x 15 flexiones.\n" +
                    "4 x 15 flexiones tipo diamante.\n" +
                    "3 x 15 flexiones con pies elevados.\n" +
                    "3 x 15 flexiones con apertura ancha.");

        } else if (dia == 3) {
            System.out.println("Hoy es miercoles, hoy toca descanso:");
            System.out.println("");
            System.out.println("Estiramientos de Tren Superior");

        } else if (dia == 4) {
            System.out.println("Hoy es jueves, hoy toca Tren Inferior:");
            System.out.println("");
            System.out.println("Calentamiento\n" +
                    "\n" +
                    "1 minuto carrera suave en el sitio\n" +
                    "1 minuto rodillas al pecho\n" +
                    "3 x 5 sentadillas explosivas\n" +
                    "2 x 10 abdominales bicicleta");
            System.out.println("");
            System.out.println("Entrenamiento\n" +
                    "\n" +
                    "5 x 30 sentadillas.\n" +
                    "3 x 15 burpees.\n" +
                    "3 x 1 minuto sentadillas isométricas.\n" +
                    "3 x 20 mountain climbers.\n" +
                    "3 x 20 crunchs.");

        } else if (dia == 5) {
            System.out.println("Hoy es viernes, hoy toca Tren Superior: ");
            System.out.println("");
            System.out.println("Calentamiento\n" +
                    "\n" +
                    "1 minuto carrera suave en el sitio\n" +
                    "1 minuto jumping jacks\n" +
                    "3 x 5 curl de biceps\n" +
                    "3 x 5 elevaciones laterales ");
            System.out.println("");
            System.out.println("Entrenamiento\n" +
                    "\n" +
                    "3 x 10 curl de bíceps.\n" +
                    "3 x 10 martillos de bíceps\n" +
                    "3 x 10 elevaciones laterales\n" +
                    "3 x 10 press de hombro con mancuernas");

        } else if (dia == 6) {
            System.out.println("Hoy es sábado, hoy toca descanso:");
            System.out.println("");
            System.out.println("Estiramientos de Tren Superior");

        } else if (dia == 7) {
            System.out.println("Hoy es domingo, hoy toca descanso:");
            System.out.println("");
            System.out.println("Estiramientos de Tren Inferior");

        }
    }

    public static void entrenamientoAyer() {
        Date fecha = new Date();
        int dia = fecha.getDay();

        if (dia == 1) {
            System.out.println("Ayer fue domingo y tocó descanso:");
            System.out.println("");
            System.out.println("Estiramientos de Tren Inferior");

        } else if (dia == 2) {
            System.out.println("Ayer fue lunes, y tocó Tren Inferior:");
            System.out.println("");
            System.out.println("Calentamiento: 1 minuto de carrera suave en el sitio\n" +
                    "1 minuto de rodillas al pecho\n" +
                    "3 x 5 sentadillas explosivas\n" +
                    "3 x 6 crunchs");
            System.out.println("");
            System.out.println("Entrenamiento: 3 x 20 zancadas.\n" +
                    "3 x 30 sentadillas.\n" +
                    "3 x 15 sentadillas estilo sumo.\n" +
                    "3 x 20 crunchs.\n" +
                    "3 x 20 abdominales bicicleta");


        } else if (dia == 3) {
            System.out.println("Ayer fue martes, y tocó Tren Superior:");
            System.out.println("");
            System.out.println("Calentamiento\n" +
                    "\n" +
                    "1 minuto carrera suave en el sitio\n" +
                    "1 minuto jumping jacks\n" +
                    "3 x 5 flexiones explosivas");
            System.out.println("");
            System.out.println("Entrenamiento\n" +
                    "\n" +
                    "4 x 15 flexiones.\n" +
                    "4 x 15 flexiones tipo diamante.\n" +
                    "3 x 15 flexiones con pies elevados.\n" +
                    "3 x 15 flexiones con apertura ancha.");

        } else if (dia == 4) {
            System.out.println("Ayer fue miercoles y tocó descanso:");
            System.out.println("");
            System.out.println("Estiramientos de Tren Inferior");


        } else if (dia == 5) {
            System.out.println("Ayer fue jueves y tocó Tren Inferior: ");
            System.out.println("");
            System.out.println("Calentamiento\n" +
                    "\n" +
                    "1 minuto carrera suave en el sitio\n" +
                    "1 minuto jumping jacks\n" +
                    "3 x 5 curl de biceps\n" +
                    "3 x 5 elevaciones laterales ");
            System.out.println("");
            System.out.println("Entrenamiento\n" +
                    "\n" +
                    "3 x 10 curl de bíceps.\n" +
                    "3 x 10 martillos de bíceps\n" +
                    "3 x 10 elevaciones laterales\n" +
                    "3 x 10 press de hombro con mancuernas");

        } else if (dia == 6) {
            System.out.println("Ayer fue viernes, y tocó Tren Superior:");
            System.out.println("");
            System.out.println("Calentamiento\n" +
                    "\n" +
                    "1 minuto carrera suave en el sitio\n" +
                    "1 minuto jumping jacks\n" +
                    "3 x 5 curl de biceps\n" +
                    "3 x 5 elevaciones laterales ");
            System.out.println("");
            System.out.println("Entrenamiento\n" +
                    "\n" +
                    "3 x 10 curl de bíceps.\n" +
                    "3 x 10 martillos de bíceps\n" +
                    "3 x 10 elevaciones laterales\n" +
                    "3 x 10 press de hombro con mancuernas");
        } else if (dia == 7) {
            System.out.println("Ayer fue sábado y tocó descanso:");
            System.out.println("");
            System.out.println("Estiramientos de Tren Inferior");

        }

    }

    public static void entrenamientoSemana() {
        System.out.println("Lunes: Tren Inferior");
        System.out.println("Martes: Tren Superior");
        System.out.println("Miercoles: Estiramientos");
        System.out.println("Jueves: Tren Inferior");
        System.out.println("Viernes: Tren Superior");
        System.out.println("Sábado: Estiramientos");
        System.out.println("Domingo: Estiramientos");

    }

    public static void entrenamientoMañana() {
        Date fecha = new Date();
        int dia = fecha.getDay();
        if (dia == 1) {
            System.out.println("Mañana es martes, así que toca Tren Superior:");
            System.out.println("");
            System.out.println("Calentamiento\n" +
                    "\n" +
                    "1 minuto carrera suave en el sitio\n" +
                    "1 minuto jumping jacks\n" +
                    "3 x 5 flexiones explosivas");
            System.out.println("");
            System.out.println("Entrenamiento\n" +
                    "\n" +
                    "4 x 15 flexiones.\n" +
                    "4 x 15 flexiones tipo diamante.\n" +
                    "3 x 15 flexiones con pies elevados.\n" +
                    "3 x 15 flexiones con apertura ancha.");
        } else if (dia == 2) {
            System.out.println("Mañana es miercoles, así que toca descanso:");
            System.out.println("");
            System.out.println("Estiramientos de Tren Superior");
        } else if (dia == 3) {
            System.out.println("Mañana es jueves, así que toca Tren Inferior:");
            System.out.println("");
            System.out.println("Calentamiento\n" +
                    "\n" +
                    "1 minuto carrera suave en el sitio\n" +
                    "1 minuto rodillas al pecho\n" +
                    "3 x 5 sentadillas explosivas\n" +
                    "2 x 10 abdominales bicicleta");
            System.out.println("");
            System.out.println("Entrenamiento\n" +
                    "\n" +
                    "5 x 30 sentadillas.\n" +
                    "3 x 15 burpees.\n" +
                    "3 x 1 minuto sentadillas isométricas.\n" +
                    "3 x 20 mountain climbers.\n" +
                    "3 x 20 crunchs.");
        } else if (dia == 4) {
            System.out.println("Mañana es viernes, así que toca Tren Superior:");
            System.out.println("");
            System.out.println("Calentamiento\n" +
                    "\n" +
                    "1 minuto carrera suave en el sitio\n" +
                    "1 minuto jumping jacks\n" +
                    "3 x 5 curl de biceps\n" +
                    "3 x 5 elevaciones laterales ");
            System.out.println("");
            System.out.println("Entrenamiento\n" +
                    "\n" +
                    "3 x 10 curl de bíceps.\n" +
                    "3 x 10 martillos de bíceps\n" +
                    "3 x 10 elevaciones laterales\n" +
                    "3 x 10 press de hombro con mancuernas");
        } else if (dia == 5) {
            System.out.println("Mañana es sábado, así que toca descanso:");
            System.out.println("");
            System.out.println("Estiramientos de Tren Superior");
        } else if (dia == 6) {
            System.out.println("Mañana es domingo, así que toca descanso:");
            System.out.println("Estiramientos de Tren Inferior");
        } else if (dia == 7) {
            System.out.println("Mañana es lunes, así que toca Tren Inferior:");
            System.out.println("");
            System.out.println("Calentamiento: 1 minuto de carrera suave en el sitio\n" +
                    "1 minuto de rodillas al pecho\n" +
                    "3 x 5 sentadillas explosivas\n" +
                    "3 x 6 crunchs");
            System.out.println("");
            System.out.println("Entrenamiento: 3 x 20 zancadas.\n" +
                    "3 x 30 sentadillas.\n" +
                    "3 x 15 sentadillas estilo sumo.\n" +
                    "3 x 20 crunchs.\n" +
                    "3 x 20 abdominales bicicleta");
        }

    }
}
