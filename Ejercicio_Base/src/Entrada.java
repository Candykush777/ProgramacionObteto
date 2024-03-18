/*  2. Crear una clase llamada entrada que tenga un método main el cual:
    - Mediante un scanner pida nombre, apellido, dni edad peso y altura de una persona
    - Cree la persona asociada a los datos leídos por teclado (p1)
    - Cree una persona con un nombre y un apellido que se introduzca a mano (sin scanner)
    - Crear una persona sin datos asociados
    - Mostrar los datos de todas las personas
    - Modificar la edad de todas las personas a 20
    4. En la clase entrada creada en el ejercicio 2 crear los siguiente

    La persona que tiene todos los datos (p1) muestra por pantalla su IMC
    Según el IMC mostrado por pantalla, también se tendrá que mostrar por consola el estado físico de la persona.
    Para ello hay que tener en cuenta lo siguiente
    - Peso inferior al normal		Menos de 18.5
    - Normal		18.5 – 24.9
    - Peso superior al normal		25.0 – 29.9
    - Obesidad		Más de 30.0
5. Modifica el ejercicio anterior para que el IMC se pueda calcular según el genero de la persona. En este caso,
para poder calcular el IMC según genero se utilizan las siguientes tablas
*/


import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //persona asociada
        Persona persona1 = new Persona();
        //pedir por scanner nombre, apellido, etc...
        System.out.println("Introduce tu nombre : ");
        persona1.setNombre(scanner.next());
        System.out.println("Introduce tu apellido : ");
        persona1.setApellido(scanner.next());
        System.out.println("Introduce tu DNI : ");
        persona1.setDni(scanner.next());
        System.out.println("Introduce tu edad : ");
        persona1.setEdad(scanner.nextInt());
        System.out.println("Introduce tu peso : ");
        persona1.setPeso(scanner.nextDouble());
        System.out.println("Introduce tu altura : ");
        persona1.setAltura(scanner.nextDouble());
        System.out.println("-------------------------------");
        System.out.println("Selecciona tu género, introduce opcion 1 o 2 :  ");
        System.out.println("1. Hombre");
        System.out.println("2. Mujer");
        int generoOption = scanner.nextInt();
        scanner.nextLine();
        String genero;
        switch (generoOption) {
            case 1:
                genero = "Hombre";
                break;
            case 2:
                genero = "Mujer";
                break;
            default:
                System.out.println("Has introducido un género no válido");
                genero = "No especificado";
                break;
        }
        persona1.estadoFisico(generoOption);
        //Crear persona con datos a mno
        Persona persona2 = new Persona("Juan", "Rodriguez");
        //Crear persona sin datos asociados
        Persona persona3 = new Persona();
        //Modoficar la edad a 20 de todas las personas
        persona1.setEdad(20);
        persona2.setEdad(20);
        persona3.setEdad(20);
        persona1.incrementoEdad(5);
        // Mostrar los datos de todas las personas
        System.out.println("Datos ingresados:");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Apellido: " + persona1.getApellido());
        System.out.println("DNI: " + persona1.getDni());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Peso: " + persona1.getPeso());
        System.out.println("Altura: " + persona1.getAltura());
        System.out.printf("Su IMC es :  %.2f%%%n", persona1.calculoIMC());
        double imcp1 = persona1.calculoIMC();
        System.out.printf("Su estado físico es : ", imcp1);
        persona1.estadoFisico(generoOption);
        System.out.println(persona2.getNombre());
        System.out.println(persona2.getApellido());
        System.out.println(persona3.getEdad());
    }
}
