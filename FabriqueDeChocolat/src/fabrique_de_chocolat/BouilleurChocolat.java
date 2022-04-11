package fabrique_de_chocolat;

public class BouilleurChocolat {
	private static BouilleurChocolat instance;
	private boolean vide;
	private boolean bouilli;

	private BouilleurChocolat() {
		vide = true;
		bouilli = false;
	}
	
	/**
	 * En ajoutant le mot-clé synchronized
	 * à getInstance(), nous obligeons chaque
	 * thread à attendre son tour avant
	 * d’entrer dans la méthode. Autrement dit,
	 * deux threads ne peuvent pas entrer dans
	 * la méthode en même temps.
	 * 
	 * Désavantage: Couteux en ressource
	 */
	public static synchronized BouilleurChocolat getInstance() {
		if (instance == null) {
			instance = new BouilleurChocolat();
		}
		return instance;
	}

	public void remplir() {
		if (estVide()) {
			vide = false;
			bouilli = false;
			// remplir le bouilleur du mélange lait/chocolat
		}
	}

	public void vider() {
		if (!estVide() && estBouilli()) {
			// vider le mélange
			vide = true;
		}
	}

	public void bouillir() {
		if (!estVide() && !estBouilli()) {
			// porter le contenu à ébullition
			bouilli = true;
		}
	}

	public boolean estVide() {
		return vide;
	}

	public boolean estBouilli() {
		return bouilli;
	}
}
