package federation;

public class Joueur {
	
	
	/*
	 * Attribut de la classe Joueur

	 */
	private String nom ;
	private String prenom;
	private String numero_licence;
	private int point =0;
	
	
	//Fin Attribut de la classe Joeur

// _________________________________________________________________________________________
	
	
	/*
	 * Constructeur de la classe Joeur

	 */
	
	public Joueur(String nom, String prenom, String numero_licence, int point) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numero_licence = numero_licence;
		this.point = point;
	}

// Fin Constructeur 
//______________________________________________________________________________________________

	
	/*
	 * Debut  Encapsulation

	 */
	
	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getNumero_licence() {
		return numero_licence;
	}



	public void setNumero_licence(String numero_licence) {
		this.numero_licence = numero_licence;
	}



	public int getPoint() {
		return point;
	}
	
	

	
	//fin encapsulation 
	
//__________________________________________________________________________________________

	/*
	 * Methode  pour generer Numero de licence
	 
	 */
	
	private String generateNumeroLicence(String nom, String prenom) {
		
		throw new UnsupportedOperationException("peu pas supporter ");
		
	}
	
	
//________________________________________________________________________________________
	
	
	/*
	 * Methode toString()

	 */
	
	


@Override
	public String toString() {
		return "Joueur [nom=" + nom + ", prenom=" + prenom + ", numero_licence=" + numero_licence + ", point=" + point
				+ "]";
	}

// Fin methode toString()

//______________________________________________________________________________________



	/*
 * Methode pour ajouter des points au joueur 

 */
	public void ajouterPoint(int point) {
		this.point = point;
	}

	
	 //  Fin Methode pour ajouter des points au joueur 

	 
// ________________________________________________________________________________________
	
	/*
	 * Debut Methode pour equals

	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Joueur other = (Joueur) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (numero_licence == null) {
			if (other.numero_licence != null)
				return false;
		} else if (!numero_licence.equals(other.numero_licence))
			return false;
		if (point != other.point)
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}
	
	
	
	
	 // Fin Methode  equals
//______________________________________________________________________________________
	

	/*
	 * Debut  Interface   compare to

	 */
	
	public int compareTo(Joueur j) {
		return this.nom.compareTo(j.getNom());
	}
	public int compare(Joueur j1, Joueur j2) {
		
		if (j1.getPoint()<j2.getPoint())
			return -1;
		if (j1.getPoint()>j2.getPoint())
			return 1;
		else
			return 0;
	}
	
	// Fin interface Comparato

}
