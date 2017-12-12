package FactoryAbstract;

public class MainAnimal {
	public static void main(String[] args) {
		 
		Panther li = new Panther();
		System.out.println(li.eatFood(new Wildebeest()));
		System.out.println(li.eatFood(new Deer()));
		System.out.println(li.eatFood(new Bison()));
		
		Wolf wo = new Wolf();
		System.out.println(wo.eatFood(new Wildebeest()));
		System.out.println(wo.eatFood(new Deer()));
		System.out.println(wo.eatFood(new Bison()));
	}
}
