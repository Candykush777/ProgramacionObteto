package repositories;

import database.DBconnection;
import model.Alumno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AlumnoRepository {

    //tener todas las acciones CRUD que necesito del modelo Alumno

    // INSERT - SELECT - UPDATE - DELETE -> CONNECTION ¡¡¡¡

    //Statement -> C-U-D -- se codifica a "ciegas" y el motor se fia de la codificación
    //PrepareStatement -> C-U-D se codifica parçametros y el motor ya tiene la codificación terminada
    // execute (SQL) -> "Insert into alumnos () VALUES ()" -> bool devuelve si hay fallo o no hay fallo
    // executeUpadate(SQL) -> "Insert into alumnos () VALUES()" -> int, numero filas afectadas


    //ResultSet R


    private Connection connection;

    public void insertarAlumno(Alumno alumno) {

        // abrir conexion

        connection= DBconnection.getConnection();
       // connection.setAutoCommit(true); no s epone xq es automatico

        //trabajar con la conexion
        //INSERT into alumnos(nombre,apellido,correo,telefono)
        // VALUES ('borja', 'martin', 'correo', 1234)

        /*
        C - CREATE - INSERT
        R - READ - SELECT
        U - UPDATE - UPDATE
        D - DELETE - DELETE
        */

        Statement statement=null;
        PreparedStatement preparedStatement=null;

        try {

            /*
            statement = connection.createStatement();
            String query = "INSERT INTO alumnos(nombre,apellido,correo,teléfono) VALUES ('AleUE', 'BonillaUE', 'correobnillaUE', 4321)";
            statement.execute(query);
            statement.close();*/

            String query = "INSERT INTO alumnos(nombre,apellido,correo,teléfono) VALUES (?,?,?,?)";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1, alumno.getNombre());
            preparedStatement.setString(2, alumno.getApellido());
            preparedStatement.setString(3, alumno.getCorreo());
            preparedStatement.setInt(4, alumno.getTeléfono());
            preparedStatement.execute();
            preparedStatement.close();


        } catch (SQLException e) {
            System.out.println("fallo en al sentencia SQL");
        }


        //cerrar conexion

        DBconnection.closeConnection();


        //INSERT ->
    }

    public void eliminarAlumno(int id) {

        connection = DBconnection.getConnection();
        PreparedStatement preparedStatement = null;

String query = "DELETE FROM alumnos WHERE id = ?";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            int filasafectadas = preparedStatement.executeUpdate();

            if(filasafectadas > 0) {
                System.out.println("Alumno eliminado correctamente");
            }else {
                System.out.println("No se encuentra alumno con id especificado");
            }

            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar el alumno");
        }
        DBconnection.closeConnection();

    }

    public void actualizaralumno(Alumno alumno){

        connection = DBconnection.getConnection();
        PreparedStatement preparedStatement = null;

        String query = ""

    }
}
