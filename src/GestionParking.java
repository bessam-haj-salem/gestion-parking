import java.util.Scanner;

public class GestionParking {
    private int typeVehicule;
    private int nbrePlaceRestante = Parking.nombrePlaces;
    private int nbreVoitures = 0;
    private int nbreCamions = 0;
    private int nbreBerlines = 0;


    public GestionParking() {
        System.out.println("Bienvenue dans votre Parking\n Il existe " + this.nbrePlaceRestante + " places restante");
        this.setTypeVehicule();
    }

    private void getChoixQuitter() {
        while (true) {
            System.out.println("Voulez vous quittez?\n1) Quitter\n2) Entre un autre véhicule");
            Scanner in = new Scanner(System.in);
            int choix = in.nextInt();
            if (choix == 1) {
                System.out.println("Bonne journée et ne revenez plus!!");
                break;
            }
            else if (choix == 2) {
                this.setTypeVehicule();
                break;
            }
            else {
                System.out.println("Veuillez choisir un des choix spécifié!");
            }
        }
    }

    private void setTypeVehicule() {
        System.out.println("Entre le type de votre véhicule:\n1) Voiture standard\n2) Une berline\n3) Un Camion ");
        Scanner in = new Scanner(System.in);
        this.typeVehicule = in.nextInt();
        System.out.println("Le type de véhicule choisie est :\n" + this.typeVehicule);
        this.nbrePlaceRestante = getNbrePlaceRestante();
        System.out.println("le nombre de place restante est de: " + this.nbrePlaceRestante);
        this.getTableauVehicules();
        this.getChoixQuitter();
    }

    private void getTableauVehicules() {
        System.out.println("----------------------------------------------------------\nNombre voitures | Nombre berlines " +
                "| Nombre Camions\n---------------- --------------- ---------------\n" + "       " + this.nbreVoitures +
                "        |       " + this.nbreBerlines + "       |       " + this.nbreCamions
                + "\n------------------------------------------------");
    }

    private int getNbrePlaceRestante() {
        if (this.typeVehicule == 1) {
            this.nbreVoitures++;
            return this.nbrePlaceRestante - Parking.voiturePlace;
        } else if (this.typeVehicule == 2) {
            this.nbreBerlines++;
            return this.nbrePlaceRestante - Parking.berlinPlaces;
        } else if (this.typeVehicule == 3) {
            this.nbreCamions++;
            return this.nbrePlaceRestante - Parking.camionPlaces;
        } else return this.nbrePlaceRestante;
    }

}
