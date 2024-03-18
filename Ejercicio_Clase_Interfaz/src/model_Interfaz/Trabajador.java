package model_Interfaz;

public abstract class Trabajador extends Persona {

    private int salario;

    public Trabajador() {
    }

    public abstract void trabajar();

    public Trabajador(String dni, String nombre, String correo, int salario) {
        super(dni, nombre, correo);
        this.salario = salario;
    }
    @Override
    public void mostrarDatos(){
        super.mostrardatos();
        System.out.println("salario = " + salario);
    }


    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
