package fabrique_de_chocolat;

public class BouilleurChocolatDoubleVerif {
	/**
	 * Le mot-clé volatile garantit que plusieurs threads gèrent correctement la
	 * variable instance quand elle est initialisée à une instance de Singleton.
	 */
	private volatile static BouilleurChocolatDoubleVerif instance;
	private boolean vide;
	private boolean bouilli;

	private BouilleurChocolatDoubleVerif() {
		vide = true;
		bouilli = false;
	}

	/**
	 * Avec le verrouillage à double vérification, nous commençons par vérifier 
	 * si une instance est créée, et si non, ALORS nous synchronisons. 
	 * De cette façon, nous ne synchronisons que la première fois
	 */
	public static synchronized BouilleurChocolatDoubleVerif getInstance() {
		if (instance == null) {
			synchronized (BouilleurChocolatDoubleVerif.class) {
				if (instance == null) {
					instance = new BouilleurChocolatDoubleVerif();
				}
			}
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
