package pizzeria.boutiques;

import pizzeria.ingredients.FabriqueIngredientsPizza;
import pizzeria.ingredients.FabriqueIngredientsPizzaStrasbourg;
import pizzeria.pizzas.Pizza;
import pizzeria.pizzas.PizzaFromage;

public class PizzeriaStyleStrasbourg extends Pizzeria {

	@Override
	public Pizza creerPizza(String type) {
		Pizza pizza = null;
		FabriqueIngredientsPizza fabriqueIngredients = new FabriqueIngredientsPizzaStrasbourg();
		
		if (type.equals("fromage")) {
			pizza = new PizzaFromage(fabriqueIngredients);
		}
		
		return pizza;
	}

}
