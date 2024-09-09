import database.DBconnection;
import model.Alumno;
import repositories.AlumnoRepository;

import java.sql.Connection;
import java.sql.SQLException;

public class Entrada {
    public static void main(String[] args) {


        AlumnoRepository alumnoRepository = new AlumnoRepository();
        alumnoRepository.insertarAlumno(new Alumno("Edu parametro", "Afan parametro", "correo parametro",123123 ));




       /* Connection connection = DBconnection.getConnection();
        try {
            System.out.println(connection.getCatalog());
        } catch (SQLException  | NullPointerException e) {
            System.out.println("Error en ejecución SQL");
        }*/


    }
}
