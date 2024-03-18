import controller_Interfaz.Empresa;
import model_Interfaz.Accionista;
import model_Interfaz.Asalariado;
import model_Interfaz.Jefe;

public class Entrada {

    public static void main(String[] args) {
        // Persona persona =new Persona();
        //Persona persona1 =  new Persona("52997904Q","Edu","edu@gmail.com");
        //persona1.mostrardatos(); No quiero que exixta una persona porqu eexiste
        // un jefe, un trabajador etc

        Asalariado asalariado1 = new Asalariado("Edu", "Afan", "edu@gmail.com", 10000, 14);
        Asalariado asalariado2 = new Asalariado("Mario", "Ruiz", "Mario@gmail.com", 10000, 14);
        Asalariado asalariado3 = new Asalariado("Ale", "Lopez", "Ale@gmail.com", 10000, 14);
        Asalariado asalariado4 = new Asalariado("Laura", "Garcia", "Laura@gmail.com", 10000, 14);
        Jefe jefe1 = new Jefe("Juan", "Perez", "Juan@gmail.com", 6000, 49);
        Jefe jefe2 = new Jefe("Juan", "Perez", "Juan@gmail.com", 6000, 49);
        Accionista accionista = new Accionista("Pepe", "Lopez", "Pepe@gmail.com");
        Empresa empresa =new Empresa();
        empresa.agregarPersona(asalariado1);
        empresa.agregarPersona(asalariado2);
        empresa.agregarPersona(asalariado3);
        empresa.agregarPersona(asalariado4);
        empresa.agregarPersona(jefe1);
        empresa.agregarPersona(jefe2);
        empresa.agregarPersona(accionista);
        //empresa.empezarJornadaLaboral();
        empresa.realizarVotación();
    }
}
