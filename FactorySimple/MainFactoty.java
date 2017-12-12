package FactorySimple;

public class MainFactoty {
	public static void main(String[] args) {
		OrderFatory order = new OrderFatory();
		order.orderDrink("Coffee");
		order.orderDrink("Fruit");
		order.orderGradient("Ice");
		order.orderGradient("Lemodn");

		order.getOrder();
	}
}
