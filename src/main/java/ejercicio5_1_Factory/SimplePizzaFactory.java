package ejercicio5_1_Factory;

public class SimplePizzaFactory {
	private Pizza pizza;
	
	public Pizza createPizza(String type)
	{
		if(type.equals("cheese")){
			pizza = new CheesePizza();
		}
		else if(type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}
		else if(type.equals("clam")) {
			pizza = new ClamPizza();
		}
		else if(type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		
		return pizza;
	}
}
