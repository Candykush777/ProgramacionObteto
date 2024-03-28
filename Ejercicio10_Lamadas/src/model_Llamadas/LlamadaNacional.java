package model_Llamadas;

public class LlamadaNacional {
    private long numeroOrigen,numeroDestino;
    private double coste;
    private int destino; // esto  seria un char con A, B y C, o hacer un array [a,B,C] con posiciones 0,1,2 ??
    private double duracion;

    public LlamadaNacional() {
    }
//destino constructor, char
    public LlamadaNacional(long numeroOrigen, long numeroDestino, double duracion) {
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        this.duracion = duracion;
        this.destino=destino;
        double costeSegundo=0.0;
        if (costeSegundo =='A'){//destino
            costeSegundo= 0.40;
        }
        else if (costeSegundo == 'B'){
            costeSegundo=0.50;
        }
        else if (costeSegundo=='C'){
            costeSegundo=0.60;
        }
        else {
            costeSegundo=0.70;
        }
        this.coste=duracion*costeSegundo;
    }


    public void mostrarDatos(){

        System.out.println("Datos de la llamada : ");
        System.out.println("\n El número de origen es : " +numeroOrigen + "El número de destino es : "
                +numeroDestino + "LA duracion de la llamada es : " +duracion + "El coste de la lalmada es : " +coste);
    }

    public long getNumeroOrigen() {
        return numeroOrigen;
    }

    public void setNumeroOrigen(long numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public long getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(long numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }



    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }
}
