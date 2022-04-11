package pizzeria;

import pizzeria.boutiques.Pizzeria;
import pizzeria.boutiques.PizzeriaStyleBrest;
import pizzeria.boutiques.PizzeriaStyleStrasbourg;
import pizzeria.pizzas.Pizza;

/**
 * Le pattern Fabrication définit une interface pour la	
 * création d’un objet, mais en laissant aux sous-classes le
 * choix des classes à instancier. Fabrication permet à une
 * classe de déléguer l’instanciation à des sous-classes.
 *
 * Le pattern Fabrique Abstraite fournit une
 * interface pour créer des familles d’objets apparentés ou
 * dépendants sans avoir à spécifier leurs classes concrètes.
 */
public class PizzeriaApp {

	public static void main(String[] args) {
		Pizzeria boutiqueBrest = new PizzeriaStyleBrest();
		Pizzeria boutiqueStrasbourg = new PizzeriaStyleStrasbourg();

		Pizza pizza = boutiqueBrest.commanderPizza("fromage");
		System.out.println("Luc a commandé une " + pizza + "\n");
		
		pizza = boutiqueStrasbourg.commanderPizza("fromage");
		System.out.println("Michel a commandé une " + pizza + "\n");
	}

}
