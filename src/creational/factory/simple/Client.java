package creational.factory.simple;

public class Client {
	
	public static void main(String[] args) {
		
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		
		Pizza cheesePizza = store.orderPizza("cheese");
		Pizza veggiePizza = store.orderPizza("veggie");
	}

}
