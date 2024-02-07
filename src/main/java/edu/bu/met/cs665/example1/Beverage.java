/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/05/2024
 * File Name: Beverage.java
 * Description: This class is responsible for the methods and attributes of a Beverage.
 */

package edu.bu.met.cs665.example1;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage {
    protected int basePrice=2;

    protected List<Condiment> condiments = new ArrayList<Condiment>();

    abstract void setBasePrice(int basePrice) ;
    /**
     * Getter method returns base price of the beverage
     * @return
     */
    public int getBasePrice() {
        return this.basePrice;
    }
    
    /**
     * addMilk method adds given units of milk condiment
     * @param units
     */
    public void addMilk(int units){
        Condiment milk = this.condiments.get(0);
        milk.addQtyTaken(units);
    }

    /**
     * addSugar method adds given units of sugar condiment
     * @param units
     */
    public void addSugar(int units){
        Condiment sugar = this.condiments.get(1);
        sugar.addQtyTaken(units);
    }

    /**
     * getCondiments method returns condiments on this beverage
     * @return
     */
    public List<Condiment> getCondiments() {
        return this.condiments;
    }

    /**
     * getTotalPrice returns total price. i.e.Baseprice + condimentsPrice
     * @return
     */
    public float getTotalPrice(){
        float extrasTotal = 0f;
        for(Condiment c : this.condiments){
            extrasTotal += c.getPrice()*c.getQtyTaken();
        }

        return this.basePrice+extrasTotal;
    }
}
