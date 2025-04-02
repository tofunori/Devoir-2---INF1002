/*   ##Description##

 * La classe ApplicationGestionnaiereChalet est la  classe ou  la gestion du chalet et des employes se passent .

  elle contient :
  -une methode pilote

 et  plusieurs méthodes( en static pour la plus part) qui font appel au methode declarer
  dans la classe Employe,chalet et GestionnaireChalet :

	- la méthode menuPrincipale()
	affiche le menu principale
	
- la méthode menuemploye23()
	affiche le menu employe
	
	- la méthode menuemployeur90()
	affiche le menu du proprietaire
	
	- la méthode menuGerercgalet()
	affiche le menu  de gestion de chalet(ajout suppression)
	
	- la méthode menuGereremploye()
	affiche le menu  de gestion d'un employe(ajout suppression)
	
	- la méthode menulocation()
	affiche le menu  de gestion de chalet(location liberation)
	
	- la méthode menuassocier()
	affiche le menu menu de gestion de chalet(associer dissocier)
	
	- la méthode actionEmploye()
	regroupe tous les actions que faire un employe
	
	 -la méthode modifierdiponibilite
       qui modifie la disponibilite d'un employe

	
    
 */


package src;

import java.util.Scanner;





public class ApplicationGestionnaireCalet {

	static Scanner scan = new Scanner(System.in);
	static GestionnaireChalet appChalet = new GestionnaireChalet();
	//menu principale
	public static void menuPrincipale() {
		System.out.println("\t\t\t=====MENU PRINCIPALE======");

		System.out.println("\n 1: Session Employee");

		System.out.println("\n 2: Session Employeur");

		System.out.println("\n 3: Quitter");
	}
	//menu employe
	public static  void menuEmploye23() {

		System.out.println("*************GESTION EMPLOYE*************");
		System.out.println("1-Voir mes disponibilités");
		System.out.println("2-Modifier ma disponibilité pour une journée");
		System.out.println("3-Consulter mes chalets");
		System.out.println("4-Voir mon salaire ");
		System.out.println("5-Revenir au menu principal");

		System.out.print("Entrer votre choix:");
	}
	//menu proprietaire
	public static void menueEmployeur90() {
		System.out.println("*************ADMINISTRATION*************");
		System.out.println("1-Afficher la liste des employés avec leurs caractéristiques");
		System.out.println("2-Afficher la liste des chalets avec leurs caractéristiques");
		System.out.println("3-Afficher le nombre d’employés");
		System.out.println("4-Afficher le nombre de chalets");
		System.out.println("5-Gérer les employés");
		System.out.println("6-Gérer les chalets");
		System.out.println("7-Modifier le salaire d’un employé");
		System.out.println("8-Comparer deux employés selon leur salaire");
		System.out.println("9-Afficher les disponibilités d’un employé ");
		System.out.println("10-Afficher les chalets associés à un employé");
		System.out.println("11-Gérer les chalets associés aux employés");
		System.out.println("12-Louer ou liberer un chalet");
		System.out.println("13-Revenir au menu principal");
		System.out.print("Entrer votre choix:");
	}
	//sous menu gestionchalet
	public  static void menuGererChalet() {

		System.out.println("*************GESTION CHALET*************");
		System.out.println("1-Ajouter un chalet");
		System.out.println("2-Supprimer un chalet");
		System.out.println("3-Revenir au menu principal");

		System.out.print("Entrer votre choix:");
	}
	//sous gestionEmploye
	public static void menuGererEmploye() {

		System.out.println("*************GESTION EMPLOYE*************");
		System.out.println("1-Ajouter un employe");
		System.out.println("2-Supprimer un employe");
		System.out.println("3-Revenir au menu principal");

		System.out.print("Entrer votre choix:");
	}
	//sous menu de location
	public  static void menuLocationChalet() {
		System.out.println("*******SOUS MENUE LOCATION***********");
		System.out.println("1-Louer le chalet");
		System.out.println("2-Liberer le chalet");
		System.out.println("3-Revenir au menu principal");

		System.out.print("Entrer votre choix:");
	}
	//sous menu association
	public static void menuAssocierChalet() {
		System.out.print("*******SOUS MENUE ASSOCIATION***********");
		System.out.println("1-Associer un chalet");
		System.out.println("2-Dissocier un chalet");
		System.out.println("3-Revenir au menu principal");

		System.out.print("Entrer votre choix:");
	}
	public static void continuer(Scanner clavier) {
		System.out.println("\n\n");
	}
	public static void actionEmploye() {
		System.out.print("Entrer votre matricule:");
		String matricule = scan.next();
		if(appChalet.authEmploye(matricule)) {
			do {
				menuEmploye23();
				int choix = scan.nextInt();
				switch (choix) {
				case 1:{
					appChalet.voirDisponibilites(matricule);
					break;
				}
				case 2:{
					modifierDisponibilite(matricule);
					break;
				}
				case 3:{
					appChalet.voirChaletEmploye(matricule);
					continuer(scan);
					break;
				}
				case 4:{
					appChalet.voirSalaire(matricule);
					continuer(scan);
					break;
				}
				case 5:{
					continuer(scan);
					return;
				}
				default:{
					System.out.println("Choix invalid, choix possible[1-4]");
					continuer(scan);
					break;}
				}
			}while(true);
		}else {
			System.out.println(matricule);
			System.out.println("Matricule invalide!");
			continuer(scan);
			return;
		}

	}

