package controller_Llamadas;

import model_Llamadas.LlamadaLocal;
import model_Llamadas.LlamadaNacional;

import java.util.ArrayList;

public class Centralita {

    private ArrayList<LlamadaLocal> llamadaslocales;
    private ArrayList<LlamadaNacional> llamadasnacionales;
    private int costeAcumulado;

    public Centralita() {
        this.llamadaslocales = new ArrayList<>();
        this.llamadasnacionales = new ArrayList<>();
        costeAcumulado = 0;
    }
    /*Un método agregarLocal que no devuelva nada y que admita por parámetros una llamada local. La funcionalidad
    // del método agregará la llamada local a la lista de llamadas local
    //public void agregarLocal(LlamadaLocal llamadaLocal) que diferencia tendría , que me esta piodiendo realmente
        // una seria con All y otra sin
     //public void agregarLocal(ArrayList<LlamadaLocal> llamadaslocal) {
     //lamadaslocales.addAll(llamadaslocal);*/
    public void agregarLocal(LlamadaLocal llamadaLocal) {
        llamadaslocales.add(llamadaLocal);  //entiendo que seria de una en una
    }

    public void agregarNacional(LlamadaNacional llamadanacional) {
        llamadasnacionales.add(llamadanacional);
    }
    //no entiendo bien el funcionameinto de coger llamadaLocal para los get , hay que ir de una en una ? y llamadaslocales es simplemente la lista?
    public void listarLocales() {
        System.out.println(" Mostrar llamadas locales : ");
        for (LlamadaLocal llamadaLocal : llamadaslocales) {
            System.out.println("\n El número de origen es : " + llamadaLocal.getNumeroOrigen() + "El número de destino es : "
                    + llamadaLocal.getNumeroDestino() + "LA duracion de la llamada es : " + llamadaLocal.getDuracion() + "El coste de la lalmada es : " + llamadaLocal.getCoste());
        }
    }
    public void listarNacionales() {
        System.out.println("Mostrar llamadas nacionales : ");
        for (LlamadaNacional llamadaNacional : llamadasnacionales) {

            System.out.println("\n El número de origen es : " + llamadaNacional.getNumeroOrigen() + "El número de destino es : "
                    + llamadaNacional.getNumeroDestino() + "LA duracion de la llamada es : " + llamadaNacional.getDuracion() + "El coste de la lalmada es : " + llamadaNacional.getCoste());
        }
    }

    public void mostrarCostes() {
        System.out.println("Mostrar costes acumulados : ");
        System.out.println("El coste acumulado es " +costeAcumulado);
//con un for recorro las llamadas y pillo los costes
      //  costeAcumulado+=(llamadasnacionales.getcoste + llamadaslocales.getcoste)
    }
    public ArrayList<LlamadaLocal> getLlamadaslocales() {
        return llamadaslocales;
    }

    public void setLlamadaslocales(ArrayList<LlamadaLocal> llamadaslocales) {
        this.llamadaslocales = llamadaslocales;
    }

    public ArrayList<LlamadaNacional> getLlamadasnacionales() {
        return llamadasnacionales;
    }

    public void setLlamadasnacionales(ArrayList<LlamadaNacional> llamadasnacionales) {
        this.llamadasnacionales = llamadasnacionales;
    }

    public int getCosteAcumulado() {
        return costeAcumulado;
    }

    public void setCosteAcumulado(int costeAcumulado) {
        this.costeAcumulado = costeAcumulado;
    }
}
