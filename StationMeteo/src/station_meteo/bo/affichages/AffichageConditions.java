package station_meteo.bo.affichages;

import station_meteo.bo.interfaces.Affichage;
import station_meteo.bo.interfaces.Observateur;
import station_meteo.bo.interfaces.Sujet;

public class AffichageConditions implements Observateur, Affichage {

	private float temperature;
	private float humidite;
	private Sujet donneesMeteo;
	
	public AffichageConditions(Sujet donneesMeteo) {
		this.donneesMeteo = donneesMeteo;
		donneesMeteo.enregistrerObservateur(this);
	}

	@Override
	public void afficher() {
		System.out.println("Conditions actuelles : " + temperature + " degrés C et " + humidite + " % d’humidité");
	}

	@Override
	public void actualiser(float temp, float humidite, float pression) {
		this.temperature = temperature;
		this.humidite = humidite;
		afficher();
	}

	public void AffichageConditions(Sujet donneesMeteo) {
		this.donneesMeteo = donneesMeteo;
		donneesMeteo.enregistrerObservateur(this);
	}

}
