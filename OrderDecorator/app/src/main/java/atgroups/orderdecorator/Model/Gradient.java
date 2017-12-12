package atgroups.orderdecorator.Model;

/**
 * Created by Au Nguyen on 12/3/2017.
 */

public abstract class Gradient implements Drink {

    protected Drink drink;

    public Gradient(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double getCost() {
        return this.drink.getCost();
    }
}
