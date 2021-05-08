package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private WeatherData weatherData;
	private float humidity;
	private float temperature;

	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current Conditions are humidity: "+ humidity+ " temperature: "+ temperature);
	}

	@Override
	public void update() {
		this.temperature = weatherData.getTemperature();
		this.humidity = weatherData.getHumidity();
		display();
	}
}
