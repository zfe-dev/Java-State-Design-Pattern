package etat;

class EtatValide extends EtatBanque {
		
	private final Banque b;

    EtatValide(Banque b) {
        this.b = b;
    }
		
	public void validate () {
		System.out.println("Valide - La banque valide");
	};
    public void addAgence() {
    	b.addAgence(new Agence());
    	System.out.println("Valide - La banque rajoute une agence");
    	b.setEtat(new EtatADesAgences(b));
    };
    public void delete() {
    	System.out.println("Valide - La banque ferme");
    	b.setEtat(new EtatDelete(b));
    };



}
