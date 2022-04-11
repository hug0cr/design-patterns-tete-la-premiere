package starbuzz_coffee.bo.boisson;

import starbuzz_coffee.bo.Boisson;

public class Sumatra extends Boisson {

	public Sumatra() {
		this.description = "Sumatra";
	}

	@Override
	public double count() {
		return .99;
	}
}
