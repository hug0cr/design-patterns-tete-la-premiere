package station_meteo.bo.affichages;

import java.util.Observable;
import java.util.Observer;

import station_meteo.bo.DonneesMeteoJavaObs;
import station_meteo.bo.interfaces.Affichage;

public class AffichageConditionsJavaObs implements Observer, Affichage {
	Observable observable;
	private float temperature;
	private float humidite;

	public AffichageConditionsJavaObs(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void afficher() {
		System.out.println("Conditions actuelles : " + temperature + " degrés C et " + humidite + " % d’humidité");
	}

	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof DonneesMeteoJavaObs) {
			DonneesMeteoJavaObs donneesMeteo = (DonneesMeteoJavaObs) obs;
			this.temperature = donneesMeteo.getTemperature();
			this.humidite = donneesMeteo.getHumidite();
			afficher();
		}

	}

}
