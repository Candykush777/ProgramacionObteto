package model_Gasolinera;

import java.util.ArrayList;

public class Gasolinera {
    private String nombre;
    private int ganancias;
    private ArrayList<String>lista;

    public Gasolinera(String nombre) {
        this.nombre = nombre;
        this.ganancias=500;
        this.lista=new ArrayList<>();
    }

    public int obtenerGanancias(){

        return ganancias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }
    public void agregarSurtidor(Surtidor surtidor){
        lista.add(String.valueOf(surtidor));//xq me pide valueof?? por el String

    }

    public void mostrarSurtidores() {
        System.out.println("Surtidores en la gasolinera " + nombre + ":");
        for (String surtidor : lista) {
            //  System.out.println("Tipo de Gasolina: " + surtidor.getTipoGasolina() + ", Capacidad Actual: " + surtidor.getCapacidadActual() + "/"
            //  + surtidor.getCapacidadTotal() + ", Funcionamiento: " + (surtidor.isFuncionamiento() ? "Funcionando" : "Fuera de servicio"));
        }
}}
