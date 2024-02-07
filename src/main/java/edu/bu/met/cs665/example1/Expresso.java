package edu.bu.met.cs665.example1;

public class Expresso extends Coffee{
    public Expresso(){
        super.condiments.add(new Milk());
        super.condiments.add(new Sugar());
    }
    @Override
    void setBasePrice(int basePrice) {
        super.basePrice = basePrice;
    }
}
