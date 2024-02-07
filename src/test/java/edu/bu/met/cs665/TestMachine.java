package edu.bu.met.cs665;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.met.cs665.example1.VendingMachine;
import edu.bu.met.cs665.example1.Coffee;

public class TestMachine {
    public TestMachine(){

    }

    @Test
    public void testMakeBeverage(){
        VendingMachine vm = new VendingMachine();

        vm.getLatteCoffee();
    }

    @Test
    public void testAddCondimentsToBeverage(){
        VendingMachine vm = new VendingMachine();

        Coffee myLatte = vm.getLatteCoffee();
        System.out.println("MADE THE LATTE");

        vm.addMilkToBeverage(2, myLatte);

        System.out.println("ADDED 2 UNITS MILK");
    }


    @Test
    public void testBeveragePrice(){
        VendingMachine vm = new VendingMachine();

        Coffee myLatte = vm.getLatteCoffee();
        vm.addMilkToBeverage(2, myLatte);
        vm.addSugarToBeverage(1, myLatte);
        
        System.out.println(myLatte.getTotalPrice());
        assertEquals(3.5, vm.getTotalBeveragePrice(myLatte), 0);
    }

    @Test
    public void testEdgeCase(){
        VendingMachine vm = new VendingMachine();

        Coffee myLatte = vm.getLatteCoffee();
        vm.addMilkToBeverage(4, myLatte);
        vm.addSugarToBeverage(4, myLatte);


        System.out.println(myLatte.getTotalPrice());
        assertEquals(5, vm.getTotalBeveragePrice(myLatte), 0);
    }
}
