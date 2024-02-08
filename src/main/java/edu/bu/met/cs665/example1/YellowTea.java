/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/06/2024
 * File Name: YellowTea.java
 * Description: This class is responsible for YellowTea properties and behaviour.This class is a subclass of Tea class. 
 */
package edu.bu.met.cs665.example1;

public class YellowTea extends Tea{
    public YellowTea(){
        super.condiments.add(new Milk());
        super.condiments.add(new Sugar());
    }
    
    /**
     * Setter method to set base price of Yellow Tea
     */
    @Override
    void setBasePrice(int basePrice) {
        super.basePrice = basePrice;
    }
}
