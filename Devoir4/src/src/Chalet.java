/            
 *            ##Description##

 * La classe Chalet est une classe  qui contient tous les informations d'un Chalet
 * (son nom,adresse,ville,nombre de chambre,son numero lui permettant d'etre associer,dissocier d'un employe,
 * de le mettre en location ou le liberer.
 * 
 *  elle contient:
	-Un constructeur 
	- Des Getters(islocation,isentretien,getNumero)
 *  - Des Setters(setlocation,setentretien)
 * 	- et d'une  méthode ToString
 * qui permet dissocier un chalet a un employe
 */
package src;

public class Chalet {
	private static int nombreChalets = 0;
	private int numero;
	private String nomChalet;
	private String villeChalet;
	private String adresseChalet;
	private int nbresChambre;
	private boolean location;
	private boolean entretien;



	public Chalet(String nomChalet, String villeChalet, String adresseChalet,int nbresCham) {
		this.numero=++Chalet.nombreChalets;
		this.nomChalet= nomChalet;
		this.villeChalet=villeChalet;
		this.adresseChalet=adresseChalet;
		this.nbresChambre=nbresCham;
		this.location=false;
		this.entretien=false;
	}


	public boolean isLocation() {
		return location;
	}
	public boolean isEntretien() {
		return entretien;
	}

	public int getNumero() {
		return numero;
	}
	public boolean setLocation(boolean location) {
		this.location = location;
		return location;
	}


	public void setEntretien(boolean entretien) {
		this.entretien = entretien;
	}

	public String ToString() {

		String result= "Chalet [  numero "+numero+" nom  "+nomChalet+" ville : "+villeChalet+",adresse: "+adresseChalet+" ,nbrchambre:"+nbresChambre+", location: "
				+location+" ,Entretien:"+entretien+"]";
		return result ;
	}





}
