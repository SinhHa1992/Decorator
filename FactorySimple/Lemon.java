package FactorySimple;

public class Lemon implements ICoffeeShop{

	@Override
	public String getName() {
		return "Lemon";
	}

	@Override
	public int getCost() {
		return 5;
	}
}
