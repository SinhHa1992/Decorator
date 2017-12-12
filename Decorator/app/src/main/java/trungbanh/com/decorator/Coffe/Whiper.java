package trungbanh.com.decorator.Coffe;

/**
 * Created by banhtrung on 12/3/2017.
 */

public class Whiper extends gradient {
    int cost = 3 ;

    public Whiper(Coffe c) {
        super(c);
    }

    public int getCost (){
        return cost + super.getCost() ;
    }
}
