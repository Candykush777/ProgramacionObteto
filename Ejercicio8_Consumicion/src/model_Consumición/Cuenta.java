package model_Consumición;

import java.util.ArrayList;

public class Cuenta {

    private int id;
    private boolean estado;
    ArrayList<String> listaArticulos = new ArrayList<>();

    public Cuenta() {
    }

    public Cuenta(int id) {
        this.id = id;
        this.listaArticulos=new ArrayList<>();
    }

    public void agregarArticulos(ArrayList<String> listaArticulos, String articulo) {
        listaArticulos.add(articulo); // así no se agrega articulos
    }

    public  int numeroArticulos() {

        System.out.println("La cuenta con id "+id+" tiene "+listaArticulos.size()+" Articulos");
        return listaArticulos.size();
    }
    public double costeTotalConsumicion(double coste){
        double total = 0.0;

        return coste;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    // sino no me deja en entrada añadir articuloslos a la cuenta, pero no veo por ningn lado que lo pida en el ejercicio
    public void agregarArticulos(Articulo articulo) {
        listaArticulos.add(String.valueOf(articulo));//String.valueOf(articulo)); me lo ha sugerido intllj... xq necesito value??
    }
}
