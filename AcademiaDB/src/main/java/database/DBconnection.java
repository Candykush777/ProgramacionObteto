package database;

import java.sql.Connection;

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
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el Driver");
        }


        //abrir conexion


    }

    public static Connection getConnection(){

        if (connection == null) {
            //crea la conexion

            createConnection();
        }


        return connection;

    }
}
