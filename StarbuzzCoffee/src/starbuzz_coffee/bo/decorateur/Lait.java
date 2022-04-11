package starbuzz_coffee.bo.decorateur;

import starbuzz_coffee.bo.Boisson;
import starbuzz_coffee.bo.DecorateurIngredient;

public class Lait extends DecorateurIngredient {
	Boisson boisson;
	
	public Lait(Boisson boisson) {
		this.boisson = boisson;
	}

	@Override
	public String getDescription() {
		return boisson.getDescription() + ", Lait";
	}

	@Override
	public double count() {
		return .10 + boisson.count();
	}
}
