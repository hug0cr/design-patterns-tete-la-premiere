package station_meteo.bo;

import java.util.Observable;

public class DonneesMeteoJavaObs extends Observable {
	private float temperature;
	private float humidite;
	private float pression;

	public DonneesMeteoJavaObs() {
	}

	public void actualiserMesures() {
		notifyObservers();
	}

	public void setMesures(float temperature, float humidite, float pression) {
		this.temperature = temperature;
		this.humidite = humidite;
		this.pression = pression;
		actualiserMesures();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidite() {
		return humidite;
	}

	public float getPression() {
		return pression;
	}
	
}
