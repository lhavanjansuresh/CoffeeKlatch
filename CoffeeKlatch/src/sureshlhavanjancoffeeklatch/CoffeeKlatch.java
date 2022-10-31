package sureshlhavanjancoffeeklatch;

import java.util.*; //Imports util class

/*
Assignment: Coffee Klatch
Teacher/Course: Mr.Payne/ICS4U1-01
Created By: Lhavanjan Suresh
Date: October 31, 2022

A coffee machine where a player is able to brew coffee of three strengths to a
cup of three sizes as well. Enjoy your cup of coffee!
*/

public class CoffeeKlatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Reference to a CoffeeMachine.
        CoffeeMachine cm = new CoffeeMachine();
        //Reference to a CoffeeCup.
        CoffeeCup cc = new CoffeeCup();

        //Create scanner class
        Scanner Keyboard = new Scanner(System.in);

        //Variables
        String name = "none", option = "", strength, size;
        boolean endGame = false, newCustomer = false, cont, redo;

        //while endGame is equal to false
        while (endGame == false) {
            do {
                redo = true; //Set redo to true
                //Coffee Machine Layout
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
                option = Keyboard.nextLine(); //Save players input into option variable

                //If option equals n,w,b,g,r,p,d or x
                if (option.equals("n") || option.equals("w")
                        || option.equals("b") || option.equals("g") || option.equals("r") || option.equals("p")
                        || option.equals("d") || option.equals("x")) {
                    //If option equals n
                    if (option.equals("n")) {
                        newCustomer = true; //Set newCustomer to true
                        redo = true; //Set redo to true
                      //Else if option equals x
                    } else if (option.equals("x")) {
                        newCustomer = true; //Set newCustomer to true
                        redo = true; //Set redo to true
                        endGame = true; //Set endGame to true
                    } 
                    //Else if newCustomer is equal to false
                    else if (newCustomer == false) {
                        System.out.println("Please add new customer!");
                        redo = false; //Set redo to false
                    }
                } else {
                    System.out.println("Please enter valid option.");
                    redo = false; //Set redo to false
                }
            //do-While newCustomer is equal to false or redo is equal to false
            } while (newCustomer == false || redo == false);
            //If endGame is equal to false
            if (endGame == false){
                //If option is equal to n
            if (option.equals("n")) {
                cc.empty(); //Call method from CoffeeCup and empty coffee cup
                cm.resetFlags(); //Call method from CoffeeMachine and reset flags/variables
                cont = false; //Set cont to false
                //while cont is equal to false
                while (cont == false) {
                    System.out.print("What is your name? ");
                    name = Keyboard.nextLine(); //Save players input to name variable
                    //If the method name in CoffeeCup with parameter name is equal to true
                    if (cc.name(name) == true) {
                        cont = true; //Set cont to true
                        cm.getName(name); //Call getName method from CoffeeMachine with parameter name to save name in that class
                    } else {
                        System.out.println("Please enter only alphabets.");
                    }
                }
                cont = false; //Set cont to false
                
                //While cont is equal to false
                while (cont == false) {
                    System.out.print("What size: small (s), medium (m), large (l): ");
                    size = Keyboard.nextLine(); //Saves players input to size variable
                    //If size method from CoffeeCup with parameter size is equal to true
                    if (cc.size(size) == true) {
                        cont = true; //Set cont to true
                    } else {
                        System.out.println("Please write a vailid string (s,m,l).");
                    }
                }
                cont = false; //Set cont to false

                //while cont is equal to false
                while (cont == false) {
                    System.out.print("How strong do you want the coffee: weak (w), regular (r) or strong (s): ");
                    strength = Keyboard.nextLine(); //Save players input to strength variable
                    //If setStrength method from CoffeeMachine with parameters strength is equal to true
                    if (cm.setStrength(strength) == true) {
                        cont = true; //Set cont to true
                    } else {
                        System.out.println("Please write a vailid string (w,r,s).");
                    }
                }
            }
            //Else if option is equal to w
            else if (option.equals("w")) {
                cm.addWater(); //Call addWater method from CoffeeMachine to add water
            //Else if option is equal to b
            } else if (option.equals("b")) {
                cm.addBeans(); //Call addBeans method from CoffeeMachine to add beans
            //Else if option is equal to g
            } else if (option.equals("g")) {
                cm.grindBeans(); //Call grindBeans method from CoffeeMachine to grind beans
            //Else if option is equal to r
            } else if (option.equals("r")) {
                cm.brew(); //Call brew method from CoffeeMachine to brew coffee
            //Else if option is equal to p
            } else if (option.equals("p")) {
                //If method isFull from CoffeeCup is true (cup is full)
                if (cc.isFull() == true) {
                    System.out.println("Cup is full! Please drink!");
                } else {
                    //If pourCup method from CoffeeMachine with parameters of size is true
                    if (cm.pourCup(cc.sendSize())) {
                        cc.fill(); //Fill coffee cup with coffee
                    //Else if coffee level is greater than 0
                    } else if (cm.waterLevel() > 0) {
                        System.out.println("Not enough batch. Resetting flags.");
                        cm.resetFlags(); //Reset flags/variables
                    } else {
                        System.out.println("Please make the coffee before pouring!");
                    }
                }
            //Else if option is equal to d
            } else if (option.equals("d")) {
                cc.drink(); //Drink the coffee from the coffee cup
            //Else if option is equal to x
            } else if (option.equals("x")) {
                endGame = true; //Set endGame to true
            }
            }
        }
    }
}