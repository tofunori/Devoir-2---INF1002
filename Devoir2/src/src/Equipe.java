package src;

public class Equipe {
	private String nom;
	private int nbdepartiesgagnees;
	private int listedejoueurs;
	private Categories categorie; 
	
	public Equipe(String nom, int nbdepartiesgagnees, int listedejoueurs, Categories categorie) {
		nom=nom;
		nbdepartiesgagnees=nbdepartiesgagnees;
		listedejoueurs=listedejoueurs;
		categorie=categorie;
		
	}
	public String getNom() {
		return nom;
		
	}
	
	public void setNom(String nom) {
		nom =  nom;
	}
	public int getNbdepartiesgagnees() {
		return nbdepartiesgagnees;
	}
	
	public void setNbdepartiesgagnees(int nbdepartiesgagnees) {
		nbdepartiesgagnees=nbdepartiesgagnees;
	}
	public int getListedejoueurs() {
		return listedejoueurs;
	}
	
	public void setListedejoueurs(int listedejoueurs) {
		listedejoueurs=listedejoueurs;
	}
	public Categories getCategorie() {
		return categorie;
	}
	
	public void setCategorie(Categories categorie) {
		categorie=categorie;
	}
	
	public void ajoutPartiesGagnees() {
		
	}

}
