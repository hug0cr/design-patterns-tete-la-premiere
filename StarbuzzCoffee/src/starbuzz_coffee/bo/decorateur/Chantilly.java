package starbuzz_coffee.bo.decorateur;

import starbuzz_coffee.bo.Boisson;
import starbuzz_coffee.bo.DecorateurIngredient;

public class Chantilly extends DecorateurIngredient {
	Boisson boisson;
	
	public Chantilly(Boisson boisson) {
		this.boisson = boisson;
	}

	@Override
	public String getDescription() {
		return boisson.getDescription() + ", Chantilly";
	}

	@Override
	public double count() {
		return .10 + boisson.count();
	}
}
