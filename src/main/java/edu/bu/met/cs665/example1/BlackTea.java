package edu.bu.met.cs665.example1;

public class BlackTea extends Tea{
    public BlackTea(){
        super.condiments.add(new Milk());
        super.condiments.add(new Sugar());
    }
    @Override
    void setBasePrice(int basePrice) {
        super.basePrice = basePrice;
    }
}
