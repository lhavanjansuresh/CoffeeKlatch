/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sureshlhavanjancoffeeklatch;

/**
 *
 * @author lhava
 */
public class CoffeeMachine {

    private String strength, name;
    private boolean isThereWater = false, beansAdded = false, beansGrind = false, coffeeBrewed = false;
    private int waterLevel = 0;

    //CoffeeKlatch cK = new CoffeeKlatch();
    /**
     * Set the strength of the Coffee to s; affects the fineness of the grind.
     * "Weak", "Regular", "Strong" are the usual options for s, but you can try
     * others.
     *
     * @param s Text Description of Strength
     * @return
     */
    public boolean setStrength(String s) {
        if (s.equals("w")) {
            strength = "weak";
            return true;
        } else if (s.equals("r")) {
            strength = "regular";
            return true;
        } else if (s.equals("s")) {
            strength = "strong";
            return true;
        } else {
            return false;
        }
    }

    public String getStrength() {
        return strength;
    }

    public void getName(String n) {
        name = n;
    }

    /**
     * Grind the beans for the coffee
     */
    public void grindBeans() {

        if (beansGrind == true) {
            System.out.println("Beans already grounded!");
        } else if (coffeeBrewed == true) {
            System.out.println("Please finish brewed batch.");
        } else if (beansAdded == true) {
            System.out.println("Grinding beans for "
                    + strength + " coffee.");
            beansGrind = true;
        } else {
            System.out.println("Please add beans!!");
        }
    }

    /**
     * Brew the coffee into given cup c
     *
     * @param c The cup of coffee to be filled
     */
    public void brew() {

        if (isThereWater == true && beansGrind == true) {
            resetFlags();
            waterLevel = 10;
            System.out.println("Brewing the coffee.");
            System.out.println("==Brewed " + strength + " coffee for " + name);
            coffeeBrewed = true;
        } else if (coffeeBrewed == true) {
            System.out.println("Already brewed.");

        } else {
            System.out.println("Please add water or grind beans first.");
        }
    }

    public int waterLevel() {
        return waterLevel;
    }

    public void addWater() {

        if (isThereWater == false && coffeeBrewed == false) {
            System.out.println("Adding Water");
            isThereWater = true;
        } else if (coffeeBrewed == true) {
            System.out.println("Please finish brewed batch.");
        } else {
            System.out.println("Water already added!");
        }
    }

    public void addBeans() {
        if (coffeeBrewed == true) {
            System.out.println("Please finish brewed batch.");
        } else if (beansAdded == false) {
            beansAdded = true;
            System.out.println("Adding beans");
        } else {
            System.out.println("Beans already added!");
        }

    }

    public boolean pourCup(String s) {
        if (s.equals("small") && waterLevel >= 2) {
            waterLevel = waterLevel - 2;
            System.out.println("Pouring a cup of coffee.");
            return true;
        } else if (s.equals("medium") && waterLevel >= 3) {
            waterLevel = waterLevel - 3;
            System.out.println("Pouring a cup of coffee.");
            return true;
        } else if (s.equals("large") && waterLevel >= 4) {
            waterLevel = waterLevel - 4;
            System.out.println("Pouring a cup of coffee.");
            return true;
        } else {
            return false;
        }
    }

    public boolean isThereWater() {
        return isThereWater;
    }

    public boolean brewedBoolean() {
        return coffeeBrewed;
    }

    public boolean beansGrinded() {
        return beansGrind;
    }

    public boolean beansBoolean() {
        return beansAdded;
    }

    public void resetFlags() {
        isThereWater = false;
        beansAdded = false;
        beansGrind = false;
        coffeeBrewed = false;
        waterLevel = 0;
    }

}
