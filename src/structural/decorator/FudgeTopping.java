package structural.decorator;

public class FudgeTopping extends ToppingsDecorator {

	public FudgeTopping(BaseIceCream iceCreamToDecorate) {
		super(iceCreamToDecorate);
		this.price = 1.50;
	}

}
