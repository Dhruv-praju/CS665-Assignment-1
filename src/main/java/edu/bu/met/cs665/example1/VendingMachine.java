/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/05/2024
 * File Name: VendingMachine.java
 * Description: This class is responsible for the methods of Beverage Vending machine. The client will interact with this class only.
 */

package edu.bu.met.cs665.example1;

public class VendingMachine {
    /**
     * makeLatteCoffee returns Latte object
     * @return
     */
    public Latte makeLatteCoffee(){
        return new Latte();
    }

    /**
     * makeExpressoCoffee returns Expresso object
     * @return
     */
    public Expresso makeExpressoCoffee(){
        return new Expresso();
    }

    /**
     * makeAmericanoCoffee returns Expresso object
     * @return
     */
    public Americano makeAmericanoCoffee(){
        return new Americano();
    }

    /**
     * makeBlackTea returns Expresso object
     * @return
     */
    public BlackTea makeBlackTea(){
        return new BlackTea();
    }

    /**
     * makeYellowTea returns Expresso object
     * @return
     */
    public YellowTea makeYellowTea(){
        return new YellowTea();
    }

    /**
     * makeGreenTea returns Expresso object
     * @return
     */
    public GreenTea makeGreenTea(){
        return new GreenTea();
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
     * getBeverageBasePrice returns base price of the given beverage
     * @param bvg
     * @return
     */
    public int getBeverageBasePrice(Beverage bvg){
        return bvg.getBasePrice();
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
