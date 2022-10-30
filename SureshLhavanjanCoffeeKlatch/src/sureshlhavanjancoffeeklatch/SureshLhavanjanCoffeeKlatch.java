/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sureshlhavanjancoffeeklatch;

import java.util.*;

public class SureshLhavanjanCoffeeKlatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare a reference to a CoffeeMachine.

        CoffeeMachine cm = new CoffeeMachine();
        CoffeeCup cc = new CoffeeCup();

        // Create a new CoffeeMachine and make the variable refer to it.
        Scanner Keyboard = new Scanner(System.in);

        String name = "none", option = "", strength, size;
        boolean endgame = false, newCustomer = false, cont, redo = false;

        while (endgame == false) {
            do {
                System.out.println("                                               MACHINE                 "
                        + "             USER: " + name + "    "
                        + "Cup Size: " + cc.sendSize() + "\n                          Water      Level"
                        + "      Beans     BeansGround     CoffeeBrewed     Cup Full     Strength \n"
                        + "                          " + cm.isThereWater() + "       " + cm.waterLevel() + "         "
                        + cm.beansBoolean() + "        " + cm.beansGrinded() + "           " + cm.brewedBoolean() + "          " + cc.isFull() + "         " + cm.getStrength() + " \nOPTION: n - New Customer\n        w - Add Water\n"
                        + "        b - Add Coffee Beans\n        g - Grind Beans\n        "
                        + "r - Brew Coffee\n        p - Pour a cup\n        d - Drink a Cup\n"
                        + "        x - Exit");

                System.out.print("                 Your Choice? ");
                option = Keyboard.nextLine();

                if (option.equals("n") || option.equals("w")
                        || option.equals("b") || option.equals("g") || option.equals("r") || option.equals("p")
                        || option.equals("d") || option.equals("x")) {

                    if (option.equals("n")) {
                        newCustomer = true;
                        redo = true;
                    } else if (option.equals("x")) {
                        newCustomer = true;
                        redo = true;
                        endgame = true;
                    } 
                    else if (newCustomer == false) {
                        System.out.println("Please add new customer!");
                        redo = false;
                    }

                } else {
                    System.out.println("Please enter valid option.");
                    redo = false;
                }
            } while (newCustomer == false || redo == false);
            if (endgame == false){
            if (option.equals("n")) {
                cc.empty();
                cm.resetFlags();
                cont = false;
                while (cont == false) {
                    System.out.print("What is your name? ");
                    name = Keyboard.nextLine();
                    if (cc.name(name) == true) {
                        cont = true;
                        cm.getName(name);
                    } else {
                        System.out.println("Please enter only alphabets.");
                    }
                }
                cont = false;

                while (cont == false) {
                    System.out.print("What size: small (s), medium (m), large (l): ");
                    size = Keyboard.nextLine();
                    if (cc.size(size) == true) {
                        cont = true;
                    } else {
                        System.out.println("Please write a vailid string (s,m,l).");
                    }
                }
                cont = false;

                while (cont == false) {
                    System.out.print("How strong do you want the coffee: weak (w), regular (r) or strong (s): ");
                    strength = Keyboard.nextLine();
                    if (cm.setStrength(strength) == true) {
                        cont = true;
                    } else {
                        System.out.println("Please write a vailid string (w,r,s).");
                    }
                }
            } //cont = false;
            else if (option.equals("w")) {
                cm.addWater();
            } else if (option.equals("b")) {
                cm.addBeans();
            } else if (option.equals("g")) {
                cm.grindBeans();
            } else if (option.equals("r")) {
                cm.brew();
            } else if (option.equals("p")) {

                if (cc.isFull() == true) {
                    System.out.println("Cup is full! Please drink!");
                } else {
                    if (cm.pourCup(cc.sendSize())) {
                        cc.fill();
                    } else if (cm.waterLevel() > 0) {
                        System.out.println("Not enough batch. Resetting flags.");
                        cm.resetFlags();
                    } else {
                        System.out.println("Please make the coffee before pouring!");
                    }
                }
            } else if (option.equals("d")) {
                cc.drink();
            } else if (option.equals("x")) {
                endgame = true;
            }
            }
        }
    }
}
