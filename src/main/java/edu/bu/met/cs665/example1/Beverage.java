package edu.bu.met.cs665.example1;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage {
    protected int basePrice=2;

    protected List<Condiment> condiments = new ArrayList<Condiment>();
    // this.condiments.add(new Milk());
    // this.condiments.add(new Sugar());

    abstract void setBasePrice(int basePrice) ;

    public int getBasePrice() {
        // Returns base price of the beverage
        return this.basePrice;
    }

    public void addMilk(int units){
        Condiment milk = this.condiments.get(0);
        milk.addQtyTaken(units);
    }

    public void addSugar(int units){
        Condiment sugar = this.condiments.get(1);
        sugar.addQtyTaken(units);
    }

    public List<Condiment> getCondiments() {
        // Returns condiments on this beverage
        return this.condiments;
    }

    public float getTotalPrice(){
        // Returns total price of the beverage = Baseprice + condimentPrice
        float extrasTotal = 0f;
        for(Condiment c : this.condiments){
            extrasTotal += c.getPrice()*c.getQtyTaken();
        }

        return this.basePrice+extrasTotal;
    }
}
