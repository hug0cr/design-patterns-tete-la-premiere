package super_canard.bo.behaviors;

import super_canard.bo.interfaces.ComportementVol;

public class NePasVoler implements ComportementVol {

	@Override
	public void voler() {
		System.out.println("Je ne vole pas...");
	}
}
