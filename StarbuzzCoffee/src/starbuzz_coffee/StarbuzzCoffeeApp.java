package starbuzz_coffee;

import starbuzz_coffee.bo.Boisson;
import starbuzz_coffee.bo.boisson.Colombia;
import starbuzz_coffee.bo.boisson.Espresso;
import starbuzz_coffee.bo.boisson.Sumatra;
import starbuzz_coffee.bo.decorateur.Caramel;
import starbuzz_coffee.bo.decorateur.Chantilly;
import starbuzz_coffee.bo.decorateur.Chocolat;

/**
 * Le pattern Décorateur attache dynamiquement des responsabilités
 * supplémentaires à un objet. Il fournit une alternative souple à la
 * dérivation, pour étendre les fonctionnalités.
 */
public class StarbuzzCoffeeApp {

	public static void main(String[] args) {
		Boisson boisson = new Espresso();
		System.out.println(boisson.getDescription() + " €" + boisson.count());

		Boisson boisson2 = new Sumatra();
		boisson2 = new Chocolat(boisson2);
		boisson2 = new Chocolat(boisson2);
		boisson2 = new Chantilly(boisson2);
		System.out.println(boisson2.getDescription() + " €" + boisson2.count());

		Boisson boisson3 = new Colombia();
		boisson3 = new Caramel(boisson3);
		boisson3 = new Chocolat(boisson3);
		boisson3 = new Chantilly(boisson3);
		System.out.println(boisson3.getDescription() + " €" + boisson3.count());
	}
}
