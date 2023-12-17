import java.util.Scanner;

public class GestionParking {
    private int nombrePlaces;
    Voiture v = new Voiture();
    Berline b = new Berline();
    Camion c = new Camion();
    Parking p = new Parking();


    public GestionParking() {
        bienvenueMessage();
        getTypeVehicule();
        getTableauVehicules();
        getChoixQuitter();
    }

    public int getNombrePlaces() {
        return p.getPlaceRestante();
    }

    public void getTypeVehicule() {
        System.out.println("Entre le type de votre véhicule:\n1) Voiture standard\n2) Une berline\n3) Un Camion ");
        Scanner in = new Scanner(System.in);
        int typeVehicule = in.nextInt();
        if (typeVehicule == v.getTypeVehicule()) {
            v.setNbreVehicule(1);
            v.getChoixVehicule();
            p.setPlaceRestante(v.getNbreDePlaceParkingAlloue());
        } else if (typeVehicule == b.getTypeVehicule()) {
            b.setNbreVehicule(1);
            b.getChoixVehicule();
            p.setPlaceRestante(b.getNbreDePlaceParkingAlloue());

        } else {
            c.setNbreVehicule(1);
            c.getChoixVehicule();
            p.setPlaceRestante(c.getNbreDePlaceParkingAlloue());

        }
    }

    public void bienvenueMessage() {
        System.out.println("Bienvenue dans votre Parking\n Il existe " + p.getPlaceRestante() + " places restante");
    }

    private void getChoixQuitter() {
        System.out.println("Voulez vous quittez?\n1) Quitter\n2) Entrez un autre véhicule");
        Scanner in = new Scanner(System.in);
        int choix = in.nextInt();
        if (choix == 1) {
            System.out.println("Bonne journée et ne revenez plus!!");
        } else if (choix == 2) {
            getTypeVehicule();
            getTableauVehicules();
            getChoixQuitter();
        } else {
            System.out.println("Veuillez choisir un des choix spécifié!");
        }

    }


    private void getTableauVehicules() {
        System.out.println("----------------------------------------------------------\nNombre voitures | Nombre berlines " +
                "| Nombre Camions | Place Restantes \n---------------- ----------------- ---------------- ---------------\n" + "       " + v.getNbreVehicule() +
                "        |         " + b.getNbreVehicule() + "       |       " + c.getNbreVehicule() + "        |       " + p.getPlaceRestante()
                + "\n------------------------------------------------------------------");
    }

}
