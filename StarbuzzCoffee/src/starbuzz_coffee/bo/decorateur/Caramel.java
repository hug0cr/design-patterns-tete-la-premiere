package starbuzz_coffee.bo.decorateur;

import starbuzz_coffee.bo.Boisson;
import starbuzz_coffee.bo.DecorateurIngredient;

public class Caramel extends DecorateurIngredient {
	Boisson boisson;
	
	public Caramel(Boisson boisson) {
		this.boisson = boisson;
	}

	@Override
	public String getDescription() {
		return boisson.getDescription() + ", Caramel";
	}

	@Override
	public double count() {
		return .15 + boisson.count();
	}
}
