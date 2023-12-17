import commun.Vehicule;

public class Voiture extends Vehicule {
    public Voiture() {
        this.setNbreDePlaceParkingAlloue(1);
        this.setTypeVehicule(1);
    }

    @Override
    public void getChoixVehicule() {
        System.out.println("Le type de véhicule choisie est : Voiture");
    }
}
