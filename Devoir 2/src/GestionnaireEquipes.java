//********************************************************************
//Devoir 1 - INF1002
//Cours : Devoir 2  - 26 février 2025
//
//Auteurs : Thierry Laurent-St-Pierre, Jaures Djabou Djietcheu, Lyann Duval,
//          Ange Pernelle Pengou Fopossi
//
//Description : CLasse GestionnaireEquipes qui permet de gérer les équipes
//********************************************************************

public class GestionnaireEquipes {

    public static void main(String[] args) {

        //-------------------------------------
        // Création des joueurs
        //-------------------------------------
        Joueur joueur1 = new Joueur("Bertrand", "Janette", 100);
        Joueur joueur2 = new Joueur("Lavoie", "Pierre", 24);
        Joueur joueur3 = new Joueur("Gagnon", "Michel", 19);
        Joueur joueur4 = new Joueur("Roy", "Philippe", 31);
        Joueur joueur5 = new Joueur("Bouchard", "Jean-Marc", 97);
        Joueur joueur6 = new Joueur("Dion", "Jean-Philippe", 53);
        Joueur joueur7 = new Joueur("Lemieux", "Sylvain", 20);
        Joueur joueur8 = new Joueur("Côté", "Germain", 87);

        //-------------------------------------
        // Création des équipes
        //-------------------------------------
        Equipe equipe1 = new Equipe("Les Lions", Categories.SENIOR);
        Equipe equipe2 = new Equipe("Les Vampires", Categories.JUNIOR);

        //------------------------------------------
        // Ajout des joueurs dans les équipes 1 et 2
        //-----------------------------------------
        equipe1.ajouterJoueur(joueur1);
        equipe1.ajouterJoueur(joueur2);
        equipe1.ajouterJoueur(joueur3);
        equipe1.ajouterJoueur(joueur4);
    
        equipe2.ajouterJoueur(joueur5);
        equipe2.ajouterJoueur(joueur6);
        equipe2.ajouterJoueur(joueur7);
        equipe2.ajouterJoueur(joueur8);

        //---------------------------------
        // Parties gagnées par les équipes
        //---------------------------------
        equipe1.setNombrePartiesGagnees(4); 
        equipe2.setNombrePartiesGagnees(5);

        // Ajout de parties gagnées pour l'équipe 1
        equipe1.ajoutPartiesGagnees(2);

        // Affichage du nombre de parties gagnées par chaque équipe
        if (equipe1.getNombrePartiesGagnees() > equipe2.getNombrePartiesGagnees())
        {
            System.out.println("L'équipe 1 a gagné plus de parties que l'équipe 2\n");
        }
        else
        {
            System.out.println("L'équipe 2 a gagné plus de parties que l'équipe 1");
        }

        // Affichage du nombre de joueurs dans chaque équipe
        System.out.println("Nombre de joueurs dans l'équipe 1: " + equipe1.nombreJoueurs());
        System.out.println("Nombre de joueurs dans l'équipe 2: " + equipe2.nombreJoueurs() + "\n");

        // Suppression du quatrième joueur de l'équipe 1
        equipe1.supprimerJoueur(3);
        System.out.println("Nombre de joueurs dans l'équipe 1 après suppression: " + equipe1.nombreJoueurs() + "\n");

        // Affichage des joueurs dans chaque équipe
        System.out.println((equipe1.afficherJoueurs()));
        System.out.println((equipe2.afficherJoueurs()));
        
    }
}