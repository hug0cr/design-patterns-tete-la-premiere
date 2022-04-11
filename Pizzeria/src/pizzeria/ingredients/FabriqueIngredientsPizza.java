package pizzeria.ingredients;

import pizzeria.ingredients.fromages.Fromage;
import pizzeria.ingredients.pates.Pate;
import pizzeria.ingredients.sauces.Sauce;

public interface FabriqueIngredientsPizza {
	public Pate creerPate();

	public Sauce creerSauce();

	public Fromage creerFromage();
}
