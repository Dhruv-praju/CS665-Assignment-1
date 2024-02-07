/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/05/2024
 * File Name: VendingMachine.java
 * Description: This class is responsible for the methods of Beverage Vending machine.
 */

package edu.bu.met.cs665.example1;

import java.util.HashMap;

public class VendingMachine {

    public Latte getLatteCoffee(){
        return new Latte();
    }

    /**
     *  addMilkToBeverage method adds given units of milk to specified beverage
     * @param units
     * @param bvg
     */
    public void addMilkToBeverage(int units, Beverage bvg){
        bvg.addMilk(units);
    }

    /**
     * addSugarToBeverage method adds given units of sugar to specified beverage
     * @param units
     * @param bvg
     */
    public void addSugarToBeverage(int units, Beverage bvg){
        bvg.addSugar(units);
    }
    
    /**
     *  getTotalBeveragePrice method returns Total price of the beverage
     * @param bvg
     * @return
     */
    public float getTotalBeveragePrice(Beverage bvg){
        return bvg.getTotalPrice();
    }
}
