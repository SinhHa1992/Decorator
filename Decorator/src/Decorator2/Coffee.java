package Decorator2;

public class Coffee implements ICoffeeShop{

	@Override
	public String getName() {
		return "Coffee";
	}

	@Override
	public int getCost() {
		return 5;
	}

}
