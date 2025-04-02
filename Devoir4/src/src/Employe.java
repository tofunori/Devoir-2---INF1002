/*                            Devoir nÂ° 2
                           INF 1002 (java)
 *                       Session dâ€™automne 2022
 *         
 *                       travail fait par :
 *                       
             ---Fouodji Bokou, Teddy Pollar Teddy.Pollar.Fouodji.Bokou@uqtr.ca

             ---Faye, Youssouf Youssouf.Faye@uqtr.ca

             ---Fosnea, Vadim Vadim.Fosnea@uqtr.ca

 *            ---Ewetola, Firaas Esso-Ninam Firaas.Esso-Ninam.Ewetola@uqtr.ca
 *            
 *            ##Description##

 * La classe Employe est une classe  qui contient tous les informations d'un employe
 * (son nom,prenom,ville,salaire,son identifiant lui permettant d'acceder a la session employe,
 * sa disponibilite.
 * 
 *  elle contient aussi plusieurs méthodes:
	- la méthode researchChalet 
	permettant de faire la recherche d'un chalet grace a son numero
	
 *  - la méthode associerChalet
 * qui permet d'associer un chalet a un employe

	 - la méthode dissocierChalet
 * qui permet dissocier un chalet a un employe
	

	-la méthode compareTo
 * qui compare  de deux employe a l'aide de leurs salaire

 *  -la méthode disp
 * qui permet le parcoure et l'affichage de la disponibilte d'un employe 


 */

package src;

import java.util.Arrays;

public class Employe {
	private static int nombreEmploye = 0;
	private String nomEmploye;
	private String prenomEmploye;
	private String ville;
	private double salaire;
	private String idEmploye;
	private Disponibilite disponibles[];
	private int idChalets[];
	private int nbChalet;//nombre actuel des IDs chalets
	private final int MAXIDCHALET = 4;// nombre max de chalets pour un employe
	private final int MAXDISPO= 7;// nombre max de disponibilite par semaine pour un employe
	
   
	//Constructeur
	public Employe(String idEmploye ,String nomEmploye,String prenomEmploye,String ville,double salaire) {
		this.nbChalet=0;
		this.idEmploye=""+Employe.nombreEmploye;
		this.nomEmploye= nomEmploye;
		this.prenomEmploye=prenomEmploye;
		this.ville=ville;
		this.idEmploye=idEmploye;
		this.salaire=salaire;
		Employe.nombreEmploye++;
		this.idChalets=new int[MAXIDCHALET];
		this.disponibles = new Disponibilite[MAXDISPO];
		
		disp(this.disponibles);
	
	}
	private void disp(Disponibilite[] list) {
		int i=0;
		for(Jours jour:Jours.values()) {
		Disponibilite dispon = new Disponibilite( jour,false);
		list[i] = dispon;
		 i++;	
		}
	}

	
	//Getters
	public static int getnomberEmploye() {
		return nombreEmploye;
	}
	public int getNbChalet() {
		return nbChalet;
	}
	public double getSalaire() {
		return salaire;
	}
	public String getIdEmploye() {
		return idEmploye;
	}
	 public Disponibilite[] getDisponibles() {
			return disponibles;
		}
	public int[] getIdChalets() {
		return idChalets;
	}
	
	
	
	//Setters	
public void setSalaire(double salaire) {
		
		this.salaire = salaire;	
	}
	
	public void setDispParJour(Jours jour, boolean dispo) {
		int i = 0;
		for(Jours j:Jours.values()) {
			if(j==jour) {
				this.disponibles[i] = new Disponibilite(jour, dispo);
			}
			i++;
		}
	}
	
	/**
	 * returne l'index du chalets s'il existe, sinon -1 sera retournee
	 * @param id
	 * @return
	 */
	public int researchChalet(int id) {
		for(int i=0; i<nbChalet; i++) {
			if(idChalets[i] == id) {
				//returne l'index du chalet
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Associer un chalet a un employer
	 * @param id
	 */
	public boolean associerChalet(int id) {
		// verifier si le nombre de chalets ne depasse pas 4
		if(nbChalet<MAXIDCHALET) {
			int index = researchChalet(id);
			if(index >= 0) {
				System.out.println("id "+id+"deja existant");
				return false;
			}else {
				
				this.idChalets[nbChalet] = id;
				this.nbChalet++;
				
				System.out.println("Associaton de chalet  avec succes");
				return true;	
			}
				
		}else {
			System.out.println("Nombre maximun de chalet atteint ");
			return false;
		}
	}
	public boolean dissocierChalet(int id) {
		// verifier si la liste des chalets n'est pas vide
		if(nbChalet > 0) {
			int index = researchChalet(id);
			if(index>=0) {
				for(int i=index; i<nbChalet; i++) {
					idChalets[i] = idChalets[i+1];
				}
				nbChalet--;
				
				System.out.println("Dissociaton de chalet  avec succes");
				return true;	
				
			}else {
				System.out.println("id "+id+" non existant");
				return false;
			}
				
		}else {
			System.out.println("List vide");
			return false;
		}
	}
	
	
	/**
	 * returne 2 si le salaire de l'employer entre en parametre est le plus eleve, 
	 * 1 si c'est le contraire,
	 * 0 s'ils ont le meme salaire.
	 */
	public int compareTo(Employe employe) {
		String result;
		if(this.salaire>employe.salaire) {
			result = "Le salaire de l'employee "+this.idEmploye+" est le plus eleve";
			return 1;
		}else if(this.salaire<employe.salaire) {
			result = "Le salaire de l'employee "+employe.idEmploye+" est le plus eleve";
			return 2;
		}else {
			result = "Ils ont le meme salaire";
			return 0;
		}
		
	}
	// methode ToString;
	public String ToStringE() {
		return "Employe [Id=" +idEmploye+ ", nom=" + nomEmploye + ", prenom=" + prenomEmploye + ", salaire=" + salaire
				+ ", ville=" + ville + ",\n disponibles=" + Arrays.toString(disponibles) + ",\n chalets="
				+ Arrays.toString(idChalets) + ",\n nbChalet=" + nbChalet + "]";
	}
 
	

}

