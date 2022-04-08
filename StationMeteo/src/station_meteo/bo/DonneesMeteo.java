package station_meteo.bo;

import java.util.ArrayList;
import java.util.List;

import station_meteo.bo.interfaces.Observateur;
import station_meteo.bo.interfaces.Sujet;

public class DonneesMeteo implements Sujet {

	private List<Observateur> observateurs = new ArrayList<>();
	private float temperature;
	private float humidite;
	private float pression;

	public DonneesMeteo() {
	}

	@Override
	public void enregistrerObservateur(Observateur o) {
		observateurs.add(o);
	 }

	@Override
	public void supprimerObservateur(Observateur o) {
		int i = observateurs.indexOf(o);
		if (i >= 0) {
			observateurs.remove(i);
		}
	}

	@Override
	public void notifierObservateurs() {
		for (int i = 0; i < observateurs.size(); i++) {
			Observateur observateur = (Observateur) observateurs.get(i);
			observateur.actualiser(temperature, humidite, pression);
		}
	}

	public void actualiserMesures() {
		notifierObservateurs();
	}

	public void setMesures(float temperature, float humidite, float pression) {
		this.temperature = temperature;
		this.humidite = humidite;
		this.pression = pression;
		actualiserMesures();
	}

}
