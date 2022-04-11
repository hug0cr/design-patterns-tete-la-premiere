package pizzeria.ingredients;

import pizzeria.ingredients.fromages.Fromage;
import pizzeria.ingredients.fromages.Mozzarella;
import pizzeria.ingredients.pates.Pate;
import pizzeria.ingredients.pates.PateSoufflee;
import pizzeria.ingredients.sauces.Sauce;
import pizzeria.ingredients.sauces.SauceTomateCerise;

public class FabriqueIngredientsPizzaStrasbourg implements FabriqueIngredientsPizza {

	@Override
	public Pate creerPate() {
		return new PateSoufflee();
	}

	@Override
	public Sauce creerSauce() {
		return new SauceTomateCerise();
	}

	@Override
	public Fromage creerFromage() {
		return new Mozzarella();
	}

}
