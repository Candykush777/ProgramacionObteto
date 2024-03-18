package Coche;
//
public class Garaje {

    private Coche cocheAtendido;
    private String averiaAceite,averiaBujias;
    private int numeroCochesatendidos;

    public Garaje(){

        this.cocheAtendido=null;
        this.averiaAceite="aceite";
        this.averiaBujias="bujias";
        this.numeroCochesatendidos=0;

    }

    public boolean aceptarcoche(Coche coche, String averia){

        if(this.cocheAtendido==null){
            this.cocheAtendido=coche;
            this.averiaAceite=averia;
            this.averiaBujias=averia;
            this.numeroCochesatendidos++;
            System.out.println("El coche fue atendido correctamente");
            return true;
        } else{
            System.out.println("El coche no se puede aceptar, ya hay un coche en el garaje");
            return false ;
        }


    }
    public void devolverCoche(){

        if (cocheAtendido != null){
            double importeAveria = Math.random() * 1000; // Importe aleatorio entre 0 y 1000
            cocheAtendido.acumularAveria(importeAveria, averiaAceite); // Acumular avería (se pasa la avería "aceite")
            if (averiaAceite.equals("aceite")) { // Si la avería es "aceite", incrementar en 10 los litros de aceite
                cocheAtendido.incrementarLitrosAceite(10);
            }
            cocheAtendido = null; // Devolver el coche
            System.out.println("Se ha tratado la avería del coche y se ha acumulado un importe de " + importeAveria + " euros.");
        } else {
            System.out.println("No hay ningún coche en el garaje para devolver.");
        }
    }

    public Coche getCocheAtendido() {
        return cocheAtendido;
    }

    public void setCocheAtendido(Coche cocheAtendido) {
        this.cocheAtendido = cocheAtendido;
    }

    public String getAveriaAceite() {
        return averiaAceite;
    }
    public String getAveriaBujias() {
        return averiaBujias;
    }

    public Garaje(Coche cocheAtendido, String averiaAceite, String averiaBujias) {
        this.cocheAtendido = cocheAtendido;
        this.averiaAceite = averiaAceite;
        this.averiaBujias = averiaBujias;
    }

    public void setAveriaAceite(String averiaAceite) {
        this.averiaAceite = averiaAceite;
    }
    public void setAveriaBujias(String averiaBujias) {
        this.averiaBujias= averiaBujias;
    }

    public int getNumeroCochesatendidos() {
        return numeroCochesatendidos;
    }

    public void setNumeroCochesatendidos(int numeroCochesatendidos) {
        this.numeroCochesatendidos = numeroCochesatendidos;
    }
}
