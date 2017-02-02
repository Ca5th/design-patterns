package structural.decorator;

public class GranolaTopping extends ToppingsDecorator {

	public GranolaTopping(BaseIceCream iceCreamToDecorate) {
		super(iceCreamToDecorate);
		this.price = 0.50;
	}

}
