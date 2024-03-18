package model_Carrera;

public class Carrera {

    private int kmetapa = 10000;
    private Coche cocheA, cocheB;
    public String ganador;

    public Carrera() {

    }

    public Carrera(int kmetapa, Coche cocheA, Coche cocheB) {
        this.kmetapa = kmetapa;
        this.cocheA = cocheA;
        this.cocheB = cocheB;
    }

    public void comienzaCarrera(Coche cocheA, Coche cocheB) {
        System.out.println("Comienza la carrera:");
        boolean carreraFinalizada = false;
        do {
            for (int i = 0; i < 10000; i++) {
                this.cocheA.acelerar(100);
                this.cocheB.acelerar(100);
                if (this.cocheA.getKmRecorridos() >= kmetapa && this.cocheB.getKmRecorridos() >= kmetapa) {
                    carreraFinalizada = true;
                    break; // Salir del bucle for cuando se cumple la condición de finalización
                }
            }
        } while (!carreraFinalizada);

        // Llamar al método ganador() después de que la carrera finalice
        ganador();
    }

    public void ganador() {
        if (cocheA.getKmRecorridos() > cocheB.getKmRecorridos()) {
            ganador = cocheA.getMatricula();
            System.out.println("El coche ganador es el Modelo: " + cocheA.getModelo() + " con Matrícula: " + cocheA.getMatricula() + " con km recorridos: " + cocheA.getKmRecorridos());
        } else {
            ganador = cocheB.getMatricula();
            System.out.println("El coche ganador es el Modelo: " + cocheB.getModelo() + " con Matrícula: " + cocheB.getMatricula() + " con km recorridos: " + cocheB.getKmRecorridos());
        }
    }


    public void comienzaCarrera() {
}}
