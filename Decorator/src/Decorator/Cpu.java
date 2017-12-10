/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 * @author Pham Hoai An
 * @since 10/12/2017
 * @version 1.0.1
 */
public class Cpu implements ComputerShop{

    @Override
    public String getName() {
        return "CPU Alienware";
    }

    /**
     *@return is value base of one CPU;
     */
    @Override
    public int getCost() {
        return 10;
    }
    
}
