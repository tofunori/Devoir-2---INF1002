public class GestionnaireEquipes {

    public static void main(String[] args) {
        
        Joueur joueur1 = new Joueur("Tremblay", "Jean", 20);
        Joueur joueur2 = new Joueur("Lavoie", "Pierre", 22);
        Joueur joueur3 = new Joueur("Gagnon", "Michel", 19);
        Joueur joueur4 = new Joueur("Roy", "Philippe", 21);
        Joueur joueur5 = new Joueur("Bouchard", "Marc", 18);
        Joueur joueur6 = new Joueur("Fortin", "Luc", 23);
        Joueur joueur7 = new Joueur("Lemieux", "Sylvain", 20);
        Joueur joueur8 = new Joueur("Côté", "Paul", 19);

        Equipe equipe1 = new Equipe("Les lions", Categories.SENIOR);
        Equipe equipe2 = new Equipe("Les vampires", Categories.JUNIOR);
      
        equipe1.ajouterJoueur(joueur1);
        equipe1.ajouterJoueur(joueur2);
        equipe1.ajouterJoueur(joueur3);
        equipe1.ajouterJoueur(joueur4);
    
        equipe2.ajouterJoueur(joueur5);
        equipe2.ajouterJoueur(joueur6);
        equipe2.ajouterJoueur(joueur7);
        equipe2.ajouterJoueur(joueur8);

        equipe1.setNombrePartiesGagnees(4); 
        equipe2.setNombrePartiesGagnees(5);

        equipe1.ajoutPartieGagnee(2);

        if (equipe1.getNombrePartiesGagnees() > equipe2.getNombrePartiesGagnees())
        {
            System.out.println("L'équipe 1 a gagné plus de parties que l'équipe 2");
        }
        else
        {
            System.out.println("L'équipe 2 a gagné plus de parties que l'équipe 1");
        }

        System.out.println("Nombre de joueurs dans l'équipe 1: " + equipe1.nombreJoueurs());
        System.out.println("Nombre de joueurs dans l'équipe 2: " + equipe2.nombreJoueurs());
        
        equipe1.supprimerJoueur(joueur3);
        System.out.println("Nombre de joueurs dans l'équipe 1 après suppression: " + equipe1.nombreJoueurs());
        
        System.out.println((equipe1.afficherJoueurs()));
        System.out.println((equipe2.afficherJoueurs()));
        
    }
}
