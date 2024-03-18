package model_Llamadas;

public class LlamadaLocal {
    private long numeroOrigen, numeroDestino;
    private double coste, duracion;

    public LlamadaLocal() {
    }

    public LlamadaLocal(long numeroOrigen, long numeroDestino, double duracion) {
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        this.duracion = duracion;
        //Vamos a calcular el coste
        double costeSegundo = 0.15;
        double estabLlamada = 0.50;
        this.coste = (costeSegundo * duracion) + estabLlamada;
    }

    public void mostrarDatos() {

        System.out.println("Datos de la llamada : ");
        System.out.println("\n El número de origen es : " + numeroOrigen + "El número de destino es : "
                + numeroDestino + "LA duracion de la llamada es : " + duracion + "El coste de la lalmada es : " + coste);
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
}
