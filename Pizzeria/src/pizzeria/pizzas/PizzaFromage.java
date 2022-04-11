package pizzeria.pizzas;

import pizzeria.ingredients.FabriqueIngredientsPizza;

public class PizzaFromage extends Pizza {
	FabriqueIngredientsPizza fabriqueIngredients;

	public PizzaFromage(FabriqueIngredientsPizza fabriqueIngredients) {
		this.fabriqueIngredients = fabriqueIngredients;
	}

	@Override
	public void preparer() {
		System.out.println("Préparation de " + nom);
		pate = fabriqueIngredients.creerPate();
		sauce = fabriqueIngredients.creerSauce();
		fromage = fabriqueIngredients.creerFromage();
	}

}
