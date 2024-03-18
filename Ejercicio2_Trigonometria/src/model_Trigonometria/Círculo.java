package model_Trigonometria;

import java.util.Scanner;

public class Círculo {

    Scanner scanner =new Scanner(System.in);
    private double radio;
    private double diámetro, área;

    public Círculo() {

    }

    public void mostrarDatos() {
        System.out.println("El radio del círculo es : " + radio);


    }

    public Círculo(double radio) {
        System.out.println("Introduce el radio del círculo : ");
        this.radio = radio;
    }

    public void calcularÁreaC() {
        System.out.println("Introduce el radio del círculo : ");
        radio= scanner.nextDouble();
        double área = ((Math.PI) * (Math.pow(radio, 2.0)));
        System.out.printf("El área del círculo es : %.2f%n ", área);
    }

    public void calcularDiámetro() {
        System.out.println("Introduce el radio del círculo : ");
        radio= scanner.nextDouble();
        double diámetro = 2 * radio;
        System.out.println("El diámetro del círculo es: " + diámetro);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiámetro() {
        return diámetro;
    }

    public void setDiámetro(double diámetro) {
        this.diámetro = diámetro;
    }

    public double getÁrea() {
        return área;
    }

    public void setÁrea(double área) {
        this.área = área;
    }
}
