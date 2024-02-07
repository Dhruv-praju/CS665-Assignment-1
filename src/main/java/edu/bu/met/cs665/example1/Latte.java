package edu.bu.met.cs665.example1;

public class Latte extends Coffee{
    public Latte(){
        super.condiments.add(new Milk());
        super.condiments.add(new Sugar());
    }
    @Override
    void setBasePrice(int basePrice) {
        super.basePrice = basePrice;
    }
}
