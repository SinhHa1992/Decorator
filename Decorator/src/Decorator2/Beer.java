package Decorator2;

public class Beer implements ICoffeeShop{

	@Override
	public String getName() {
		return "Beer";
	}

	@Override
	public int getCost() {
		return 10;
	}

}
