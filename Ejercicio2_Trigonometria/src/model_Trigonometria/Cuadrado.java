package model_Trigonometria;

import java.util.Scanner;

public class Cuadrado {
    Scanner scanner = new Scanner(System.in);
    private int base;
    private int altura;
    private double área, perímetro;

    public Cuadrado() {
    }

    public void mostrarDatos() {
        System.out.println("La base del cuadrado es : " + base);
        System.out.println("La altura del cuadrado es : " + altura);
    }

    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularÁreaCu() {
        System.out.println("Introduce la base : ");
        base= scanner.nextInt();
        System.out.println("Introduce la altura : ");
        altura= scanner.nextInt();
        double área = base * altura;
        System.out.println("El área del cuadrado es : " + área);

    }

    public void calcularPerímetro() {
        System.out.println("Introduce la base : ");
        base= scanner.nextInt();
        System.out.println("Introduce la altura : ");
        altura= scanner.nextInt();
        double perímetro = (2 * altura) + (2 * base);
        System.out.println("El perímetro del cuadrado es: " + perímetro);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getÁrea() {
        return área;
    }

    public void setÁrea(double área) {
        this.área = área;
    }

    public double getPerímetro() {
        return perímetro;
    }

    public void setPerímetro(double perímetro) {
        this.perímetro = perímetro;
    }
}
