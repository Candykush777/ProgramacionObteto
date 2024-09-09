import database.DBconnection;
import model.Alumno;
import repositories.AlumnoRepository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        AlumnoRepository alumnoRepository = new AlumnoRepository();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1 - Crear (INSERT)");
            System.out.println("2 - Leer (SELECT)");
            System.out.println("3 - Actualizar (UPDATE)");
            System.out.println("4 - Eliminar (DELETE)");
            System.out.println("5 - Salir");
            System.out.print("Elige una opción: ");

            int opcion = 0;

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número entero válido.");
                scanner.nextLine();
                continue; // Volver al inicio del bucle para pedir la opción nuevamente
            }

            switch (opcion) {
                case 1:
                    // INSERT
                    try {
                        System.out.print("Introduce el nombre del alumno: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Introduce el apellido del alumno: ");
                        String apellido = scanner.nextLine();
                        System.out.print("Introduce el correo del alumno: ");
                        String correo = scanner.nextLine();
                        System.out.print("Introduce el teléfono del alumno: ");
                        int telefono = scanner.nextInt();
                        scanner.nextLine();

                        Alumno alumno = new Alumno();
                        alumno.setNombre(nombre);
                        alumno.setApellido(apellido);
                        alumno.setCorreo(correo);
                        alumno.setTeléfono(telefono);

                        alumnoRepository.insertarAlumno(alumno);
                        System.out.println("Alumno creado correctamente.");
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Debes introducir un número entero válido para el teléfono.");
                        scanner.nextLine();
                    }
                    break;

                case 2:
                    // SELECT
                    try {
                        System.out.print("Introduce el ID del alumno que deseas consultar: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        alumnoRepository.obtenerAlumnoPorId(id);
                        // Aquí podrías imprimir los detalles del alumno si se desea
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Debes introducir un número entero válido para el ID.");
                        scanner.nextLine();
                    }
                    break;

                case 3:
                    // UPDATE
                    try {
                        System.out.print("Introduce el ID del alumno que deseas actualizar: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Introduce el nuevo nombre del alumno: ");
                        String nuevoNombre = scanner.nextLine();
                        System.out.print("Introduce el nuevo apellido del alumno: ");
                        String nuevoApellido = scanner.nextLine();
                        System.out.print("Introduce el nuevo correo del alumno: ");
                        String nuevoCorreo = scanner.nextLine();
                        System.out.print("Introduce el nuevo teléfono del alumno: ");
                        int nuevoTelefono = scanner.nextInt();
                        scanner.nextLine();

                        Alumno alumno = new Alumno();
                        alumno.setId(id);
                        alumno.setNombre(nuevoNombre);
                        alumno.setApellido(nuevoApellido);
                        alumno.setCorreo(nuevoCorreo);
                        alumno.setTeléfono(nuevoTelefono);

                        alumnoRepository.actualizaralumno(alumno);
                        System.out.println("Alumno actualizado correctamente.");
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Debes introducir un número entero válido.");
                        scanner.nextLine();
                    }
                    break;

                case 4:
                    // DELETE
                    try {
                        System.out.print("Introduce el ID del alumno que deseas eliminar: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        alumnoRepository.eliminarAlumno(id);
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Debes introducir un número entero válido para el ID.");
                        scanner.nextLine();
                    }
                    break;

                case 5:
                    // Salir
                    System.out.println("Saliendo...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elige una opción correcta.");
                    break;
            }
        }
    }
}
