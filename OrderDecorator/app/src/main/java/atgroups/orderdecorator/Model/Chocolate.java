package atgroups.orderdecorator.Model;

/**
 * Created by Au Nguyen on 12/3/2017.
 */

public class Chocolate extends Gradient {

    private int mCostChocolate = 2;

    public Chocolate(Drink drink) {
        super(drink);
    }

    @Override
    public double getCost() {
        return mCostChocolate + super.getCost();
    }
}
