package pizzeria.pizzas;

import pizzeria.ingredients.fromages.Fromage;
import pizzeria.ingredients.pates.Pate;
import pizzeria.ingredients.sauces.Sauce;

public abstract class Pizza {
	String nom;
	Pate pate;
	Sauce sauce;
	Fromage fromage;

	public abstract void preparer();

	public void cuire() {
		System.out.println("Cuisson 25 minutes à 180°");
	}

	public void couper() {
		System.out.println("Découpage en parts triangulaires");
	}

	public void emballer() {
		System.out.println("Emballage dans une boîte officielle");
	}

	public String getNom() {
		return nom;
	}

	@Override
	public String toString() {
		return "Pizza [nom=" + nom + ", pate=" + pate + ", sauce=" + sauce + ", fromage=" + fromage + "]";
	}

}
