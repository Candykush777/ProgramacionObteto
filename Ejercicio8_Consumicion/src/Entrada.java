import model_Consumición.Articulo;
import model_Consumición.Cuenta;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        Articulo articulo = new Articulo();
        Articulo articulo1 = new Articulo("camiseta", 10.50);
        Articulo articulo2 = new Articulo("pantalon", 12.35);
        Articulo articulo3 = new Articulo("gorra", 15.50);


        //articulo1.getcoste(); no me deja

        ArrayList<String> listaConsumiciones = new ArrayList<>();


        Cuenta cuenta = new Cuenta(2);//no entiendo muy bien aignarle un id ??
        cuenta.agregarArticulos(articulo1);
        cuenta.agregarArticulos(articulo2);
        cuenta.agregarArticulos(articulo3);
        cuenta.numeroArticulos();

    }

    public void agregarConsumicion(ArrayList<String> listaConsumiciones, String consumicion) {

        listaConsumiciones.add(consumicion);// para que pide esto?
    }
}
