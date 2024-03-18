package model_Carrera;

import java.util.Scanner;


public class Coche {
    private int cv;
    private int velocidad;
    private String matricula;
    private String modelo;
    private double kmRecorridos;


    public Coche() {
        this.cv = 0;
        this.velocidad = 0;
        this.matricula = "0000AAA";
        this.modelo = " ";
        this.kmRecorridos = 0.0;
    }

    public Coche(String modelo, String matricula, int cv) {
        this.cv = cv;
        this.matricula = matricula;
        this.modelo = modelo;
        this.velocidad = (int) (Math.random() * 21) + 10;
        this.kmRecorridos = 0.0;
    }

    public void acelerar(int aceleracion) {
        Scanner scanner = new Scanner(System.in);
        aceleracion = scanner.nextInt();
        velocidad += aceleracion;
        kmRecorridos += velocidad * (cv * (Math.random() * 10) + 1);
        if (velocidad > 180) {
            velocidad = 180;
            System.out.println("La velocidad se mantiene a max 180 km/h, no puede superarlo ");
        }

    }

    public void frenar(int frenada) {
        Scanner scanner = new Scanner(System.in);
        frenada = scanner.nextInt();
        velocidad -= frenada;
        if (velocidad < 0) {
            velocidad = 0;
            System.out.println("La velocidad minima del coche no puede ser menor a 0 ");
        }


    }

    public void velocidadCero() {
        velocidad = 0;

    }

    public void resetear() {
        velocidad = 0;
        kmRecorridos = 0;
    }

    public void mostrarDatos() {
        System.out.println("Matrícula : " + matricula + " Modelo : " + modelo + " Velocidad : " + velocidad + "km/h" + " Kilómetros : " + kmRecorridos);


    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getVelocidad() {

        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public void ganador() {
//habra que meter aqui la condicion de ganador con un if ...
        System.out.println("El coche ganador es el Modelo : " + modelo + "Con Matrícula : " + matricula + "con km recorridos" + getKmRecorridos());

    }
}
