package station_meteo;

import station_meteo.bo.DonneesMeteo;
import station_meteo.bo.affichages.AffichageConditions;

/**
 * Le pattern Observateur définit une relation
 * entre objets de type un-à-plusieurs, de façon que,
 * lorsque un objet change d’état, tous ceux qui en
 * dépendent en soient notifiés et soient mis à jour
 * automatiquement.
 */
public class StationMeteoApp {

	public static void main(String[] args) {
		DonneesMeteo donneesMeteo = new DonneesMeteo();
		AffichageConditions affichageCond = new AffichageConditions(donneesMeteo);
//		AffichageStats affichageStat = new AffichageStats(donneesMeteo);
//		AffichagePrevisions affichagePrev = new AffichagePrevisions(donneesMeteo);
		donneesMeteo.setMesures(26, 65, 1020);
		donneesMeteo.setMesures(28, 70, 1012);
		donneesMeteo.setMesures(22, 90, 1012);
	}

}
