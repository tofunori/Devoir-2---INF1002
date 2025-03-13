package src;

public class Moto {
	private String marque;
	private String modele;
	private int annee;
	private String couleur;
	private int kilometrage;
	
	public Moto(String marque, String modele, int annee, String couleur, int kilometrage) {
		marque = marque;
		modele = modele;
		annee = annee;
		couleur = couleur;
		kilometrage = kilometrage;
	}
	
	public void augmenterKilometrage(int kiloInitial) {
		if (kiloInitial>0) {
			kilometrage += kiloInitial;
		}else {
			System.out.println("");
		}
	}

	//getters
	
	public String getMarque() {
		return marque;
	}
	
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee=annee;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur=couleur;
	}
	public int getKilometrage() {
		return kilometrage;
	}
	public void setKilometrage(int kilometrage) {
		this.kilometrage=kilometrage;
	}
	
	public String toString() {
	       return "Marque" + marque + "\nModele: " + modele + 
	              "\nAnnee: " + annee + 
	              "\nKilometrage: " + kilometrage + "\n";
	       }
}
