package model_Trigonometria;

import java.util.Scanner;

public class Triángulo {

    Scanner scanner = new Scanner(System.in);
    private int base;
    private int altura;

    public Triángulo() {

    }

    public void mostrarDatosbase() {
        System.out.println("La base del triangulo es : " + base);
        System.out.println("La altura del triangulo es : " + altura);
    }

    public Triángulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularAreaT() {
        System.out.println("Introduce la base : ");
        base = scanner.nextInt();
        System.out.println("Introduce la altura : ");
        altura = scanner.nextInt();

        int area = (base * altura) / 2;
        System.out.println("El área del triángulo es : " + area);
    }

    public void calcularPerímetroT() {

        double perímetro = 3 * base;
        System.out.println("El perímetro del triángulo es: " + perímetro);
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
}
