package Coche;

public class Motor {

    private int litrosdeaceite , cv;


    public Motor() {
        // Constructor por defecto
        this.litrosdeaceite = 5; // Establecer los litros de aceite en 5 por defecto
    }

    public Motor(int cv) {
        this.cv = cv;
    }

    public int getLitrosdeaceite() {
        return litrosdeaceite;
    }

    public int getCv() {
        return cv;
    }

    public void setLitrosdeaceite(int litrosdeaceite) {
        this.litrosdeaceite = litrosdeaceite;
    }
}


