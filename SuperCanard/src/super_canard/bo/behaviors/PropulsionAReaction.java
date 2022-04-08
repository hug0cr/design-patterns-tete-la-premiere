package super_canard.bo.behaviors;

import super_canard.bo.interfaces.ComportementVol;

public class PropulsionAReaction implements ComportementVol {

	@Override
	public void voler() {
		System.out.println("Je vole avec un réacteur !");
	}
}
