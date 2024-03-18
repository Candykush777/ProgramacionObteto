import model_Equipo.Equipo;

public class Entrada {

    public static void main(String[] args) {
        Equipo equipoA = new Equipo("Zaragoza");
        Equipo equipoB = new Equipo("Real Madrid", 90, 95, 85);
        //Equipo equipo2=new Equipo("Barcelona", 88,90,83);
        //Equipo equipo3=new Equipo("Atletico de Madrid", 86, 84, 83);
        //Equipo equipo4=new Equipo("Liverpool",90,87,85);
        equipoA.atacar();
        equipoB.atacar();
        System.out.println(" El equpipo : " + equipoA.getNombre() + " Ha marcado : " + equipoA.getGoles());
        System.out.println(" El equpipo : " + equipoB.getNombre() + " Ha marcado : " + equipoB.getGoles());
        equipoA.atacar();
        equipoB.atacar();
        equipoA.atacar();
        equipoB.atacar();
        equipoA.atacar();
        equipoB.atacar();
        System.out.println(" El equpipo : " + equipoA.getNombre() + " Ha marcado : " + equipoA.getGoles());
        System.out.println(" El equpipo : " + equipoB.getNombre() + " Ha marcado : " + equipoB.getGoles());
    }

}
