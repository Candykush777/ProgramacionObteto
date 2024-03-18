package model_Consumición;

public class Articulo {

    private String nombre;
    private double coste;

    public Articulo() {
    }

    public Articulo(String nombre, double coste) {
        this.nombre = nombre;
        this.coste = coste;
    }

    public void precio() {
//creo que el precio no es el coste, será precio de venta y s elo asigno en la lista
        coste = (double) (Math.random() * 10) + 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCoste() {
        return coste = (double) (Math.random() * 10) + 1;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }
}
