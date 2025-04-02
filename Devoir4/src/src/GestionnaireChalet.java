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

 * La classe GestionnaiereChalet est la  classe ou se produit la gestion du chalet.

  elle contient :
  -Un constructeur: GestionnaireChalet()
  -des variables:
     private Employe employe[];
	     private  Chalet chalet[];
	      private int nombreChalet;//nombre actuel de chalet
	       private int nombreEmploye;// nombre actuel d'employe
  - des Constante
	     private final int nbmaxchalet = 200;//nombre max de chalets
	       private final int nbmaxemploye = 80;//nombre max d'employee
	         private final String PASSWORD = "chaletsProprio21";

 et  plusieurs méthodes qui font appel au methode declarer dans la classe Employe :

	- la méthode cherchChalet
	permettant de faire la recherche d'un chalet grace a son numero

	- la méthode cherchEmploye
	permettant de faire la recherche d'un Employe grace a son identifiant

   - la méthode associerChalet
    qui permet d'associer un chalet a un employe

	 - la méthode dissocierChalet
      qui permet dissocier un chalet a un employe

	-la méthode authEmploye
       qui   d authentifier  un employe  a l'aide de son identifiant

    -la méthode authproprietaire
       qui   d authentifier  le proprietaire  a l'aide du mot de passe 

    -la méthode ajoutChalet
       qui permet d'un ajout un nouveau chalet

     -la méthode ajoutEmploye
       qui permet d'un ajout un nouveau employe

       -la méthode supprimerChalet
       qui supprime un chalet

       -la méthode supprimerEmploye
       qui supprime  un employe

     -la méthode VoirchaletEmploye
       qui permet de voir les chalet qui sont entretenue par les employes

     -la méthode location
       qui met en location un chalet

      -la méthode liberer
       qui libere un chalet de la location

      -la méthode modifierSalaire
       qui modifie le salaire d'un employe

      -la méthode voirdisponibilite
       qui affiche les disponibilite d'un employe

       -la méthode modifierdiponibilite
       qui modifie la disponibilite d'un employe

       -la méthode voirSalaire
       qui retourne le salaire d'un employe

       -la méthode comparersalaireEmployes
 *     qui compare  de deux employe a l'aide de leurs salaire en appelant la methode compareTo
 *     
 *  -la méthode affichechalet
 *   qui retourne la liste de chalet
 * 
      -la méthode afficheEmploye
 *   qui retourne la liste d'employe
 */
package src;

