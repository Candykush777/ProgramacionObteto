package model_Asignaturas;

public class Profesor {
    public Profesor() {
    }

    public void ponerNotas(Alumno alumno) {
        alumno.getAsignatura1().setCalificacion(Math.random() * 11);
        alumno.getAsignatura2().setCalificacion(Math.random() * 11);
        alumno.getAsignatura3().setCalificacion(Math.random() * 11);
    }

    public void calcularMedia(Alumno alumno) {

        double media = (alumno.getAsignatura1().getCalificacion() + alumno.getAsignatura2().getCalificacion() + alumno.getAsignatura3().getCalificacion()) / 3;
        System.out.println("LA media del alumno es  : " + media);
    }
}
