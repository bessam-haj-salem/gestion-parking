import java.util.Scanner;

public class GestionParking {
    Parking p = new Parking();
    Scanner in = new Scanner(System.in);

    public GestionParking() {
        bienvenueMessage();
        getTypeVehicule();
        getTableauVehicules();
        getChoixQuitter();
    }

    public void getTypeVehicule() {
        System.out.println("Entre le type de votre véhicule:\n1) Voiture standard\n2) Une berline\n3) Un Camion ");
        int typeVehicule = in.nextInt();
        if (typeVehicule == 1) {
            p.setNbreVoiture(1);
        } else if (typeVehicule == 2) {
           p.setNbreBerline(1);
        } else {
            p.setNbreCamion(1);
        }
    }

    public void bienvenueMessage() {
        System.out.println("Bienvenue dans votre Parking\n Il existe " + p.getNbreDePlaceParkingAlloue() + " places restante");
    }

    private void getChoixQuitter() {
        System.out.println("Voulez vous quittez?\n1) Quitter\n2) Entrez un autre véhicule");
        int choix = in.nextInt();
        if (choix == 1) {
            System.out.println("Bonne journée et ne revenez plus!!");
        } else if (choix == 2) {
            if (p.getNbreDePlaceParkingAlloue() <= 0) {
                System.out.println("Le parking est plein désolé!!");
                return;
            }
            getTypeVehicule();
            getTableauVehicules();
            getChoixQuitter();
        } else {
            System.out.println("Veuillez choisir un des choix spécifié!");
        }
    }

    private void getTableauVehicules() {
        System.out.println("----------------------------------------------------------\nNombre voitures | Nombre berlines " +
                "| Nombre Camions | Place Restantes \n---------------- ----------------- ---------------- ---------------\n" + "       " + p.getNbreVoiture() +
                "        |         " + p.getNbreBerline() + "       |       " + p.getNbreCamion() + "        |       " + p.getNbreDePlaceParkingAlloue()
                + "\n------------------------------------------------------------------");
    }

}
