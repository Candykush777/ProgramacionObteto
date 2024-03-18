import Coche.Garaje;
import Coche.Coche;

public class Aplicación {
    public static void main(String[] args) {

        Garaje garaje=new Garaje();
        Coche coche1=new Coche("Seat", "Ibiza");
        Coche coche2=new Coche("Renault", "Clio");

        //Aceptar los coches en el garage

        garaje.aceptarcoche(coche1, "aceite");
        garaje.devolverCoche();
        garaje.aceptarcoche(coche2,"aceite");


        garaje.devolverCoche();

    }

}
