import model_Asignaturas.Alumno;
import model_Asignaturas.Asignatura;
import model_Asignaturas.Profesor;
import model_Asignaturas.Universidad;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        Asignatura programacion = new Asignatura(1);
        //calificacion de 0 de momento, ya que no hay datos entiendo, todas 0
        Asignatura lenguaje = new Asignatura(2);
        Asignatura sistemas = new Asignatura(3);
        Asignatura baseDatos = new Asignatura(4);
        Asignatura fol = new Asignatura(5);
        Alumno edu = new Alumno(programacion, lenguaje, sistemas);
        Alumno ale = new Alumno(programacion, fol, sistemas);
        Alumno mario = new Alumno(6, 7, 8);
        Profesor borja = new Profesor();
        borja.ponerNotas(edu);
        edu.mostrasDatos();
        borja.calcularMedia(edu);
        Alumno roberto = new Alumno(new Asignatura(1), new Asignatura(2), new Asignatura(3));
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(edu);
        listaAlumnos.add(ale);
        listaAlumnos.add(mario);
        listaAlumnos.add(roberto);
        Universidad universidad = new Universidad();
        universidad.contratarProfesor(new Profesor());
        universidad.calificaralumnos();
        universidad.matricularalumno(edu);
        universidad.matricularalumno(ale);
        universidad.matricularalumno(mario);
        universidad.matricularalumno(roberto);
        universidad.mostrarAlumnos();
        universidad.mostrarAprobados();
    }
}
