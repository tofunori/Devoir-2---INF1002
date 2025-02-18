//********************************************************************
//Devoir 1 - INF1002
//Cours : Devoir 2  - 18 février 2025
//
//Auteurs : Thierry Laurent-St-Pierre, Jaures Djabou Djietcheu, Lyann Duval,
//          Ange Pernelle Pengou Fopossi
//
//Description : Classe Equipe qui permet de créer des équipes
//********************************************************************
import java.util.ArrayList;

public class Equipe {
    private String nom;
    private int nombrePartiesGagnees;
    private final ArrayList<Joueur> listeJoueurs;
    private Categories categorie;

    public Equipe(String nom, Categories categorie) {
        this.nom = nom;
        this.categorie = categorie;
        this.nombrePartiesGagnees = 0;
        this.listeJoueurs = new ArrayList<>();
    }
    //-------------------------------------
    // Getters et Setters`
    //-------------------------------------

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombrePartiesGagnees() {
        return nombrePartiesGagnees;
    }

    public void setNombrePartiesGagnees(int nombrePartiesGagnees) {
        this.nombrePartiesGagnees = nombrePartiesGagnees;
    }

    public Categories getCategorie() {
        return categorie;
    }

    public void setCategorie(Categories categorie) {
        this.categorie = categorie;
    }

    //-------------------------------------
    // Méthodes qui permettent de gérer les joueurs
    //-------------------------------------

    public void ajoutPartieGagnee(int nombre)
    {
        nombrePartiesGagnees += nombre;
    }
    
    public int nombreJoueurs()
    {
        return listeJoueurs.size();
    }
    public void ajouterJoueur(Joueur joueur)
    {
        listeJoueurs.add(joueur);
    }
    public void supprimerJoueur(Joueur joueur)
    {
        listeJoueurs.remove(joueur);
    }   
    //-------------------------------------
    // Méthodes qui permettent d'afficher les joueurs
    //-------------------------------------
    
    public String afficherJoueurs() 
    {
        String resultat = "Équipe" +" " + nom + ":\n";
        for (Joueur joueur : listeJoueurs)
        {
            resultat += joueur.toString() + "\n";
        }   
        return resultat;
    }
}
