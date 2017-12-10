package Decorator2;

public abstract class GradientsDecorator implements ICoffeeShop{

	protected ICoffeeShop mCoffeeShop;
	
	public GradientsDecorator(ICoffeeShop iCoffeeShop) {
		this.mCoffeeShop = iCoffeeShop;
	}
	
}
