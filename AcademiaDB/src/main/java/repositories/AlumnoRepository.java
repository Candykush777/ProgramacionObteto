package repositories;

import database.DBconnection;
import model.Alumno;

import java.sql.*;

public class AlumnoRepository {

    private Alumno alumno; // Variable de instancia para almacenar el resultado

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

        //INSERT ->

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
        }finally {

            //cerrar conexion

            DBconnection.closeConnection();
        }






    }

    //DELETE

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
            System.out.println("Se detecta error al eliminar el alumno");
        }
        finally {
            DBconnection.closeConnection();
        }


    }

    //UPDATE

    public void actualizaralumno(Alumno alumno){

        connection = DBconnection.getConnection();
        PreparedStatement preparedStatement = null;


        try {
            String query = "UPDATE alumnos SET nombre = ?, apellido = ?, correo = ?, teléfono = ? WHERE id = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, alumno.getNombre());
            preparedStatement.setString(2, alumno.getApellido());
            preparedStatement.setString(3, alumno.getCorreo());
            preparedStatement.setInt(4, alumno.getTeléfono());
            preparedStatement.setInt(5, alumno.getId());

            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0){
                System.out.println("Alumno actualizado satisfactoriamente");
            }else {
                System.out.println("No se encontró alumno con ese ID");
            }
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println("Error al actualizar el alumno : " + e.getMessage());

        }finally {
            DBconnection.closeConnection();
        }


    }

    //READ

    public void obtenerAlumnoPorId(int id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            connection = DBconnection.getConnection();


            String query = "SELECT * FROM alumnos WHERE id = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                alumno = new Alumno();
                alumno.setId(resultSet.getInt("id"));
                alumno.setNombre(resultSet.getString("nombre"));
                alumno.setApellido(resultSet.getString("apellido"));
                alumno.setCorreo(resultSet.getString("correo"));
                alumno.setTeléfono(resultSet.getInt("teléfono"));

                System.out.println("ID: " + alumno.getId());
                System.out.println("Nombre: " + alumno.getNombre());
                System.out.println("Apellido: " + alumno.getApellido());
                System.out.println("Correo: " + alumno.getCorreo());
                System.out.println("Teléfono: " + alumno.getTeléfono());

            } else {
                System.out.println("No se encontró el alumno con ID: " + id);
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener el alumno: " + e.getMessage());
        }finally {
            DBconnection.closeConnection();
        }

    }
}
