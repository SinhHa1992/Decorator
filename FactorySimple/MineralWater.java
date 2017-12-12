package FactorySimple;

public class MineralWater implements ICoffeeShop{

	@Override
	public String getName() {
		return "Mineral Water";
	}

	@Override
	public int getCost() {
		return 8;
	}

}
