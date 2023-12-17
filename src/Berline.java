import commun.Vehicule;

public class Berline extends Vehicule {
    public Berline() {
        this.setNbreDePlaceParkingAlloue(2);
        this.setTypeVehicule(2);

    }

    @Override
    public void getChoixVehicule() {
        System.out.println("Le type de véhicule choisie est : Berline");
    }
}
