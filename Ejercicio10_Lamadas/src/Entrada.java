import controller_Llamadas.Centralita;
import model_Llamadas.LlamadaLocal;
import model_Llamadas.LlamadaNacional;

import java.util.Scanner;

public class Entrada {

    // private Centralita centralita; esto es lo q pide...
//Centralita centralita=new Centralita();
    //pide crear un atributo ,no crear objeto  pero se comporta en cierta manera como un objeto,
    // cuando crear uno u otro si el enunciado es abierto??
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Centralita centralita = new Centralita();
        LlamadaLocal local = new LlamadaLocal();
        LlamadaNacional nacional = new LlamadaNacional();
        int option;
        do {
            System.out.println();
            System.out.println("1.- Agregar llamada local");
            System.out.println("2.- Agregar llamada nacional");
            System.out.println("3.- Mostrar datos llamadas locales");
            System.out.println("4.- Mostrar datos llamadas nacionales ");
            System.out.println("5.- Mostrar coste acumulado ");
            System.out.println("6.- Salir programa ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    centralita.agregarLocal(local);
                    break;
                case 2:
                    centralita.agregarNacional(nacional);
                    break;
                case 3:
                    local.mostrarDatos();
                    break;
                case 4:
                    nacional.mostrarDatos();
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Sayonara baby");
                    break;
                default:
                    System.out.println("Opción incorrecta, por favor ingrese un número válido.");
                    break;
            }
        }
        while (option != 6);

    }
}
