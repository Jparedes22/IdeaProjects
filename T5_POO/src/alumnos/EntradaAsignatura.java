package alumnos;

import alumnos.Alumno;
import alumnos.Asignatura;
import alumnos.Profesor;

public class EntradaAsignatura {
    public static void main(String[] args) {

        Asignatura asignatura1 = new Asignatura(1);
        Asignatura asignatura2 = new Asignatura(2);
        Asignatura asignatura3 = new Asignatura(3);

        Alumno alumno = new Alumno(1, 2, 3);
        Profesor profesor = new Profesor();

        profesor.ponerNotas(alumno);
        System.out.println("calificación de marzo");
        System.out.println(alumno.getAsignatura1().getCalificacion());
        if(alumno.getAsignatura1().getCalificacion()>=5.0){
            System.out.println("AP");
        }else{
            System.out.println("Septiembre");
        }
        System.out.println(alumno.toString());

    }
}
