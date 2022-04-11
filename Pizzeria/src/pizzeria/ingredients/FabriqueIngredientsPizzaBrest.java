package pizzeria.ingredients;

import pizzeria.ingredients.fromages.Fromage;
import pizzeria.ingredients.fromages.Reggiano;
import pizzeria.ingredients.pates.Pate;
import pizzeria.ingredients.pates.PateFine;
import pizzeria.ingredients.sauces.Sauce;
import pizzeria.ingredients.sauces.SauceMarinara;

public class FabriqueIngredientsPizzaBrest implements FabriqueIngredientsPizza {

	@Override
	public Pate creerPate() {
		return new PateFine();
	}

	@Override
	public Sauce creerSauce() {
		return new SauceMarinara();
	}

	@Override
	public Fromage creerFromage() {
		return new Reggiano();
	}

}
