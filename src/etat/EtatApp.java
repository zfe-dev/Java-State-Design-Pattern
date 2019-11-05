
package etat;

class EtatApp {
	public static void main(String [] args) {
		Banque b = new Banque();
		b.setNom("cnc");
		b.validate();
		b.addAgence();
		b.addAgence();
		b.delAgence();
		b.delAgence();
		b.delAgence();
		b.delete();
	}
}