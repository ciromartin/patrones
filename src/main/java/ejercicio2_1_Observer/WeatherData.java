package ejercicio2_1_Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject {
	
	private List<IObserver> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData()
	{
		observers = new ArrayList<>();
	}
	
	public void registerObserver(IObserver o) {
		
		observers.add(o);

	}

	
	public void removeObserver(IObserver o) {
		
		int i = observers.indexOf(o);
		if(i >= 0)
		{
			observers.remove(i);
		}

	}

	
	public void notifyObservers() {
		for(IObserver o : observers)
		{
			o.update(temperature, humidity, pressure);
		}

	}
	
	public void measurementsChanged() {
		notifyObservers(); 
	}

	public void setMeasurements(float temperature,float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
