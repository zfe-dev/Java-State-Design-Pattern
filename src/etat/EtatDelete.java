package etat;

class EtatDelete extends EtatBanque {

    private final Banque b;

    EtatDelete(Banque b) {
        this.b = b;
        System.out.println("banque supprimée");
    }
}		

	