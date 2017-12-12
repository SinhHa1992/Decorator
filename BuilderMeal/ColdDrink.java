package BuilderMeal;

public abstract class ColdDrink implements Item{

	@Override
	public Packing getPacking() {
		return new Bottle();
	}
	
	@Override
	public abstract float getPrice();
}
