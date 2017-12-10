package Decorator;

/**
 * @author phamh
 * @since 10/12/2017
 * @version 1.0.1
 */
public class Main {
    public static void main(String[] args) {
        ComputerShop computerShop = new Cpu();
        
        for(int i = 0; i < 5; i++){
            computerShop = new Ram(computerShop);
        }
        //ComputerShop computerShop =  new Ram(new Ram(new Cpu()));
        System.out.println("All product: " + computerShop.getName());
        System.out.println("Total money: " + computerShop.getCost());
    }
}
