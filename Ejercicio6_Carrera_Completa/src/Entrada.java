import model_Carrera.Coche;
import model_Carrera.Carrera;
import java.util.Scanner;

public class Entrada {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int kmEtapa=10000;

        Coche cocheA = new Coche("XC60", "7667XTR", 380);
        Coche cocheB = new Coche("Tiguan", "8690JWD", 125);

        System.out.println();
        cocheA.mostrarDatos();
        System.out.println("-------------------------------------------------------------------");
        cocheB.mostrarDatos();
        Carrera carrera = new Carrera(10000,cocheA,cocheB);
        carrera.comienzaCarrera();


    }
}
