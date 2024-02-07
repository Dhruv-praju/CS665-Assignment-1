/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/05/2024
 * File Name: VendingMachine.java
 * Description: This class is responsible for the methods and attributes of a Person.
 */

package edu.bu.met.cs665.example1;

import java.util.HashMap;

public class VendingMachine {

    public Latte getLatteCoffee(){
        return new Latte();
    }

    public void addMilkToBeverage(int units, Beverage bvg){
        // This method adds Milk Condiment to the Beverage
        
        bvg.addMilk(units);
    }

    public void addSugarToBeverage(int units, Beverage bvg){
        bvg.addSugar(units);
    }

    public float getTotalBeveragePrice(Beverage bvg){
        return bvg.getTotalPrice();
    }
}
