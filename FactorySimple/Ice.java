package FactorySimple;

public class Ice implements ICoffeeShop{

	@Override
	public String getName() {
		return "Ice";
	}

	@Override
	public int getCost() {
		return 2;
	}

}
