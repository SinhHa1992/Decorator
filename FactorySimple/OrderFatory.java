package FactorySimple;

public class OrderFatory {
	private ICoffeeShop mCoffeeShop;
	private int mTotalMoney;
	private String mOrder = "";

	/**
	 * Calculator money & list item order
	 * */
	private void calculatorOrder() {
		mTotalMoney += mCoffeeShop.getCost();
		mOrder = mOrder + mCoffeeShop.getName() + " ";
	}

	/**
	 * Order drink water
	 * */
	public void orderDrink(String name) {
		switch (name) {
		case "Coffee":
			mCoffeeShop = new Coffee();
			calculatorOrder();
			break;
		case "MineralWater":
			mCoffeeShop = new MineralWater();
			calculatorOrder();
			break;
		case "Fruit":
			mCoffeeShop = new Fruit();
			calculatorOrder();
			break;
		default:
			System.out.println("404 " + name + " not found");
			break;
		}
	}

	/**
	 * Order gradient
	 * */
	public void orderGradient(String name) {
		switch (name) {
		case "Ice":
			mCoffeeShop = new Ice();
			calculatorOrder();
			break;
		case "Milk":
			mCoffeeShop = new Milk();
			calculatorOrder();
			break;
		case "Lemon":
			mCoffeeShop = new Lemon();
			calculatorOrder();
			break;
		default:
			System.out.println("404 " + name + " not found");
			break;
		}
	}

	/**
	 * Show all info of order: name & money
	 * */
	public void getOrder() {
		System.out.println(mOrder + ": " + mTotalMoney + "$");
	}

}
