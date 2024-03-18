package model_Asignaturas;

public class Asignatura {
    private int id;
    private double calificacion;

    public Asignatura(int id) {
        this.id = id;
    }
    public void mostrarDatos(){
        System.out.println("ID" +id);
        System.out.println("Calificación" +calificacion);
    }
    /*public void mostrarDatos(String nombre){
        Estoy sobrecargando el método, pero ahora mismo no me interesa
        System.out.println("ID" +id);
        System.out.println("Calificación" +calificacion);
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
