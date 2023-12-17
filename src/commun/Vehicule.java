package commun;

public abstract class Vehicule {
    private int nbreDePlaceParkingAlloue;
    private int nbreVehicule = 0;
    private int typeVehicule;

    public void setNbreDePlaceParkingAlloue(int nbreDePlaceParkingAlloue) {
        this.nbreDePlaceParkingAlloue = nbreDePlaceParkingAlloue;
    }

    public void setNbreVehicule(int nbreVehicule) {
        this.nbreVehicule = nbreVehicule + this.nbreVehicule;
    }

    public void setTypeVehicule(int typeVehicule) {
        this.typeVehicule = typeVehicule;
    }

    public int getNbreDePlaceParkingAlloue() {
        return nbreDePlaceParkingAlloue;
    }

    public int getNbreVehicule() {
        return nbreVehicule;
    }

    public int getTypeVehicule() {
        return typeVehicule;
    }

    public int getNbrePlaceTotalPrise() {
        return nbreVehicule * nbreDePlaceParkingAlloue;
    }

    public abstract void getChoixVehicule();

}
