package model_Interfaz;

public class Accionista extends Persona implements Responsable{

    public Accionista() {
    }

    public Accionista(String dni, String nombre, String correo) {
        super(dni, nombre, correo);
    }

    @Override
    public void mostrarDatos() {

    }

    @Override
    public void realizarVotacion() {
        System.out.println("El accionista ha entrado en escena y votará");
        int aleatorio=(int) ((int) (Math.random()*10)*2);
        System.out.println("el voto supremo del accionista es " +aleatorio);

    }
}
