package structural.decorator;

public class OreoTopping extends ToppingsDecorator {

	public OreoTopping(BaseIceCream iceCreamToDecorate) {
		super(iceCreamToDecorate);
		this.price = 0.99;
	}

}
