package Decorator;

public class Main {

	public static void main(String[] args) {
		ICoffeeShop item = new Ice(new Ice(new Lemon(new Matcha(new Milk()))));
		ICoffeeShop item1 = new Ice(new Lemon(new Matcha(new Beer())));

		System.out.println("item: ");
		System.out.print(item.getName() + ": ");
		System.out.println(item.getCost());

		System.out.println("item1: ");
		System.out.print(item1.getName() + ": ");
		System.out.println(item1.getCost());

		ICoffeeShop item3 = new Coffee();

		for (int i = 0; i < 5; i++) {
			item3 = new Ice(item3);
		}

		System.out.println("item3: ");
		System.out.print(item3.getName() + ": ");
		System.out.println(item3.getCost());
	}

}
