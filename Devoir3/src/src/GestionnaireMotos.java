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
			String marque;
			String modele;
			int annee;
			String couleur;
			int kilometrage;

			System.out.println("Veuillez entrer un nom de produit : ");
			marque = scan.nextLine();
			System.out.println("Veuillez entrer le prix unitaire de ce produit : ");
			modele = scan.nextLine();
			System.out.println("Veuillez entrer une quantite pour le produit: ");
			annee = scan.nextInt();
			System.out.println("Veuillez entrer le prix unitaire de ce produit : ");
			couleur = scan.nextLine();
			System.out.println("Veuillez entrer une quantite pour le produit: ");
			kilometrage = scan.nextInt();

			scan.nextLine();

			motos.add(new Moto (marque, modele, annee, couleur, kilometrage));
		}

		// m�thode privée permettant de supprimer une moto à partir de sa marque
		private static void supprimerMoto() {
			boolean produitSupprime = false;

			System.out.println("Veuillez entrer la marque de la moto que vous souhaitez supprimer: ");
			String nomASupprimer = scan.nextLine();

			

			for (int i = 0; i < motos.size(); i++) {
				if (nomASupprimer.equals(motos.get(i).getMarque())) {
					motos.remove(i--);
					produitSupprime = true;
				}
			}

			

			if (!produitSupprime)
				System.out.println(String.format("Le produit %s n'�tait pas dans la liste", nomASupprimer));
		}

		// méthode privée permettant l'affichage d'un produit à partir de son indice
		private static void afficherMoto() {
			System.out.println("" + motos);
		}

		// méthode privée permettant d'augmenter le kilometrage d'une moto
		private static void augmentationKilo() {
		       if (motos.isEmpty()) {
		            System.out.println("Aucune moto disponible.");
		            return;
		        }

		        afficherMoto();
		        System.out.print("Choisissez une moto (1-" + motos.size() + ") : ");
		        int choix = scan.nextInt();
		        scan.nextLine();

		        if (choix < 1 || choix > motos.size()) {
		            System.out.println("Choix invalide.");
		            return;
		        }

		        Moto motoSelectionnee = motos.get(choix - 1);

		        System.out.print("Entrez le nombre de kilomètres à ajouter : ");
		        int kmAjoute = scan.nextInt();
		        scan.nextLine(); // Consommer le retour à la ligne

		        if (kmAjoute > 0) {
		            motoSelectionnee.augmenterKilometrage(kmAjoute);
		            System.out.println("Kilométrage mis à jour !");
		        } else {
		        	System.out.println("Le kilométrage doit être positif.");
		        }	
		        }
		        
		
		
		//  méthode privée permettant de comparer les kilométrages de deux motos
		private static void comparerMotos(ArrayList<Moto> motos) {
			int qteMoto1 = motos.get(motos.size() - 2).getKilometrage();
			int qteMoto2 = motos.get(motos.size() - 1).getKilometrage();

			if (qteMoto1 > qteMoto2)
				System.out.println("la quantit� de l'avant dernier produit est plus élevée");
			else if (qteMoto1 < qteMoto2)
				System.out.println("la quantit� du dernier produit est plus �lev�e");
			else
				System.out.println("les quantit�s des deux derniers produits sont �gales");
		}
		//méthode privée permettant l'ajout et la création de moto dans la lise
		private static void creationEtAjout() {
			motos.add(new Moto("Suzuki","R1",2023, "Jaune", 16000));
			motos.add(new Moto("Harley","R2",2020, "bleu", 28000));
			motos.add(new Moto("Yamaha","R1",2019, "noir", 8000));
			motos.add(new Moto("Ducati","R1",2015, "noir", 2000));
		}

	}

		
	
