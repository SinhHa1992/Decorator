package BuilderMeal;

public class Main {
	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal("");
		System.out.println("Veg Meal");
		vegMeal.showItem();
		vegMeal.getCost();

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal("");
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.showItem();
		nonVegMeal.getCost();
	}
}
