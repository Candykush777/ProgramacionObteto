package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Alumno {

    private String nombre, apellido, correo;

    private int id;

    // el id se lo da la bbdd por que es autoincremental,
    // según se vayan registrando irá asignando id en numero incrementandolos .

    private int teléfono;

    public Alumno(String nombre, String apellido, String correo, int teléfono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.teléfono = teléfono;
    }
}
