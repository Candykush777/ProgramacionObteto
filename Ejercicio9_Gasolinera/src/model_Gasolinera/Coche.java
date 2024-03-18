package model_Gasolinera;

public class Coche {

    private String tipoGasolina;
    private int litrosDeposito;

    public Coche(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
        this.litrosDeposito=0;
    }

    public void ponerGasolina(Surtidor surtidor,int litrosRepostar){
        surtidor.quitarGasolina(litrosRepostar);
        if(surtidor.getCapacidadActual()==0 || surtidor.getCapacidadTotal()>100 ){

            System.out.println("Aviso, surtidor vacio o intentas poner más gasolina del depósito ");
        }
        if(surtidor.isFuncionamiento()==false){
            System.out.println("Surtidor averiado");//(!surtidor.isFuncionamiento()) otra manera.
        }
        if(!surtidor.getTipoGasolina().equals(tipoGasolina)){
            System.out.println("Gasolina erronea ");

        }else {
            litrosDeposito++;
            surtidor.quitarGasolina(litrosRepostar);
        }

    }
}
