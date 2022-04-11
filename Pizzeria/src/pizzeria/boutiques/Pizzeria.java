package pizzeria.boutiques;

import pizzeria.pizzas.Pizza;

public abstract class Pizzeria {
//	SimpleFabriqueDePizzas fabrique;
//
//	public Pizzeria(SimpleFabriqueDePizzas fabrique) {
//		this.fabrique = fabrique;
//	}

	public Pizzeria() {
	}

	public final Pizza commanderPizza(String type) {
		Pizza pizza;

		pizza = creerPizza(type);
		pizza.preparer();
		pizza.cuire();
		pizza.couper();
		pizza.emballer();

		return pizza;
	}

	public abstract Pizza creerPizza(String type);
}
