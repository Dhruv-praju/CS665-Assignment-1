/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/06/2024
 * File Name: Expresso.java
 * Description: This class is responsible for Expresso properties and behaviour.This class is a subclass of Coffee class.
 */

package edu.bu.met.cs665.example1;

public class Expresso extends Coffee{
    public Expresso(){
        super.condiments.add(new Milk());
        super.condiments.add(new Sugar());
    }
    
    /**
     * Setter method to set base price of Expresso Coffee
     */
    @Override
    void setBasePrice(int basePrice) {
        super.basePrice = basePrice;
    }
}
