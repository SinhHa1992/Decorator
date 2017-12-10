package Decorator2;

public class Lemon extends GradientsDecorator {

	public Lemon(ICoffeeShop iCoffeeShop) {
		super(iCoffeeShop);
	}

	@Override
	public String getName() {
		return mCoffeeShop.getName() + " Lemon";
	}

	@Override
	public int getCost() {
		return mCoffeeShop.getCost() + 4;
	}

}
