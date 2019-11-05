package etat;

class EtatNonValide extends EtatBanque {
	
	private final Banque b;

    EtatNonValide(Banque b) {
        this.b = b;
    }
		
	public void validate () {
		System.out.println("Non Valide - La banque n'est pas valide");
		if (b.getNom() != null) {
			b.setEtat(new EtatValide(b));
		}
	};
}	