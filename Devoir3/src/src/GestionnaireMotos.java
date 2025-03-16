/**
 * Devoir 3 - INF1002
 * Cours : INF1002 - Devoir 3
 *
 * Auteurs : Thierry Laurent-St-Pierre, Jaures Djabou Djietcheu, Lyann Duval,
 *           Hamad Tidjani Ouedraogo, Ange Pernelle Pengou Fopossi
 *
 */
/*            ##Description##

 * La classe Gestionnairemotos est celle qui contient principalement la methode pilote 
 * notre code sera execute.
 * elle contient une liste <listesmotos>pour repertorier les motos,
 * un menu principal et un sous menu;
 * des variables permettant de recuperer les entrees de l'utilisateur(concernant les operations sur les motos et les choix du menu)
 *  une instance de la classe Scanner
 *  
 *  et des methodes:
	- la methode ajoutmotos 
	 qui grace a des entrees de l'utilisateur(marques,modele,couleur,annee,kilometrage) ajout une moto a notre liste

 *  - la methode afficheListemoto
 * qui affiche tout le contenue de notre listemoto

	- la methode supprimemoto
 * qui supprime une moto de la liste grace une entree par l'utilisateur

	-la methode augentationkilometrage
 * qui augmente le kilometrage  d'une moto choisie dans la liste  par  l'utilisateur


	-la methode comparaisonkilometrage
 * qui compare  le kilometrage  de deux  motos de  la liste  par  l'utilisateur

 *  -la methode ajoutCinqmotos
 * qui ajout cinq motos dans la liste  


 */
package src;

import java.util.ArrayList;
import java.util.Scanner;


public class GestionnaireMotos {
	
	private static ArrayList<Moto>motos = new ArrayList<Moto>();
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean arret = false;

