package controller_Interfaz;

import model_Interfaz.Persona;
import model_Interfaz.Responsable;
import model_Interfaz.Trabajador;

import java.util.ArrayList;

public class Empresa {
    ArrayList<Persona> listaPersonas;

    public Empresa(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public Empresa() {
        this.listaPersonas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        listaPersonas.add(persona);
    }

    public void empezarJornadaLaboral() {
        for (Persona item : listaPersonas) {

            if (item instanceof Trabajador) {
                ((Trabajador) item).trabajar();
            }
        }

    }

    public void realizarVotación() {

        for (Persona item : listaPersonas) {
            if (item instanceof Responsable){
                ((Responsable) item).realizarVotacion();
            }

        }
    }
}
