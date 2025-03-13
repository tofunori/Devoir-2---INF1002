package src;

public class Moto {
	private String marque;  
	private String modèle;
	private int année;
	private String couleur;
	private double kilométrage;

	
	// constructeur 
	
	public Moto(String marque, String modèle, int année, String couleur, double kilometrage ) {
		this.marque= marque;
		this.modèle=modèle;
		this.année=année;
		this.couleur=couleur;
		this.kilométrage=kilométrage;
		
		 // Accesseurs (getters)
	   
		public String getmarque() {
	        return marque;
	    }

	    public String getModele() {
	        return modele;
	    }

	    public int getAnnee() {
	        return annee;
	    }

	    public String getCouleur() {
	        return couleur;
	    }

	    public int getKilometrage() {
	        return kilometrage;
	        
	        // Accesseurs (getters)
	        public marque getmarque() {
	            return marque;
	        }

	        public String getModele() {
	            return modele;
	        }

	        public int getAnnee() {
	            return annee;
	        }

	        public String getCouleur() {
	            return couleur;
	        }

	        public int getKilometrage() {
	            return kilometrage;
		
	         // methode pour augmenter le kilométrage
	    		
	        	public void augmenterKilométrage(int distance) {
	        	   
	        		this.kilométrage += distance;
	        	}
	        	
	        	// methote toString pour afficher les resultat
	        	//@override
	        	
	        	public String toString () {
	        		
	        		return (marque+""+modèle+""+Année+""+Couleur+""+Kilométrage+"");
	        	}
	        	
	}
		
			
		}
		}

}
