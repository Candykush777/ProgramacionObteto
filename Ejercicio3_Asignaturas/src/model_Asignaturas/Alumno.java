package model_Asignaturas;

public class Alumno {
    private Asignatura asignatura1, asignatura2, asignatura3;

    public Alumno() {
    }

    public Alumno(Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3) {
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }

    public Alumno(int id1, int id2, int id3) {
        // inicializar los 3 atributos,Tenga un constructor
        // con tres parámetros de tipo int que inicialice los tres atributos.
        this.asignatura1 = new Asignatura(id1);
        this.asignatura2 = new Asignatura(id2);
        this.asignatura3 = new Asignatura(id3);
    }

    public void mostrasDatos() {
        System.out.println("Mostrando las calificaciones de los alumnos : ");
        System.out.println("Asignatura con id : " + asignatura1.getId());
        System.out.println("\tCalificación: " + asignatura1.getCalificacion());
        System.out.println("Asignatura con id : " + asignatura2.getId());
        System.out.println("\tCalificación: " + asignatura2.getCalificacion());
        System.out.println("Asignatura con id : " + asignatura3.getId());
        System.out.println("\tCalificación: " + asignatura3.getCalificacion());
    }

    public Asignatura getAsignatura1() {
        return asignatura1;
    }

    public void setAsignatura1(Asignatura asignatura1) {
        this.asignatura1 = asignatura1;
    }

    public Asignatura getAsignatura2() {
        return asignatura2;
    }

    public void setAsignatura2(Asignatura asignatura2) {
        this.asignatura2 = asignatura2;
    }

    public Asignatura getAsignatura3() {
        return asignatura3;
    }

    public void setAsignatura3(Asignatura asignatura3) {
        this.asignatura3 = asignatura3;
    }

}
