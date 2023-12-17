import commun.Vehicule;

public class Camion extends Vehicule {
    public Camion() {
        this.setNbreDePlaceParkingAlloue(4);
        this.setTypeVehicule(3);

    }

    @Override
    public void getChoixVehicule() {
        System.out.println("Le type de véhicule choisie est : Camion");
    }
}
