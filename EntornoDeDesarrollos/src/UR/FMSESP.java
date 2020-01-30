package UR;

import java.util.Scanner;

public class FMSEspaña {

        static Scanner sc = new Scanner(System.in);
        static String opcionDos;

        public static void main(String[] args) {
            String opcion;



            do {
                System.out.println("1. Ver Tabla");
                System.out.println("2. Elegir Participante");
                System.out.println("3. Ver Ascenso");
                System.out.println("4. Ver Descensos");
                System.out.println("5. Ver Demás");
                System.out.println("6. Ver MVPs");
                System.out.println("7. Salir");
                System.out.println("Elige la opción que quieras");
                opcion = sc.next();
                if (!opcion.equals("1") && !opcion.equals("2") && !opcion.equals("3") && !opcion.equals("4")&&
                        !opcion.equals("5")&& !opcion.equals("6")&& !opcion.equals("7")) {
                }else{
                    switch (opcion) {

                        case "1":
                            tabla();
                            break;

                        case "2":
                            participantes();

                            break;

                        case "3":
                            ascenso();
                            break;

                        case "4":
                            descensos();
                            break;
                        case "5":
                            demas();
                            break;
                        case "6":
                            mvp();
                            break;
                        case "7":
                            internacional();
                            System.out.println("Saliendo...");
                            break;


                    }
                }
            } while (!opcion.equalsIgnoreCase("7"));
        }
        public static void mvp(){
            System.out.println("JORNADA 1: CHUTY");
            System.out.println("JORNADA 2: CHUTY");
            System.out.println("JORNADA 3: BTA");
            System.out.println("JORNADA 4: SKONE");
            System.out.println("JORNADA 5: SKONE");
            System.out.println("JORNADA 6: CHUTY");
            System.out.println("JORNADA 7: CHUTY");
            System.out.println("JORNADA 8: CHUTY");
            System.out.println("JORNADA 9: CHUTY");
        }
        public static void demas(){
            System.out.println("PRIMERA TEMPORADA: ");
            System.out.println("DJ: Dj Sunshine, Host: Bekaesh, Jueces fijos: Estrimo y Kapo");
            System.out.println("SEGUNDA TEMPORADA: ");
            System.out.println("DJ: Dj Sunshine, Host: Beakesh, Jueces: Estrimo, Kapo, Invert, Soen y Mr. Ego");
            System.out.println("TERCERA TEMPORADA:");
            System.out.println("DJ: Dj Verse, Host: Bekaesh, Jueces: Estrimo, Kapo, Soen, Babi y Noult");
        }
        public static void internacional(){
            System.out.println("En la primera jornada de FMS internacional, celebrada en Valencia, ganaron Bnet, Aczino" +
                    ", Rapder y Papo");
            System.out.println("En la segunda jornada de FMS internacional, celebrada en Buenos Airea, ganaron Skone," +
                    "Chuty, Kaiser y Cacha");
        }
        public static void participantes() {
            do {
                System.out.println("1. Chuty");
                System.out.println("2. Skone");
                System.out.println("3. Bnet");
                System.out.println("4. Blon");
                System.out.println("5. Errecé");
                System.out.println("6. Walls");
                System.out.println("7. Mr. Ego");
                System.out.println("8. Zasko");
                System.out.println("9. Force");
                System.out.println("10. BTA");
                System.out.println("11. Salir");
                System.out.println("");
                System.out.println("===========================================");
                System.out.println("Elige la opción que quieras");

                opcionDos = sc.next();
                if (!opcionDos.equals("1") && !opcionDos.equals("2") && !opcionDos.equals("3") && !opcionDos.equals("4")
                        && !opcionDos.equals("5") && !opcionDos.equals("6")
                        && !opcionDos.equals("7") && !opcionDos.equals("8")
                        && !opcionDos.equals("9") && !opcionDos.equals("10") ) {
                } else {
                    switch (opcionDos) {
                        case "1":
                            System.out.println("Sergio Castro Gisbert, conocido artísticamente como Chuty," +
                                    " (Madrid, 12 de febrero de 1993) es un competidor de batallas de gallos. Es" +
                                    " bicampeón nacional y bicampeón nacional");
                            System.out.println("J1. Victoria");
                            System.out.println("J2. Victoria");
                            System.out.println("J3. Victoria");
                            System.out.println("J4. Derrota con Réplica");
                            System.out.println("J5. Victoria");
                            System.out.println("J6. Victoria");
                            System.out.println("J7. Victoria");
                            System.out.println("J8. Victoria");
                            System.out.println("J9. Victoria");
                            System.out.println("");
                            System.out.println("===========================================");
                            break;
                        case "2":
                            System.out.println("osé Miguel Manzano Bazalo (Málaga, 27 de diciembre de 1989)," +
                                    " también conocido como Skone, es un rapero y MC español, conocido por ser uno" +
                                    "de los mejores representantes de España. Es campeón regional, nacional e" +
                                    "internacional");
                            System.out.println("J1. Victoria");
                            System.out.println("J2. Victoria");
                            System.out.println("J3. Derrota");
                            System.out.println("J4. Victoria con Réplica");
                            System.out.println("J5. Victoria");
                            System.out.println("J6. Victoria");
                            System.out.println("J7. Victoria");
                            System.out.println("J8. Victoria con Réplica");
                            System.out.println("J9. Victoria");
                            System.out.println("");
                            System.out.println("===========================================");
                            break;
                        case "3":
                            System.out.println("Javier Bonet González, mejor conocido por su nombre artístico " +
                                    "\"Bnet\" es un freestyler español, conocido por su particular estilo con " +
                                    "técnicas combinado a un buen punchline. También es conocido por la tranquilidad" +
                                    " que posee en el escenario, siendo esto un recurso constante de sus rivales. Es " +
                                    "considerado uno de los mejores freestylers españoles en la actualidad. Es " +
                                    "campeón nacional es internacional");

                            System.out.println("J1. Victoria");
                            System.out.println("J2. Victoria");
                            System.out.println("J3. Victoria");
                            System.out.println("J4. Victoria");
                            System.out.println("J5. Victoria");
                            System.out.println("J6. Derrota con Réplica");
                            System.out.println("J7. Victoria");
                            System.out.println("J8. Derrota");
                            System.out.println("J9. Derrota");
                            System.out.println("");
                            System.out.println("===========================================");
                            break;
                        case "4":
                            System.out.println("Pablo Pérez Rueda, mejor conocido como Blon Doblefilo o simplemente " +
                                    "Blon, es un freestyler, rapero y escritor español que está activo desde el 2008." +
                                    "Es bicampeón regional");
                            System.out.println("J1. Derrota con Réplica");
                            System.out.println("J2. Victoria");
                            System.out.println("J3. Derrota");
                            System.out.println("J4. Victoria con Réplica");
                            System.out.println("J5. Derrota");
                            System.out.println("J6. Victoria");
                            System.out.println("J7. Victoria");
                            System.out.println("J8. Derrota con Réplica");
                            System.out.println("J9. Victoria");
                            System.out.println("");
                            System.out.println("===========================================");
                            break;
                        case "5":
                            System.out.println("Alejandro Rubira Cruz, más conocido como Errecé es un freestyler" +
                                    " español. Es uno de los mayores exponentes de España, caracterizado por su" +
                                    " gran flow. Es campeón regional");
                            System.out.println("J1. Victoria con Réplica");
                            System.out.println("J2. Victoria");
                            System.out.println("J3. Derrota con Réplica");
                            System.out.println("J4. Victoria");
                            System.out.println("J5. Derrota");
                            System.out.println("J6. Derrota");
                            System.out.println("J7. Derrota");
                            System.out.println("J8. Derrota");
                            System.out.println("J9. Victoria");
                            System.out.println("");
                            System.out.println("===========================================");
                            break;
                        case "6":
                            //WALLS
                            System.out.println("Ginés Paredes Giménez, más conocido como Walls es un freestyler de " +
                                    "origen español, nacido en Murcia.También es un reconocido cantante de música " +
                                    "variada, con canciones muy populares en la actualidad. Su seudónimo proviene " +
                                    "de su apellido Paredes, ya que en inglés, se traduce como Walls. Es bicampeón " +
                                    "regional");
                            System.out.println("J1. Derrota con Réplica");
                            System.out.println("J2. Derrota");
                            System.out.println("J3. Victoria");
                            System.out.println("J4. Derrota");
                            System.out.println("J5. Derrota conn Réplica");
                            System.out.println("J6. Derrota");
                            System.out.println("J7. Victoria");
                            System.out.println("J8. Victoria");
                            System.out.println("J9. Derrota");
                            System.out.println("");
                            System.out.println("===========================================");

                            break;
                        case "7":
                            //MR EGO
                            System.out.println("Juan Miguel Ballesteros, más conocido como Mr. Ego es un freestyler " +
                                    "español. Ha participado en competencias como la Red Bull Batalla de los Gallos, " +
                                    "FMS España, etc. No ha ganado ninguna competición de RedBull");
                            System.out.println("J1. Derrota con Réplica");
                            System.out.println("J2. Derrota");
                            System.out.println("J3. Victoria con Réplica");
                            System.out.println("J4. Derrota con Réplica");
                            System.out.println("J5. Victoria con Réplica");
                            System.out.println("J6. Victoria");
                            System.out.println("J7. Derrota");
                            System.out.println("J8. Derrota con Réplica");
                            System.out.println("J9. Derrota");
                            System.out.println("");
                            System.out.println("===========================================");

                            break;
                        case "8":
                            //ZASKO
                            System.out.println("Ginés Miñano Bernabéu, mejor conocido como Zasko o Zasko Máster, es" +
                                    " un freestyler español, nacido en Alicante. Es conocido por ser uno de los " +
                                    "principales exponentes de la métrica en el mundo, dentro de las batallas de rap," +
                                    " y por salir campeón de la nacional de España 2019, consagrándose como uno de los" +
                                    " mejores de dicho país. Es campéon regional y nacional.");
                            System.out.println("J1. Victoria con Réplica");
                            System.out.println("J2. Derrota");
                            System.out.println("J3. Derrota");
                            System.out.println("J4. Derrota");
                            System.out.println("J5. Derrota");
                            System.out.println("J6. Victoria con Réplica");
                            System.out.println("J7. Derrota");
                            System.out.println("J8. Derrota");
                            System.out.println("J9. Victoria");
                            System.out.println("");
                            System.out.println("===========================================");

                            break;
                        case "9":
                            //FORCE
                            System.out.println("Manuel Rozas Castro, más conocido como Manel o Force , es un " +
                                    "freestyler español. Es campeón regional y subcampeón nacional");
                            System.out.println("J1. Derrota");
                            System.out.println("J2. Derrota");
                            System.out.println("J3. Derrota");
                            System.out.println("J4. Victoria");
                            System.out.println("J5. Victoria con Réplica");
                            System.out.println("J6. Derrota");
                            System.out.println("J7. Derrota");
                            System.out.println("J8. Victoria con Réplica");
                            System.out.println("J9. Derrota");
                            System.out.println("");
                            System.out.println("===========================================");

                            break;
                        case "10":
                            //BTA
                            System.out.println("Alfonso Campos Yuste, más conocido como BTA, es un freestyler y" +
                                    " rapero español. Ha participado en competencias como FMS España, Red Bull " +
                                    "Batalla de los Gallos, etc. Es conocido por su excelente manejo del doble " +
                                    "tempo. Es campeón regional");
                            System.out.println("J1. Derrota");
                            System.out.println("J2. Derrota");
                            System.out.println("J3. Victoria con Réplica");
                            System.out.println("J4. Victoria");
                            System.out.println("J5. Derrota con Réplica");
                            System.out.println("J6. Derrota");
                            System.out.println("J7. Derrota");
                            System.out.println("J8. Victoria");
                            System.out.println("J9. Derrota");
                            System.out.println("");
                            System.out.println("===========================================");

                            break;
                    }
                }
            }
            while (!opcionDos.equalsIgnoreCase("11")) ;
        }

