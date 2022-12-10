package federation;

public class DAO  extends Joueur{
	
	
	
	public DAO(String nom, String prenom, String numero_licence, int point) {
		super(nom, prenom, numero_licence, point);
		// TODO Auto-generated constructor stub
	}

	public static void main(String [] args) {
		
		
		
	Joueur jq = new Joueur("ww","ee","p",2);
	Joueur je = new Joueur("ss","dd","p",3);
	
	je.compare(jq, je);
	
	Match m = new Match(jq,je);
	m.getVainqueur();
	m.setVainqueur(jq, je);
	
		
		
		
//		public void ajoutJoueur() {
//			
//		}
		
	}
	
	

}
