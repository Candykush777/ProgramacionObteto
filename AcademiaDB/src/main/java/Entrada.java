import database.DBconnection;

import java.sql.Connection;
import java.sql.SQLException;

public class Entrada {
    public static void main(String[] args) {

        Connection connection = DBconnection.getConnection();

        try {
            System.out.println(connection.getCatalog());
        } catch (SQLException  | NullPointerException e) {
            System.out.println("Error en ejecución SQL");
        }


    }
}
