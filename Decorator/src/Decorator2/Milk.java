package Decorator2;

public class Milk implements ICoffeeShop{

	@Override
	public String getName() {
		return "Milk";
	}

	@Override
	public int getCost() {
		return 8;
	}

}
