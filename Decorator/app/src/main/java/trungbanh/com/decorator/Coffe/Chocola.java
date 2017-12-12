package trungbanh.com.decorator.Coffe;

/**
 * Created by banhtrung on 12/3/2017.
 */

public class Chocola extends gradient {

    int cost = 2 ;

    public Chocola(Coffe c) {
        super(c);
    }

    public int getCost (){
        return  cost+super.getCost() ;
    }
}
