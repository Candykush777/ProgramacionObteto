package model_Equipo;

public class Equipo {

    private String nombre;
    private int nivelAtaque, nivelCentro, nivelDefensa;
    private int goles;

    public Equipo() {
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.nivelAtaque = (int) (Math.random() * 100) + 1;
        this.nivelCentro = (int) (Math.random() * 100) + 1;
        this.nivelAtaque = (int) (Math.random() * 100) + 1;
        this.goles = 0;
    }

    public Equipo(String nombre, int nivelAtaque, int nivelCentro, int nivelDefensa) {
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelCentro = nivelCentro;
        this.nivelDefensa = nivelDefensa;

    }

    public boolean atacar() {
        if (nivelAtaque * ((int) Math.random() * 2) + (nivelCentro * ((int) Math.random() * 2)) > 90){
            this.goles++;
            return true;}
        else {

            return false;
        }}


    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public int getNivelAtaque () {
        return nivelAtaque;
    }

    public void setNivelAtaque ( int nivelAtaque){
        this.nivelAtaque = nivelAtaque;
    }

    public int getNivelCentro () {
        return nivelCentro;
    }

    public void setNivelCentro ( int nivelCentro){
        this.nivelCentro = nivelCentro;
    }

    public int getNivelDefensa () {
        return nivelDefensa;
    }

    public void setNivelDefensa ( int nivelDefensa){
        this.nivelDefensa = nivelDefensa;
    }

    public int getGoles () {
        return goles;
    }

    public void setGoles ( int goles){
        this.goles = goles;
    }
}
