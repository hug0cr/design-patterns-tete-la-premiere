package starbuzz_coffee.bo.boisson;

import starbuzz_coffee.bo.Boisson;

public class Colombia extends Boisson {

	public Colombia() {
		this.description = "Pur Colombia";
	}

	@Override
	public double count() {
		return .89;
	}
}
