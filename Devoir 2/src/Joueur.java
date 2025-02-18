//********************************************************************
//Devoir 1 - INF1002
//Cours : Devoir 2  - 18 février 2025
//
//Auteurs : Thierry Laurent-St-Pierre, Jaures Djabou Djietcheu, Lyann Duval,
//          Ange Pernelle Pengou Fopossi
//
//Description : Classe Joueur qui permet de créer des joueurs
//********************************************************************

public class Joueur {
    private String nom;
    private String prenom;
    private int age;

    // Constructeur
    public Joueur(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        
    }
    //-------------------------------------
    // Getters 
    //-------------------------------------
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    //-------------------------------------
    // Setters
    //-------------------------------------

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // Méthode toString
    public String toString()
{
    return prenom + " " + nom + ", " + age + " ans";
}
}
