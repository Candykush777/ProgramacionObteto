package model_Interfaz;

public class Jefe extends Trabajador implements Responsable{

    private int percAcciones;
    @Override
    public void trabajar() {

        System.out.println("El jefe se pone a trabajar");

    }

    public Jefe() {
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("percAcciones = " + percAcciones);
    }

    public Jefe(String dni, String nombre, String correo, int salario, int percAcciones) {
        super(dni, nombre, correo, salario);
        this.percAcciones = percAcciones;
    }

    @Override
    public void realizarVotacion() {
        System.out.println("El jefe se dispone a votar");
        int aleatorio=(int)Math.random()*5/2;
        System.out.println("El voto del jefe es " +aleatorio);

    }
}
