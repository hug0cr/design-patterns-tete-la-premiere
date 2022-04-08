package super_canard;

import super_canard.bo.Canard;
import super_canard.bo.Colvert;
import super_canard.bo.PrototypeCanard;
import super_canard.bo.behaviors.PropulsionAReaction;

/**
 * Le pattern Stratégie définit une famille d’algorithmes,
 * encapsule chacun d’eux et les rend interchangeables. Stratégie
 * permet à l’algorithme de varier indépendamment des clients qui
 * l’utilisent.
 */
public class SuperCanardApp {

	public static void main(String[] args) {
		Canard colvert = new Colvert();
		colvert.effectuerCancan();
		colvert.effectuerVol();
		
		Canard proto = new PrototypeCanard();
		proto.effectuerVol();
		proto.setComportementVol(new PropulsionAReaction());
		proto.effectuerVol();
	}
}
