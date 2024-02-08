/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/06/2024
 * File Name: Milk.java
 * Description: This class is responsible for the methods and attributes of Sugar. It is a subclass of Condiment.
 */
package edu.bu.met.cs665.example1;

public class Sugar extends Condiment{
    /**
     * Setter method to set price of sugar
     */
    @Override
    void setPrice(float price) {
        super.price = price;
    }
}
