import model_Gasolinera.Gasolinera;
import model_Gasolinera.Surtidor;

public class Entrada {


    public static void main(String[] args) {

        Surtidor surtidor1 = new Surtidor(550, "Super95");
        Surtidor surtidor2 = new Surtidor(400, "Diesel");
        Surtidor surtidor3 = new Surtidor("Super95");
        Gasolinera gasolinera = new Gasolinera("BP");

        gasolinera.agregarSurtidor(surtidor1);
        gasolinera.agregarSurtidor(surtidor2);
        gasolinera.agregarSurtidor(surtidor3);
        //for(Surtidor surtidor:gasolinera.getLista()) no soy capaz de mostrar la lista surtidores...


    }
}
