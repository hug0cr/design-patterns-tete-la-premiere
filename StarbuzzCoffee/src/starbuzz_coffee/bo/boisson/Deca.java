package starbuzz_coffee.bo.boisson;

import starbuzz_coffee.bo.Boisson;

public class Deca extends Boisson {

	public Deca() {
		this.description = "Décaféiné";
	}

	@Override
	public double count() {
		return 1.05;
	}
}
