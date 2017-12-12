package FactorySimple;

public class Fruit implements ICoffeeShop{

	@Override
	public String getName() {
		return "Fruit";
	}

	@Override
	public int getCost() {
		return 12;
	}

}
