package ejercicio2_1_Observer;

public class CurrentConditionsDisplay implements IObserver, IDispleyElement {
	private float temperature;
	private float humidity;
	private ISubject weatherData;
	
	public CurrentConditionsDisplay(ISubject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void display() {
		
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");

	}

	
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();

	}

}
