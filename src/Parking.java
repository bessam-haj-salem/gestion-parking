class Parking {

    private int nbreDePlaceParkingAlloue = 10;
    private int placeAlloueVoiture = 1;
    private int placeAlloueBerline = 2;
    private int placeAlloueCamion = 4;
    private int nbreVoiture;
    private int nbreBerline;
    private int nbreCamion;

    public int getNbreVoiture() {
        return nbreVoiture;
    }

    public void setNbreVoiture(int nbreVoiture) {
        setNbreDePlaceParkingAlloue(nbreVoiture * placeAlloueVoiture);
        this.nbreVoiture = this.nbreVoiture + nbreVoiture;
    }

    public int getNbreBerline() {
        return nbreBerline;
    }

    public void setNbreBerline(int nbreBerline) {
        setNbreDePlaceParkingAlloue(nbreBerline * placeAlloueBerline);
        this.nbreBerline = this.nbreBerline + nbreBerline;
    }

    public int getNbreCamion() {
        return nbreCamion;
    }

    public void setNbreCamion(int nbreCamion) {
        setNbreDePlaceParkingAlloue(nbreCamion * placeAlloueCamion);
        this.nbreCamion = this.nbreCamion + nbreCamion;
    }

    public int getNbreDePlaceParkingAlloue() {
        return nbreDePlaceParkingAlloue;
    }

    private void setNbreDePlaceParkingAlloue(int nbreDePlaceParkingAlloue) {
        this.nbreDePlaceParkingAlloue = this.nbreDePlaceParkingAlloue - nbreDePlaceParkingAlloue;
    }

}
