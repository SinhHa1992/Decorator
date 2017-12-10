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
public abstract class ComputertDecorator implements ComputerShop{
    protected ComputerShop mComputerShop;

    public ComputertDecorator(ComputerShop mComputerShop) {
        this.mComputerShop = mComputerShop;
    }
    
    
}
