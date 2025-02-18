//---------------------------------------------------------------------------------------------
// INF1002 - Devoir 2
// Nom: Thierry Laurent St-Pierre
//---------------------------------------------------------------------------------------------

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