		while (!arret) {
			int choixMenu = afficherMenu();

			switch (choixMenu) //
			{
			case 1: // création d'un nouveau produit moto
				creerNouveauMoto();
				break;
			case 2: // permet d'afficher la liste de moto
				afficherMoto();
				break;

			case 3: // permet de supprimer une moto
				supprimerMoto();
				break;
			case 4: // Permet d'augmenter le kilométrage
				augmentationKilo();
				break;
			case 5: // comparaison du kilométrage de deux motos
				comparerMotos(motos);
				break;
			case 6:// permet la création et l'ajout de deux motos
				creationEtAjout();
			case 0:
				arret = true;
				break;

			default:
				System.out.println("entrez un nombre entre 1 et 6");
				break;

			}
		}
		scan.close();
	}

	 
	private static int afficherMenu() {
		System.out.println("\n\n--Menu de gestion de produits--");
		System.out.println("Option\t|");
		System.out.println("1\t| Création et ajout d’un objet moto à la liste de motos. ");
		System.out.println("2\t| Affichage de toutes les motos de la liste.");
		System.out.println("3\t| Suppression d’une moto");
		System.out.println("4\t| Augmentation du kilométrage d’une moto");
		System.out.println("5\t| Comparaisons du kilométrage de deux motos");
		System.out.println("6\t| Création et ajout de 4 objets motos prédéfinies à la liste des motos");
		System.out.println("\t|");
		System.out.println("0\t| quitter");

		// Saisie du choix
		int choix = -1;
		try {
			
			choix = Integer.parseInt(scan.nextLine().trim());
		} catch (NumberFormatException e) {
			System.out.println("Cela n'est pas un nombre.");
		}

		return choix;
	}

		
	// méthode privée permettant de créer une nouvelle moto
		private static void creerNouveauMoto() {
			boolean arret = false;
		
			
			for (Marques  marque : Marques.values()) {
				System.out.println("- "+marque);}
			

			Marques marque = null;

			while (!arret) {
				int choixmoto;
				choixmoto=scan.nextInt();

				switch (choixmoto) //
				{

			case 1 :
				
	                    System.out.println("Yamaha");
	                    marque = Marques.Yamaha;
	                    break;
	                
			case 2 : 
	                    System.out.println("Honda");
	                    marque = Marques.Honda;
	                    break;
			case 3 :
	                    System.out.println("Kawasaki");
	                    marque = Marques.Kawasaki;
	                    break;
			case 4 : 
	                    System.out.println("Harley Davidson");
	                    marque = Marques.HarleyDavidson;
	                    break;
			case 5 :
	                    System.out.println("Typhoon");
	                    marque = Marques.Typhoon;
	                    break;
			case 6 : 
	                    System.out.println("Suzuki");
	                    marque = Marques.Suzuki;
	                    break;
			case 0:
				arret = true;
				break;


			}
			Marques marques = null;
			String modele;
			int annee;
			String couleur;
			int kilometrage;

			
			System.out.println("Veuillez entrer le modele de modele : ");
			modele = scan.nextLine();
			System.out.println("Veuillez entrer la couleur : ");
			couleur = scan.nextLine();
			System.out.println("Veuillez entrer une année: ");
			annee = scan.nextInt();
			System.out.println("Veuillez entrer le kilometrage: ");
			kilometrage = scan.nextInt();

			scan.nextLine();

			motos.add(new Moto(marques, modele,annee,couleur,kilometrage));
			}

		}

		// méthode privée permettant de supprimer une moto à partir de sa marque
		private static void supprimerMoto() {
			System.out.println(" la quelle voulez vous supprimer  ");
			for (Moto Liste : motos) {
				System.out.println(" "+Liste.toString());}

			// Suppression  d'une  moto de liste de motos
			System.out.println("Entrer le numero du vehicule a supprimer.");
			int index = scan.nextInt();
			motos.remove(index -1);
		}


		// méthode privée permettant l'affichage d'un produit à partir de son indice
		private static void afficherMoto() {
			System.out.println("" + motos);
		}

		// méthode privée permettant d'augmenter le kilometrage d'une moto
		private static void augmentationKilo() {
			System.out.println(" la quelle voulez vous augmenter le kilometrage ");
			for (Moto Liste : motos) {
				System.out.println(" "+Liste.toString());}
			System.out.println(" Veuillez entrer la moto ");
			int indexK=scan.nextInt();
			System.out.println(" "+motos.get(indexK-1).toString());
			System.out.println("Entrer le nombre de kilometrage a ajouter");
			int k=scan.nextInt();
			motos.get(indexK-1).augmenterKilometrage(k);

			System.out.println(" "+motos.get(indexK-1).toString());

		}
		        
		
		
		//  méthode privée permettant de comparer les kilométrages de deux motos
		private static void comparerMotos(ArrayList<Moto> motos) {
			double qteMoto1 = motos.get(motos.size() - 2).getKilometrage();
			double qteMoto2 = motos.get(motos.size() - 1).getKilometrage();

			if (qteMoto1 > qteMoto2)
				System.out.println("la quantité  de l'avant dernier produit est plus élevée");
			else if (qteMoto1 < qteMoto2)
				System.out.println("la quantité  du dernier produit est plus  levée");
			else
				System.out.println("les quantités des deux derniers produits sont  égales");
		}
		//méthode privée permettant l'ajout et la création de moto dans la lise
		private static void creationEtAjout() {
			motos.add(new Moto(Marques.Yamaha,"2025 R1 GYTR",2025,"BLEU",20000000));
			motos.add(new Moto(Marques.Honda,"NX500",2025,"ROUGE",190999));
			motos.add(new Moto(Marques.Kawasaki,"W230",2025,"NOIR",39003390));
			motos.add(new Moto(Marques.HarleyDavidson,"Road King Special" ,2018,"GRIS",4009290));
			motos.add(new Moto(Marques.Suzuki,"GSX-S1000GX",2025,"GRIS",4009290));
			motos.add(new Moto(Marques.Typhoon,"Piaggio Typhoon 50",2022,"VIOLET",70000));
		}

	}

