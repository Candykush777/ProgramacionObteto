package model_Asignaturas;

import java.util.ArrayList;

public class Universidad {
    private ArrayList<Alumno> listaAlumnos;
    private ArrayList<Profesor> listaProfesores;


    public Universidad() {
        this.listaAlumnos = new ArrayList<>();
        this.listaProfesores = new ArrayList<>();
        listaProfesores.add(new Profesor());//es cómo el primer profesor que tiene que haber
        //y luego ya en contratar profesor vas metiendo más

    }

    public void contratarProfesor(Profesor profesor) {
        listaProfesores.add(profesor);
    }

    public void matricularalumno(Alumno alumno) {
        this.listaAlumnos.add(alumno);

    }

    public void mostrarAlumnos() {
        for (Alumno alumno : listaAlumnos) {
            alumno.mostrasDatos();
        }

    }

    public void calificaralumnos() {
        //Cuando puedes contratar profesores? Cuando tienes profesores y alumnos.
        if (listaProfesores.size() == 0 && listaAlumnos.size() == 0) {
            System.out.println("No hay elementos suficientes para ejecutar");
        } else {
            System.out.println("Calificando");
            for (Alumno alumno : listaAlumnos) {
                listaProfesores.get(0).ponerNotas(alumno);
            }
        }

    }

    public void mostrarAprobados() {
        // mostrar los datos de los alumnos con todas aprobadas.
        //Primero tenemos que recorrer la lista alumnos con un for
        for (Alumno item : listaAlumnos) {
            System.out.println("Mostrar aprobados ");
            if (item.getAsignatura1().getCalificacion() >= 5 && item.getAsignatura2().getCalificacion() >= 5 &&
                    item.getAsignatura3().getCalificacion() >= 5) {

            }
        }
    }

}
