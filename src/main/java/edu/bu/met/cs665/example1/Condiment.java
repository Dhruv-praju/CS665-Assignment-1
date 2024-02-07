package edu.bu.met.cs665.example1;

public abstract class Condiment {
    protected float price=0.5f;
    private int qtyTaken=0;
    private int maxQty=3;

    abstract void setPrice(float price);

    public void setMaxQty(int qty){
        this.maxQty=qty;
    }
    public void addQtyTaken(int num){
        // This method add given number of qty to the existing qty of the condiment taken
        int possibleQty = this.maxQty - this.qtyTaken;
        if(num>=possibleQty){
            this.qtyTaken = this.maxQty;
        }
        else{
            this.qtyTaken += num;
        }
    }
    public float getPrice() {
        return price;
    }
    public int getMaxQty() {
        return maxQty;
    }
    public int getQtyTaken() {
        return qtyTaken;
    }
}
