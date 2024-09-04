package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

    static Connection connection = null;


    //configuración para crear la conexioçon con la base de datos
    //static : accesible desde todos los sitios de forma directa
    // un elemento que pertenece a la clase, no al objeto, nombre d ela clase . del elemento

    // crea la conexion

    //pide la conexion

    private static void createConnection(){

        //cargar el driver en memoria

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //abrir conexion
            //uri jdbc:mysql://127.0.0.1/curso_ue
            String uri = "jdbc:mysql://127.0.0.1:3306/academia";
            //3306 e sel puerto remotoq ue será mapeado
            //abrir la conexión desde una uri, con usuario que tiene una pass

            connection = DriverManager.getConnection(uri,"root", "");

        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el Driver");
            System.out.println(e.getMessage());
        } catch (SQLException e){
            System.out.println("Error en la ejecución de SQL");
            System.out.println(e.getMessage());
        }





    }
    //pide la conexión

    public static Connection getConnection(){

        if (connection == null) {
            //crea la conexion

            createConnection();
        }


        return connection;

    }

    //cierra la conexión

    public static  void closeConnection(){

        try {
            connection.close();
            connection = null;
        } catch (SQLException e) {
            System.out.println("Error en el cerrado de la bbdd");
        }
    }
}
