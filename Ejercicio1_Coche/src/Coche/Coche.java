package Coche;
//
public class Coche {
    private Motor motor;
    private String marca, modelo;
    private double paaverias;
    private int litrosAceite;

    public Coche(){

    }
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.paaverias=0;
        this.litrosAceite = 0;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void acumularAveria(double importegastadoaverias, String averia){

        this.paaverias += importegastadoaverias;

    }

    public void incrementarLitrosAceite(int litros) {
        this.litrosAceite += litros;
    }
}

