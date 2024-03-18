package model_Clase;

public class Usuario {
    private String nombre, apellido, dni, correo, pass, nacionalidad;
    private int telefono;

    public Usuario(String nombre, String apellido, String dni) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;

    }

    public Usuario(String nombre, String apellido, String dni, String correo, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;

    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);// o nombre sin this, cuando acostumbremos
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Correo: " + correo);
        System.out.println("Telefono: " + telefono);
    }


    // setter y getter .. por cada variable, con atajo de teclado no tiene que escribir uno a uno


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
