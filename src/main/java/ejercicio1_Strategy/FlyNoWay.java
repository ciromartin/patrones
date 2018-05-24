package ejercicio1_Strategy;

public class FlyNoWay implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't fly");

	}

}
