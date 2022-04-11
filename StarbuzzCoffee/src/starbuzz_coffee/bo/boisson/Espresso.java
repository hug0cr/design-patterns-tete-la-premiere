package starbuzz_coffee.bo.boisson;

import starbuzz_coffee.bo.Boisson;

public class Espresso extends Boisson {
	
	public Espresso() {
		this.description = "Espresso";
	}

	@Override
	public double count() {
		return 1.99;
	}
}
