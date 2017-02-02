package creational.factory.method;

public class Client {
	
	public static void main(String[] args) {
		
		PizzaStore nyStore = new NYStylePizzaStore();
		
		nyStore.orderPizza("cheese");
		nyStore.orderPizza("veggie");
		
		PizzaStore chiStore = new ChicagoStylePizzaStore();
		
		chiStore.orderPizza("cheese");
		chiStore.orderPizza("veggie");
	}

}
