package alumnos;

public class Profesor {

    public void ponerNotas(Alumno alumno) {
        Asignatura asignatura1 = alumno.getAsignatura1();
        Asignatura asignatura2 = alumno.getAsignatura2();
        Asignatura asignatura3 = alumno.getAsignatura3();

        asignatura1.setCalificacion(Math.random() * 10);
        asignatura2.setCalificacion(Math.random() * 10);
        asignatura3.setCalificacion(Math.random() * 10);
    }

    public double calculaMedia(Alumno alumno) {
        Asignatura asignatura1=alumno.getAsignatura1();
        Asignatura asignatura2=alumno.getAsignatura2();
        Asignatura asignatura3=alumno.getAsignatura3();
        double media=(asignatura1.getCalificacion()+asignatura2.getCalificacion()+asignatura3.getCalificacion()/3);

        //LO MISMO QUE LO DE ARRIBA PERO EN MENOS LÍNEAS:
       /* double mediaCompleta=(alumno.getAsignatura1().getCalificacion()+alumno.getAsignatura2().getCalificacion()
                +alumno.getAsignatura3().getCalificacion())/3;*/

        return media;
    }
}
