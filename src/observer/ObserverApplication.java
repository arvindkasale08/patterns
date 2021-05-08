package observer;

public class ObserverApplication {

	public static void main(String[] args) {
		WeatherData data = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(data);
		StatisticsConditionsDisplay statisticsConditionsDisplay = new StatisticsConditionsDisplay(data);
		data.setMeasurements(80, 65, 30.4f);
		data.setMeasurements(82, 70, 29.4f);
		data.setMeasurements(78, 90, 29.4f);
	}
}