	private static void modifierDisponibilite(String matricule) {
		boolean bonchoix = false, bonchoix2=false, disponible = false;
		Jours jour = null;
		do {
			System.out.println("entrer le numero du jour de la semaine (exp: 1 pour lundi et 7 pour dimanche):");
			int numJour = scan.nextInt();

			switch (numJour) {
			case 1:{
				jour = Jours.lundi;
				bonchoix = true;
				break;
			}
			case 2:{
				jour = Jours.mardi;
				bonchoix = true;
				break;
			}
			case 3:{
				jour = Jours.mercredi;
				bonchoix = true;
				break;
			}
			case 4:{
				jour = Jours.jeudi;
				bonchoix = true;
				break;
			}
			case 5:{
				jour = Jours.vendredi;
				bonchoix = true;
				break;
			}
			case 6:{
				jour = Jours.samedi;
				bonchoix = true;
				break;
			}
			case 7:{
				jour = Jours.dimanche;
				bonchoix = true;
				break;
			}
			default:
				System.out.println("numero invalid");
				break;
			}
		}while(bonchoix == false);

		do {
			System.out.print("Entrer 1 pour disponible et 0 pour non disponible:");
			int reponse = scan.nextInt();
			switch (reponse) {
			case 1:{
				disponible = true;
				bonchoix2 = true;
				break;
			}
			case 0:{
				disponible = false;
				bonchoix2 = true;
				break;
			}
			default:{
				System.out.println("Choix invalid, veuillez choisir 1 ou 0");
				continuer(scan);
				break;
			}
			}
		}while(bonchoix2 == false);
		// modifier la disponibilite apres avoir recuper toutes les infos
		appChalet.modifierDisponibilite(matricule, jour, disponible);

	}
	public static void actionProprietaire() {
		System.out.print("Entrer le mot de passe Admin:");
		String password = scan.next();
		if( appChalet.authProprietaire(password)) {
			do {
				menueEmployeur90();
				int choix = scan.nextInt();
				switch (choix) {
				case 1:{
					afficherListeEmploye();
					break;
				}
				case 2:{
					afficherListeChalets();
					break;
				}
				case 3:{
					System.out.println("Nombre d'employe: "+appChalet.getnombreEmploye());
					continuer(scan);
					break;
				}
				case 4:{
					System.out.println("Nombre de chalet: "+appChalet.getnombreChalet());
					continuer(scan);
					break;
				}
				case 5:{
					gererEmploye();
					break;
				}
				case 6:{
					gererChalet();
					break;
				}
				case 7:{
					modifierSalaire();
					break;
				}
				case 8:{
					comparerSalaireEmployer();
					break;
				}
				case 9:{
					voirDisponibiliteEmploye();
					break;
				}
				case 10:{
					voirChaletsEmploye();
					break;
				}
				case 11:{
					gererChaletAssocie();
					break;
				}
				case 12:{
					locationLiberation();
					break;
				}
				case 13:{
					continuer(scan);
					return;
				}
				default:
					System.out.println("Choix invalid, choix possible[1-4]");
					continuer(scan);
					break;
				}
			}while(true);
		}else {
			System.out.println("Matricule invalide!");
			continuer(scan);
			return;
		}
	}
	// methodes pour affichier la liste d employe
	private static void afficherListeEmploye() {
		appChalet.afficheEmploye();
		continuer(scan);
	}
	// methodes pour affichier la liste de chalet
	private static void afficherListeChalets() {
		appChalet.afficheChalets();
		continuer(scan);
	}
	private  static void voirChaletsEmploye() {
		System.out.print("Saisir le matricule de l'employe:");
		String matricule = scan.next();
		appChalet.voirChaletEmploye(matricule);	
	}
	public static void gererChalet() {
		do {
			menuGererChalet();
			int choix = scan.nextInt();
			switch (choix) {
			case 1:{
				ajoutChalet();
				break;
			}
			case 2:{
				supprimerChalet();
				break;
			}
			case 3:{
				continuer(scan);
				return;
			}


			default:
				System.out.println("Choix invalid, choix possible[1-2]");
				continuer(scan);
				break;
			}
		}while(true);
	}
	private static void supprimerChalet() {
		System.out.print("Saisir l'id du chalet:");
		int id = scan.nextInt();
		appChalet.supprimerChalet(id);
		continuer(scan);
	}
	/**
	 *  on recuper les infos du chalet, on cree le chalet ensuite on l'ajoute dans la liste
	 */
	public static  void ajoutChalet() {

		System.out.print("Saisir le nom du chalet:");
		String nom = scan.next();
		System.out.print("Saisir la ville du chalet:");
		String ville = scan.next();
		System.out.print("Saisir l'adresse du chalet:");
		String adresse = scan.next();
		System.out.print("Saisir le nombre de chambre:");
		int nbChambre = scan.nextInt();

		Chalet chalet = new Chalet(nom, ville, adresse, nbChambre);
		appChalet.ajoutChalet(chalet);
	}
	private static  void gererEmploye() {
		do {
			menuGererEmploye();
			int choix = scan.nextInt();
			switch (choix) {
			case 1:{
				ajoutEmploye();
				break;
			}
			case 2:{
				supprimerEmploye();
				break;
			}
			case 3:{
				continuer(scan);
				return;
			}


			default:
				System.out.println("Choix invalid, choix possible[1-2]");
				continuer(scan);
				break;
			}
		}while(true);

	}
	private static void supprimerEmploye() {
		System.out.print("Saisir le matricul de l'employe:");
		String matricul = scan.next();
		appChalet.supprimerEmploye(matricul);
		continuer(scan);
	}
	private static void ajoutEmploye() {
		System.out.print("Saisir le id de l'employe:");
		String id = scan.next();
		System.out.print("Saisir le nom de l'employe:");
		String nom = scan.next();
		System.out.print("Saisir le prenom de l'employe:");
		String prenom = scan.next();
		System.out.print("Saisir la ville de l'employe:");
		String ville = scan.next();
		System.out.print("Saisir le salaire de l'employe:");
		double salaire = scan.nextDouble();

		Employe employe = new Employe(id,nom, prenom,ville, salaire );
		appChalet.ajoutEmploye(employe);
	}

