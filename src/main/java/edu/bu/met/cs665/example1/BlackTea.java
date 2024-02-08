/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/06/2024
 * File Name: BlackTea.java
 * Description: This class is responsible for BlackTea properties and behaviour.This class is a subclass of Tea class. 
 */
package edu.bu.met.cs665.example1;

public class BlackTea extends Tea{
    public BlackTea(){
        super.condiments.add(new Milk());
        super.condiments.add(new Sugar());
    }
    
    /**
     * Setter method to set base price of Black Tea
     */
    @Override
    void setBasePrice(int basePrice) {
        super.basePrice = basePrice;
    }
}
