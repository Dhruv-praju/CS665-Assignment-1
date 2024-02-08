package edu.bu.met.cs665;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import edu.bu.met.cs665.example1.VendingMachine;
import edu.bu.met.cs665.example1.YellowTea;
import edu.bu.met.cs665.example1.Beverage;
import edu.bu.met.cs665.example1.Coffee;
import edu.bu.met.cs665.example1.Latte;
import edu.bu.met.cs665.example1.Tea;


public class TestMachine {
    public TestMachine(){

    }

    @Test
    public void testMakeBeverage(){
        VendingMachine vm = new VendingMachine();

        Coffee myExpresso = vm.makeExpressoCoffee();
        Latte myLatte = vm.makeLatteCoffee();
        Beverage myAmericano = vm.makeAmericanoCoffee();

        Tea myBlacktea = vm.makeBlackTea();
        YellowTea myTea = vm.makeYellowTea();
        
    }

    @Test
    public void testAddCondimentsToBeverage(){
        VendingMachine vm = new VendingMachine();

        Coffee myLatte = vm.makeLatteCoffee();

        vm.addMilkToBeverage(2, myLatte);

    }

    @Test
    public void testBeveragePrice(){
        VendingMachine vm = new VendingMachine();

        Coffee myLatte = vm.makeLatteCoffee();
        
        assertEquals(2, vm.getBeverageBasePrice(myLatte),0);
    }


    @Test
    public void testBeverageTotalPrice(){
        VendingMachine vm = new VendingMachine();

        Coffee myLatte = vm.makeLatteCoffee();
        vm.addMilkToBeverage(2, myLatte);
        vm.addSugarToBeverage(1, myLatte);
        
        // System.out.println(myLatte.getTotalPrice());
        assertEquals(3.5, vm.getTotalBeveragePrice(myLatte), 0);
    }

    @Test
    public void testAddAboveLimitCondiments(){
        VendingMachine vm = new VendingMachine();

        Coffee myLatte = vm.makeLatteCoffee();
        vm.addMilkToBeverage(4, myLatte);
        vm.addSugarToBeverage(4, myLatte);


        // System.out.println(myLatte.getTotalPrice());
        assertEquals(5, vm.getTotalBeveragePrice(myLatte), 0);
    }
}
