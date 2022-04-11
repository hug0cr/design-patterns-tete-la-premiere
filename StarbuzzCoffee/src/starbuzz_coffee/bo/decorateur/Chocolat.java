package starbuzz_coffee.bo.decorateur;

import starbuzz_coffee.bo.Boisson;
import starbuzz_coffee.bo.DecorateurIngredient;

public class Chocolat extends DecorateurIngredient {
	Boisson boisson;
	
	public Chocolat(Boisson boisson) {
		this.boisson = boisson;
	}

	@Override
	public String getDescription() {
		return boisson.getDescription() + ", Chocolat";
	}

	@Override
	public double count() {
		return .20 + boisson.count();
	}
}
