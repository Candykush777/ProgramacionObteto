import model_Clase.Aula;
import model_Clase.Usuario;

public class Entrada {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Borja", "Martin", "1234A");//objeto
        Usuario usuario2 = new Usuario("Luis", "Herrera", "2345");//objeto
        Usuario usuario3 = new Usuario("Eduardo", "Afan", "52997904Q", "eduardo@gmail.com", 656777888);//objeto


        Aula aula = new Aula(usuario2, usuario3);
        aula.setUsuario1(usuario3);
        aula.mostrardatosusuarios();


        //imprimir, setter y getter

        System.out.println(usuario1.getNombre());
        usuario3.setNombre("Julia");
        System.out.println(usuario3.getNombre());
    }
}
