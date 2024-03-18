import java.util.Scanner;
/*1. Crea una clase llamada persona con los siguientes elementos
    - Propiedades: nombre (string) apellido (string) dni (string) edad (int) peso (double) altura (int)
    - Métodos:
        - mostrarDatos: sacará por pantalla los datos de la persona formateados
        - Métodos getters y setters asociados
        - Constructores:
            - un constructor que permita crear una persona con todos los datos
            - un constructor que permita crear una persona sin peso ni altura
            - un constructor que permita crear una persona con nombre y apellidos, el resto de datos los pondrá a 0, excepto el dni que lo pondrá a 111111111X
            - un constructor que permita crear una persona sin datos de entrada. Los inicializará todos a "datos por defecto", 1111111111X y 0 respectivamente
   3. En la clase creada en el ejercicio 1 crear los siguientes métodos con la funcionalidad que se indica:
    - Un método que recibe por parámetros un número e incrementa la edad de la persona en el parámetro pasado por argumentos
    - Un método que calcule y devuelva el IMC. Para calcular el imc se aplica la siguiente formula IMC = peso / (altura * altura) */
public class Persona {
    private String nombre, apellido, dni, genero;
    private int edad;
    private double peso, IMC, altura;
    Scanner scanner = new Scanner(System.in);


    public Persona(String nombre, String apellido, String dni, int edad, double peso, double altura, double IMC, String genero) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.IMC = IMC;
        this.genero = genero;
    }

    public Persona(String nombre, String apellido, String dni, int edad) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = 0;
        this.peso = 0.0;
        this.altura = 0;
        this.dni = "111111111X";
    }

    public Persona() {

        this.nombre = "datos por defecto";
        this.apellido = "datos por defecto";
        this.edad = 0;
        this.peso = 0.0;
        this.altura = 0;
        this.dni = "111111111X";

    }

    public Persona(double IMC) {

        this.IMC = IMC;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void incrementoEdad(int incremento) {
        this.edad += incremento;

    }

    public double getIMC() {
        return IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

    public double calculoIMC() {

        return peso / (altura * altura);
    }

    public void estadoFisico(int genero) {

        double imc = calculoIMC();

        switch (genero) {
            case 1:
                // Lógica para hombres
                if (imc < 20) {
                    System.out.println("Bajo peso");
                } else if (imc >= 20.0 && imc <= 27.0) {
                    System.out.println("Normal");
                } else if (imc >= 27.0 && imc <= 30.0) {
                    System.out.println("Sobrepeso");
                } else if (imc >= 30.01 && imc <= 40.0) {
                    System.out.println("Obesidad");
                } else {
                    System.out.println("Obesidad mórbida");
                }
                break;
            case 2:
                // Lógica para mujeres
                if (imc < 20) {
                    System.out.println("Bajo peso");
                } else if (imc >= 20.0 && imc <= 25.0) {
                    System.out.println("Normal");
                } else if (imc >= 25.01 && imc <= 30.0) {
                    System.out.println("Sobrepeso");
                } else if (imc >= 30.01 && imc <= 40.0) {
                    System.out.println("Obesidad");
                } else {
                    System.out.println("Obesidad mórbida");
                }
                break;
            default:
                System.out.println("Género no válido");
        }

    }
}
