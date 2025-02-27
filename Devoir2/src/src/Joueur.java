package src;

public class Joueur {
	private String nom;
	private String prenom;
	private int age;
	
	public Joueur(String nom, String prenom, int age ) {
		nom = nom;
		prenom = prenom;
		age= age;
	}
	public String toString() {
		return(prenom+""+nom+""+age);
	}		
}