public class GestionnaireChalet {

private Employe employe[];
private  Chalet chalet[];
private int nombreChalet;//nombre actuel de chalet
private int nombreEmploye;// nombre actuel d'employe
private final int nbmaxchalet = 200;//nombre max de chalets
private final int nbmaxemploye = 80;//nombre max d'employee
private final String PASSWORD = "chaletsProprio21";

public GestionnaireChalet() {
	this.chalet = new Chalet[nbmaxchalet];
	this.employe = new Employe[nbmaxemploye];
	this.nombreChalet = 0;
	this.nombreEmploye= 0;
}

public Chalet[] getchalet() {
	return chalet;
}

public Employe[] getemploye() {
	return employe;
}

public int getnombreChalet() {
	return nombreChalet;
}

public int getnombreEmploye() {
	return nombreEmploye;
}




/**
 * returne le numero du chalets s'il existe, sinon -1 sera retournee
 * @param id
 * @return
 */
public int cherchChalet(int numero) {
	for(int i=0; i<nombreChalet; i++) {
		if(chalet[i].getNumero() == numero) {
			//returne l'index du chalet
			return i;
		}
	}
	return -1;
}
public int cherchEmploye(String matricule) {
	for(int i=0; i<nombreEmploye; i++) {
		if(employe[i].getIdEmploye().equals(matricule)) {
			//returne l'index du chalet
			return i;
		}
	}
	return -1;
}

public boolean authEmploye(String  matricule) {

	int index =  cherchEmploye(matricule);
	if(index >= 0) return true;
	else return false;
}
public boolean authProprietaire(String password) {
	return PASSWORD.equals(password);
}

public void ajoutChalet(Chalet chaletx) {
	// verifier si le nombre de chalets ne depasse pas nbmaxchalet
	if(nombreChalet<nbmaxchalet) {
		int index = cherchChalet(chaletx.getNumero());
		if(index < 0) {
			chalet[nombreChalet] = chaletx;
			nombreChalet++;
			System.out.println(" Le Chalet  a été ajouter ");
		}else {
			System.out.println("Ce  chalet existe deja");
		}

	}else {
		System.out.println("Nombre maximun  de chalets atteint");
	}
}

public void ajoutEmploye(Employe emp) {
	// verifier si le nombre d'employe ne depasse pas nbmaxemployeE
	if(nombreEmploye<nbmaxemploye) {
		int index = cherchEmploye(emp.getIdEmploye());
		if(index < 0) {
			employe[nombreEmploye] = emp;
			nombreEmploye++;
			System.out.println("L employe a été ajouter");
		}else {
			System.out.println("Cet employe existe deja");
		}

	}else {
		System.out.println("Nombre maximun  d'employe atteint");
	}
}

/**
 * Supprimer un chalet
 * @param id
 */
public void supprimerChalet(int id) {
	if(nombreChalet>0) {
		int index = cherchChalet(id);
		//on verifie si le Chalet existe
		if(index>=0) {
			for(int i=index; i<nombreChalet; i++) {
				chalet[i] = chalet[i+1];
			}
			nombreChalet--;
			System.out.println("chalet de l'id "+id+" supprime avec succes");

		}else {
			System.out.println("id "+id+" non retrouvee");
		}
	}else {
		System.out.println("Pas de chalets dans la liste");
	}

}
/**
 * Supprimer un employe
 * @param id
 */
public void supprimerEmploye(String matricul) {
	if(nombreEmploye > 0) {
		int index = cherchEmploye(matricul);
		//on verifie si l'employe existe
		if(index>=0) {
			for(int i=index; i<nombreEmploye; i++) {
				employe[i] = employe[i+1];
			}
			nombreEmploye--;
			System.out.println("Employe d identifiant  "+matricul+" supprime avec succes");
		}else {
			System.out.println("id "+matricul+" non retrouvee");
		}
	}else {
		System.out.println("Pas d'employe dans la liste");
	}

}
/**
 * Voir les chalets associe a un employe
 * @param matricule
 */
public void voirChaletEmploye(String matricule) {
	int index = cherchEmploye(matricule);
	if(index >= 0) {
		if(employe[index].getNbChalet() > 0) {
			Employe employes = employe[index];
			for (int i = 0; i < employes.getNbChalet(); i++) {
				int idChalet = employes.getIdChalets()[i];
				for (int j = 0; j < nombreChalet; j++) {
					if(chalet[j].getNumero() == idChalet) {
						System.out.println(chalet[j].ToString());
					}
				}
			}
		}else {
			System.out.println("Cet employer n'a pas de chalets a entretenir");
		}
	}else {
		System.out.println("cet employer n'exist pas");
	}
}

/**
 * Associer un C	halet a un employe
 * @param idChalet
 * @param matricule
 */
public void associerChaletAEmployer(int idChalet, String matricule) {
	int indexChalet = cherchChalet(idChalet);
	int indexEmploye = cherchEmploye(matricule);

	if(indexChalet >= 0) {
		if(chalet[indexChalet].isEntretien() == false) {
			// le cas ou le chalet n'est pas entretenu
			//on verifie si l'employe existe dans la liste des employes
			if(indexEmploye >= 0) {
				employe[indexEmploye].associerChalet(idChalet);
				chalet[indexChalet].setEntretien(true);
			}else {
				System.out.println("L'employe d identifiant  "+matricule+" n'exist pas");
			}
		}else {
			System.out.println("Le chalet de numero  "+idChalet+" est deja associe a un employe");
		}
	}else {
		System.out.println("Ce chalet de numero "+idChalet+" n'existe pas");
	}	
}

/**
 * dissocier un chalet a un employe
 * @param idChalet
 * @param matricule
 */
public void dissocierChaletAEmployer(int idChalet, String matricule) {
	int indexChalet = cherchChalet(idChalet);
	int indexEmploye = cherchEmploye(matricule);

	if(indexChalet >= 0) {
		if(chalet[indexChalet].isEntretien() == true) {
			// le cas ou le chalet est entretenu
			//on verifie si l'employe existe dans la liste des employes
			if(indexEmploye >= 0) {
				employe[indexEmploye].dissocierChalet(idChalet);
				chalet[indexChalet].setEntretien(false);
			}else {
				System.out.println("L'employe de matricule "+matricule+" n'exist pas");
			}
		}else {
			System.out.println("Le chalet de id "+idChalet+" est n'est pas associe a un employe");
		}
	}else {
		System.out.println("Cet chalet de id "+idChalet+" n'existe pas");
	}

}
/**
 * Louer un chalet
 * @param idChalet
 */
public void locationr(int id) {
	int indexChalet = cherchChalet(id);
	if(indexChalet >= 0) {
		chalet[indexChalet].setLocation(true);
		System.out.println("Chalet louer avec succes");
	}else {
		System.out.println("Cet chalet de id "+id+" n'existe pas");
	}
}


/**
 * Liberer un chalet
 * @param idChalet
 */
public void liberer(int idChalet) {
	int indexChalet = cherchChalet(idChalet);
	if(indexChalet >= 0) {
		chalet[indexChalet].setLocation(false);
		System.out.println("Chalet liberer avec succes");
	}else {
		System.out.println("Cet chalet de id "+idChalet+" n'existe pas");
	}
}

/**
 * modifier le salaire d'un employe
 * @param matricule
 * @param salaire
 */
public void modifierSalaire(String matricule, double salaire) {
	int index = cherchEmploye(matricule);
	if(index >= 0) {
		employe[index].setSalaire(salaire);
		System.out.println("Le salaire de l'employe vient d etre  modifié ");
	}else {
		System.out.println("cet employer n'exist pas");
	}
}

/**
 * 
 * @param matricule
 */
public void voirDisponibilites(String matricule) {
	int index = cherchEmploye(matricule);
	if(index >= 0) {
		System.out.println("Disponibilites:");
		employe[index].getDisponibles();
		int taille = employe[index].getDisponibles().length;
		for(int i = 0; i<taille; i++ ) {
			Disponibilite disponibilite = employe[index].getDisponibles()[i];
			String etat = disponibilite.isDisponible()?"disponible":"non disponible";
			System.out.println("Jour:"+disponibilite.getJour()+"\t-\t"+etat);
		}
	}else {
		System.out.println("cet employer n'exist pas");
	}
}
public void modifierDisponibilite(String matricule, Jours jour, boolean dispo) {
	int index = cherchEmploye(matricule);
	if(index >= 0) {
		employe[index].setDispParJour(jour, dispo);
	}else {
		System.out.println("cet employer n'exist pas");
	}
}

/**
 * Voir le salaire d'un employe
 * @param matricule
 */
public void voirSalaire(String matricule) {
	int index = cherchEmploye(matricule);
	if(index >= 0) {
		System.out.println("Salaire: "+employe[index].getSalaire());
	}else {
		System.out.println("cet employer n'exist pas");
	}
}
public void comparerSalaireEmployes(String matricule1, String matricule2) {
	int index1 = cherchEmploye(matricule1);
	int index2 = cherchEmploye(matricule2);
	if(index1 >= 0) {
		if(index2 >= 0) {
			int resultat = employe[index1].compareTo(employe[index2]);
			if(resultat == 1)System.out.println("Le salaire de l'employee "+matricule1+" est le plus eleve");
			if(resultat == 2)System.out.println("Le salaire de l'employee "+matricule2+" est le plus eleve");
			if(resultat == 0)System.out.println("Ils ont le meme salaire");
		}else {
			System.out.println("cet employer d identifiant  "+matricule2+" n'exist pas");
		}
	}else {
		System.out.println("cet employer d identifiant "+matricule1+" n'exist pas");
	}
}

public void afficheChalets() {
	if(chalet[0] != null) {
		for (int i = 0; i < nombreChalet; i++) {
			System.out.println(chalet[i].ToString());
		}
	}else {
		System.out.println("La liste est vide");
	}

}
//afficher tous les employes de la liste
public void afficheEmploye() {
	if(employe[0] != null) {
		for (int i = 0; i < nombreEmploye; i++) {
			System.out.println(employe[i].ToStringE());
		}
	}else {
		System.out.println("La liste est vide");
	}

}


} 







