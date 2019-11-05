package etat;

class EtatADesAgences extends EtatBanque {
	private Banque b;
	
	EtatADesAgences(Banque b) {
		this.b = b;
	}

	public void addAgence() {
		b.addAgence(new Agence());
	}
	
	public void delAgence() {
		if (b.getNbAgence() == 0) {
			System.out.println("On a déjà plus d'agences");
			b.setEtat(new EtatValide(b));
		}
		else {
			b.delAgence(b.getAgence(0));
			System.out.println("On supprime une agence");
		}
		
	}
}
