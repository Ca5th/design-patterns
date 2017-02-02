package structural.decorator;

public abstract class ToppingsDecorator extends BaseIceCream {
	
	protected BaseIceCream iceCream;
	
	public ToppingsDecorator(BaseIceCream iceCreamToDecorate){
		this.iceCream = iceCreamToDecorate;
	}
	
	@Override
	public double getPrice() {
		return this.price+ iceCream.getPrice();
	}
}
