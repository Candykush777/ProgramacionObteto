package model_Gasolinera;

public class Surtidor {

    private int capacidadTotal, capacidadActual;
    private String tipoGasolina;
    private boolean funcionamiento;

    public Surtidor() {
    }

    public Surtidor(int capacidadTotal, String tipoGasolina) {
        this.capacidadTotal = capacidadTotal;
        this.tipoGasolina = tipoGasolina;
        this.capacidadActual = capacidadTotal;
        this.funcionamiento = true;

    }

    public Surtidor(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
        this.capacidadActual = 0;
        this.capacidadTotal = 300;
        this.funcionamiento = true;
    }

    public void arreglar() {
        this.funcionamiento = true;
    }

    public void rellenar(int cantidad) {

        this.capacidadActual += cantidad;
    }

    public void quitarGasolina(int quitar) {
        this.capacidadActual -= quitar;
        /*   // Esto seria para que no quede negativo...
    if (cantidad <= this.capacidadActual) {
        this.capacidadActual -= cantidad;
    } else {
        // Si la cantidad a quitar es mayor que la capacidad actual,
        // establecer la capacidad actual a cero (no puede ser negativa)
        this.capacidadActual = 0;*/


    }

    public int getCapacidadTotal() {
        return capacidadTotal;
    }

    public void setCapacidadTotal(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public String getTipoGasolina() {
        return tipoGasolina;
    }

    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public boolean isFuncionamiento() {
        return funcionamiento;
    }

    public void setFuncionamiento(boolean funcionamiento) {
        this.funcionamiento = funcionamiento;
    }
}
