/*La classe moto est celle contenant les variables d'instance d'une moto
 *  constructeur motos 
 * ainsi que les methodes nous permettant de realiser des operations telles que
 * - les accesseurs ( getkilometrage)
 * - une methode ajoutkilometrage pour ajouter le nombre de kilometrage d'une moto
 * - et une methode ToString pour l'affichage d'une ou des  moto(s) console.
 *
 * 
 *
 */
package src;

public class Moto {
	private String marque;
	private String modele;
	private int annee;
	private String couleur;
	private double kilometrage;
	
	public Moto(String marque, String modele, int annee, String couleur, double kilometrage) {
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
