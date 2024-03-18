package model_Clase;

public class Aula {
    private Usuario usuario1, usuario2;

    public Aula() {
    }

    public Aula(Usuario usuario1, Usuario usuario2) {
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
    }
    public void mostrardatosusuarios(){
        usuario1.mostrarDatos();

    }

    public Usuario getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(Usuario usuario1) {
        this.usuario1 = usuario1;
    }

    public Usuario getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(Usuario usuario2) {
        this.usuario2 = usuario2;
    }
}
