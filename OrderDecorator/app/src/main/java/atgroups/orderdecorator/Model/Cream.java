package atgroups.orderdecorator.Model;

/**
 * Created by Au Nguyen on 12/3/2017.
 */

public class Cream extends Gradient {

    private int mCostCream = 1;

    public Cream(Drink drink) {
        super(drink);
    }

    @Override
    public double getCost() {
        return mCostCream + super.getCost();
    }
}
