package trungbanh.com.decorator.Coffe;

/**
 * Created by banhtrung on 12/3/2017.
 */

public class gradient extends Coffe {

    Coffe c = null ;

    public gradient(Coffe c) {
        this.c = c ;
    }
    public int getCost () {
        return c.getCost();
    }

}