        public static void descensos(){
            System.out.println("En la primera temporada descendieron Invert, Mr. Ego y Hander disputó el playoff contra" +
                    "Coletiyas resultando victorioso");
            System.out.println("En la segunda temporada descendió Hander, se retiró Arkano y Force disputó el playoff" +
                    "contra Santi saliendo victorioso");
        }
        public static void ascenso() {
            System.out.println("1. Mnak 104.750 pts");
            System.out.println("2. Gazir 103.550 pts");
            System.out.println("3. Sweet Pain 91.900 pts");
            System.out.println("4. Tirpa 74.300 pts");
            System.out.println("5. Jesús LC 60.400 pts");
            System.out.println("6. Botta 47.750 pts");
            System.out.println("7. Vivi 43.150 pts");
            System.out.println("8. Aigor 36.150 pts");
            System.out.println("9. Hander 34.700 pts");
            System.out.println("10. Xinako 30.050 pts");
            System.out.println("");
            System.out.println("===========================================");
        }

        public static void tabla() {
            System.out.println("1. Chuty 25 pts");
            System.out.println("2. Skone 21 pts");
            System.out.println("3. Bnet 19 pts");
            System.out.println("4. Blon 16 pts");
            System.out.println("5. Errecé 12 pts");
            System.out.println("6. Walls 11 pts");
            System.out.println("7. Mr. Ego 10 pts");
            System.out.println("8. Zasko 8 pts");
            System.out.println("9. Force 7 pts");
            System.out.println("10. BTA 6 pts");
            System.out.println("");
            System.out.println("===========================================");
        }


}
