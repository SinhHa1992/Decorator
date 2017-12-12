package atgroups.orderdecorator.Model;

/**
 * Created by Au Nguyen on 12/3/2017.
 */

public class Coffee implements Drink{

    private int mCostCoffee = 10;

    @Override
    public double getCost(){
        return mCostCoffee;
    }
}
