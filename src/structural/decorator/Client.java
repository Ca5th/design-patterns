package structural.decorator;

public class Client {

	public static void main(String[] args) {
		
		StrawberryIceCream iceCream = new StrawberryIceCream();
		System.out.println("Got Strawberry ice cream for " + iceCream.getPrice());
		
		FudgeTopping iceCreamWithFudge = new FudgeTopping(iceCream);
		System.out.println("Added Fudge topping. Now I'm paying " + iceCreamWithFudge.getPrice());
		
		GranolaTopping iceCreamWithFudgeAndGranola = new GranolaTopping(iceCreamWithFudge);
		System.out.println("Added Granola topping. Now I'm paying " + iceCreamWithFudgeAndGranola.getPrice());

	}

}
