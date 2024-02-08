/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/06/2024
 * File Name: Condiment.java
 * Description: This class is responsible for the methods and attributes of a Condiment. This class is a member of Beverage class
 */

package edu.bu.met.cs665.example1;

public abstract class Condiment {
    protected float price=0.5f;
    private int qtyTaken=0;
    private int maxQty=3;

    abstract void setPrice(float price);
    /**
     * Setter method for qtyTaken
     * @param qty
     */
    public void setMaxQty(int qty){
        this.maxQty=qty;
    }
    
    /**
     * addQtyTaken method add given quantity to the existing qty of the condiment taken
     * @param num
     */
    public void addQtyTaken(int num){
        int possibleQty = this.maxQty - this.qtyTaken;
        if(num>=possibleQty){
            this.qtyTaken = this.maxQty;
        }
        else{
            this.qtyTaken += num;
        }
    }

    /**
     * Getter method that returns base price
     * @return
     */
    public float getPrice() {
        return this.price;
    }

    /**
     * Getter method for maxQty
     * @return
     */
    public int getMaxQty() {
        return this.maxQty;
    }

    /**
     * Getter method for qtyTaken
     * @return
     */
    public int getQtyTaken() {
        return this.qtyTaken;
    }
}
