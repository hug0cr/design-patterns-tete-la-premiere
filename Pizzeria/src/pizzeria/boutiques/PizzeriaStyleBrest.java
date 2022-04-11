package pizzeria.boutiques;

import pizzeria.ingredients.FabriqueIngredientsPizza;
import pizzeria.ingredients.FabriqueIngredientsPizzaBrest;
import pizzeria.pizzas.Pizza;
import pizzeria.pizzas.PizzaFromage;

public class PizzeriaStyleBrest extends Pizzeria {

	@Override
	public Pizza creerPizza(String type) {
		Pizza pizza = null;
		FabriqueIngredientsPizza fabriqueIngredients = new FabriqueIngredientsPizzaBrest();

		if (type.equals("fromage")) {
			return new PizzaFromage(fabriqueIngredients);
		}
		return pizza;
	}

}
