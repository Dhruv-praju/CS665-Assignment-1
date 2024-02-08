/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/07/2024
 * File Name: Main.java
 * Description: The class contain main method
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.Latte;
import edu.bu.met.cs665.example1.Tea;
import edu.bu.met.cs665.example1.VendingMachine;

/**
 * This is the Main class.
 */
public class Main {

  public static void main(String[] args) {
    System.out.println("This is a test message from the Main class (Main.java file)");
    
    VendingMachine vm = new VendingMachine();
    Tea myTea = vm.makeBlackTea();

    
  }

}
