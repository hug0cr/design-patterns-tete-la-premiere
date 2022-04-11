package fabrique_de_chocolat;

public class BouilleurChocolatInstanceDemarrage {
	/**
	 * Création de l'instance au chargement
	 */
	private static BouilleurChocolatInstanceDemarrage instance = new BouilleurChocolatInstanceDemarrage();
	private boolean vide;
	private boolean bouilli;

	private BouilleurChocolatInstanceDemarrage() {
		vide = true;
		bouilli = false;
	}

	/**
	 * En adoptant cette approche, nous nous reposons sur la JVM pour créer l’unique
	 * instance du Singleton quand la classe est chargée. La JVM garantit que l’instance
	 * sera créée avant qu’un thread quelconque n’accède à la variable statique
	 * uniqueInstance.
	 * 
	 * Désavantage: Prise de ressources inutiles si non utilisé
	 */
	public static synchronized BouilleurChocolatInstanceDemarrage getInstance() {
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
