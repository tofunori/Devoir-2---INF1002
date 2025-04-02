/*                    
 *            ##Description##

 * La classe Disponiblite est une classe  qui permet de gerer la disponibilite d'un 
 * employe. 
 *   Elle  contient :
 * -Constructeur
 * -Deux variables(jours de type de l'enum Jours et l'autre de type boolean
 *  - Un Getter(isDisponible)
 *  -Un Setter(setDisponible)
	-  une méthode tostring pour l'affichage
	
 *  

 */
package src;

public class Disponibilite {

	private Jours jour;
	private boolean disponible;

	public Disponibilite(Jours jour, boolean dispo) {
		// TODO Auto-generated constructor stub
		this.jour = jour;
		this.disponible = dispo;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public Jours getJour() {
		return jour;
	}
	@Override
	public String toString() {
		return "Disponibilite [jour=" + jour + ", disponible=" + disponible + "]";
	}



}
