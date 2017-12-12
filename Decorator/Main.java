package Decorator;

public class Main {

	public static void main(String[] args) {
		ICoffeeShop icoffee = new Ice(new Matcha(new Coffee()));
		System.out.println(icoffee.getName());
		System.out.println(icoffee.getCost());

	}

}
