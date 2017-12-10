package Decorator;

public class Matcha extends GradientsDecorator {

	public Matcha(ICoffeeShop iCoffeeShop) {
		super(iCoffeeShop);
	}

	@Override
	public String getName() {
		return mCoffeeShop.getName() + " Matcha";
	}

	@Override
	public int getCost() {
		return mCoffeeShop.getCost() + 8;
	}

}
