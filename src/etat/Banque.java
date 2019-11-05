package etat;

import java.util.Vector;

class Banque {
    private EtatBanque et;
    private String nom;
    private Vector<Agence> mesAgences;

    public Banque() {
        et = new EtatNonValide(this);
        mesAgences = new Vector<Agence>();
        nom = null;
    }

    public void validate() {
        et.validate();
    }

    public void addAgence() {
        et.addAgence();
    }

    public void addAgence(Agence a) {
        mesAgences.add(a);
    }
    public void delAgence(Agence a) {
        mesAgences.remove(a);
    }

    public void delAgence() {
        et.delAgence();
    }

    public void delete() {
        et.delete();
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String toString() {
        return et.getClass().getName();
    }

    public void setEtat(EtatBanque et) {
        this.et = et;
    }

    public Agence getAgence(int i) {
        return mesAgences.get(i);
    }
    
    public String getNom() {
    	return this.nom;
    }
    
    public int getNbAgence() {
    	return this.mesAgences.size();
    }
}

