package ejercicio5_2_FactoryMethod;

public class CaliforniaPizzaStore {
	
	public Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new CaliforniaStyleCheesePizza();
		}
		else if(type.equals("veggie")){
			return new CaliforniaStyleVeggiePizza();
		}
		else if(type.equals("clam")){
			return new CaliforniaStyleClamPizza();
		}
		else if(type.equals("pepperoni")){
			return new CaliforniaStylePepperoniPizza();
		}
		else return null;
	}
		
}
