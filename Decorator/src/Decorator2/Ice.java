package Decorator2;

public class Ice extends GradientsDecorator {

	public Ice(ICoffeeShop iCoffeeShop) {
		super(iCoffeeShop);
	}

	@Override
	public String getName() {
		return mCoffeeShop.getName() + " Ice";
	}

	@Override
	public int getCost() {
		return mCoffeeShop.getCost() + 3;
	}

}
