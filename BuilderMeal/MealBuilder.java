package BuilderMeal;

public class MealBuilder {
	
	/**
	 * Prepare Vegetarian Meal with VegBuger or Coke
	 * */
	public Meal prepareVegMeal(String item) {
		Meal meal = new Meal();
		switch(item){
		case "VegBurger":
			meal.addItem(new VegBurger());
			break;
		case "Coke":
			meal.addItem(new Coke());
			break;
		}
		
		return meal;
	}
	
	/**
	 * Prepare Non Vegetarian Meal with ChickenBuger and Pepsi
	 * */
	public Meal prepareNonVegMeal(String item) {
		Meal meal = new Meal();
	
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}

}
