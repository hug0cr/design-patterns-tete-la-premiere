package super_canard.bo;

import super_canard.bo.behaviors.Cancan;
import super_canard.bo.behaviors.VolerAvecDesAiles;

public class Colvert extends Canard {

	public Colvert() {
		comportementCancan = new Cancan();
		comportementVol = new VolerAvecDesAiles();
	}

	@Override
	public void afficher() {
		System.out.println("Je suis un colvert.");
	}
}
