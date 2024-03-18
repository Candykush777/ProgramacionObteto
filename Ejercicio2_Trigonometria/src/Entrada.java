import model_Trigonometria.Cuadrado;
import model_Trigonometria.Círculo;
import model_Trigonometria.Triángulo;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triángulo triángulo = new Triángulo();
        Círculo círculo = new Círculo();
        Cuadrado cuadrado = new Cuadrado();
        /*
        System.out.println();
        triángulo.mostrarDatos();
        triángulo.calcularAreaT();
        triángulo.calcularPerímetroT();
        System.out.println("-----------------------------");
        círculo.mostrarDatos();
        círculo.calcularÁreaC();
        círculo.calcularDiámetro();
        System.out.println("-----------------------------");
        cuadrado.mostrarDatos();
        cuadrado.calcularÁreaCu();
        cuadrado.calcularPerímetro();*/
        int option;
        do {
            System.out.println();
            System.out.println("1.Triangulos ");
            System.out.println("2.Círculos ");
            System.out.println("3.Cuadrados ");
            System.out.println("4.Salir del programa");
            System.out.println();
            System.out.println("Elige une opción : ");
            option = scanner.nextInt();
            scanner.nextLine();


            switch (option) {
                case 1:
                    System.out.println("elige 1 = calcular área, 2 =calcular perímetro");
                {
                    int elige = scanner.nextInt();

                    switch (elige) {

                        case 1:
                            triángulo.calcularAreaT();
                            break;
                        case 2:
                            triángulo.calcularPerímetroT();

                            System.out.println("Pulsa enter para continuar" + scanner.next());
                    }
                }
                case 2:
                    System.out.println("elige 1 = calcular área, 2 = calcular diámetro");
                {
                    int elige = scanner.nextInt();

                    switch (elige) {
                        case 1:
                            círculo.calcularÁreaC();
                            break;
                        case 2:
                            círculo.calcularDiámetro();

                            System.out.println("Pulsa enter para continuar" + scanner.next());
                    }
                }
                case 3:
                    System.out.println("elige 1 = calcular área, 2 =calcular perímetro");
                {
                    int elige = scanner.nextInt();

                    switch (elige) {
                        case 1:
                            cuadrado.calcularÁreaCu();
                            break;
                        case 2:
                            cuadrado.calcularPerímetro();

                            System.out.println("Pulsa enter para continuar" + scanner.next());
                    }
                }
            }
        } while (option != 4);
        System.out.println("Sayonara Baby");
        scanner.close();
    }
}
