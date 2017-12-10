/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 * @author Pham Hoai An
 * @version 1.0.1
 */
public class Ram extends ComputertDecorator{

    public Ram(ComputerShop mComputerShop) {
        super(mComputerShop);
    }

    @Override
    public String getName() {
       return mComputerShop.getName() + " Ram 4G ";
    }

    @Override
    public int getCost() {
       return mComputerShop.getCost() + 4;
    }
    
}