	private static void modifierSalaire() {
		System.out.print("Saisir le matricule de l'employe:");
		String matricule = scan.next();

		System.out.print("Saisir le nouveau salaire de l'employe:");
		double salaire = scan.nextDouble();
		appChalet.modifierSalaire(matricule, salaire);
		continuer(scan);
	}

	private static  void comparerSalaireEmployer() {
		System.out.println("Saisir le matricule du 1er employe");
		String matricule1 = scan.next();

		System.out.println("Saisir le matricule du 2em employe");
		String matricule2 = scan.next();

		appChalet.comparerSalaireEmployes(matricule1, matricule2);

	}

	private  static void voirDisponibiliteEmploye() {
		System.out.print("Saisir le matricule de l'employe:");
		String matricule = scan.next();

		appChalet.voirDisponibilites(matricule);

	}
	public  static void gererChaletAssocie() {
		do {
			menuAssocierChalet();
			int choix = scan.nextInt();
			switch (choix) {
			case 1:{
				associerChalet();
				break;
			}
			case 2:{
				dissocierChalet();
				break;
			}
			case 3:{
				continuer(scan);
				return;
			}
			default:{
				System.out.println("Choix invalid, choix possible[1-3]");
				continuer(scan);
				break;
			}
			}
		}while(true);

	}
	private static void dissocierChalet() {
		System.out.print("donner l'id du chalet:");
		int idChalet = scan.nextInt();

		System.out.print("donner le matricule de l'employer:");
		String matricule = scan.next();

		appChalet.dissocierChaletAEmployer(idChalet, matricule);

	}
	private  static void associerChalet() {
		System.out.print("donner l'id du chalet:");
		int idChalet = scan.nextInt();

		System.out.print("donner le matricule de l'employer:");
		String matricule = scan.next();

		appChalet.associerChaletAEmployer(idChalet, matricule);
	}
	/**
	 * Mettre un chalet en location ou libre
	 */
	private static  void locationChalet() {
		System.out.println("Saisir l'id du chalet");
		int id = scan.nextInt();

		appChalet.locationr(id);

	}

	private static void liberation() {
		System.out.println("Saisir l'id du chalet");
		int id = scan.nextInt();

		appChalet.liberer(id);		
	}

	private static void locationLiberation() {
		do {
			menuLocationChalet();
			int choix = scan.nextInt();
			switch(choix) {
			case 1:
				locationChalet();
				break;
			case 2:
				liberation();
				break;
			case 3 :
				continuer(scan);
				return;
			default:
				System.out.println("Choix invalid, choix possible[1-3]");
				continuer(scan);
				break;	
			}
		}while(true);
	}
	// FONCTION PRINCIAPLE 
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		do {
			menuPrincipale();
			int choix=scan.nextInt();
			switch(choix) {

			case 1:
				actionEmploye();
				break;
			case 2 :
				actionProprietaire();
				break;
			case 3:
				System.out.println("Application fermée");
				return;
			default :
				System.out.println("Choix invalid, choix possible[1-3]");
				break;
			}

		}while(true);


	}

}





