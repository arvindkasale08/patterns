package observer;

public class StatisticsConditionsDisplay implements Observer, DisplayElement {

	private WeatherData weatherData;
	private float min = 100;
	private float max = -100;
	private float avg = 0;
	private int count = 0;

	public StatisticsConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Avg/Min/Max temperature: "+ avg + "/ " + min + "/ " + max);
	}

	@Override
	public void update() {
		count ++;
		min = weatherData.getTemperature() < min ? weatherData.getTemperature() : min;
		max = weatherData.getTemperature() > max ? weatherData.getTemperature() : max;
		avg = ((avg * count - 1) + weatherData.getTemperature()) / count;
		display();
	}
}
