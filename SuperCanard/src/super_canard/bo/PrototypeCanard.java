package super_canard.bo;

import super_canard.bo.behaviors.Cancan;
import super_canard.bo.behaviors.NePasVoler;

public class PrototypeCanard extends Canard {

	public PrototypeCanard() {
		comportementVol = new NePasVoler();
		comportementCancan = new Cancan();
	}

	@Override
	public void afficher() {
		System.out.println("Je suis un prototype de canard");
	}
}
