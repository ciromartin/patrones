package ejercicio5_2_FactoryMethod;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String type)
	{
		Pizza pizza;
		
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
		
	}

	public abstract Pizza createPizza(String type);
	
	
}
