/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/06/2024
 * File Name: Americano.java
 * Description: This class is responsible for Latte Macchiato properties and behaviour.This class is a subclass of Coffee class. 
 */

package edu.bu.met.cs665.example1;

public class Latte extends Coffee{
    public Latte(){
        super.condiments.add(new Milk());
        super.condiments.add(new Sugar());
    }
    
    /**
     * Setter method to set base price of Americano Coffee
     */
    @Override
    void setBasePrice(int basePrice) {
        super.basePrice = basePrice;
    }
}
