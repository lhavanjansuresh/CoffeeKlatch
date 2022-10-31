package sureshlhavanjancoffeeklatch;

/**
 * A coffee machine class
 * @author lhavanjan suresh
 */
public class CoffeeMachine {

    //Private variables
    private String strength, name;
    private boolean isThereWater = false, beansAdded = false, beansGrind = false, coffeeBrewed = false;
    private int waterLevel = 0;

    /**
     * Checks if strength is valid input. If so, save to strength variable.
     * @param s strength of the coffee
     * @return true if valid input (w,r,s), else return false
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

    /**
     * coffee strength getter
     * @return strength string
     */
    public String getStrength() {
        return strength;
    }

    /**
     * Patient name setter. Saves to name variable.
     * @param n name of cup
     */
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
     * Brew the coffee
     */
    public void brew() {
        if (isThereWater == true && beansGrind == true) {
            resetFlags(); //Calls method to reset all variables
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
    
    /**
     * Coffee level getter
     * @return waterLevel (coffeeLevel)
     */
    public int waterLevel() {
        return waterLevel;
    }

    /**
     * Add water into coffee machine
     */
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

    /**
     * Add beans into coffee machine
     */
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

    /**
     * Pour a cup of coffee into coffeeCup
     * @param s Size of the cup
     * @return true if enough waterLevel (coffee), else return false
     */
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

    /**
     * isThereWater boolean getter
     * @return isThereWater variable (water added)
     */
    public boolean isThereWater() {
        return isThereWater;
    }

    /**
     * BrewedBoolean boolean getter 
     * @return coffeeBrewed variable (coffee brewed)
     */
    public boolean brewedBoolean() {
        return coffeeBrewed;
    }

    /**
     * BeansGrinded boolean getter
     * @return beansGrind variable (if beans were grounded)
     */
    public boolean beansGrinded() {
        return beansGrind;
    }

    /**
     * Beans Boolean getter
     * @return beansAdded variable (if beans were added)
     */
    public boolean beansBoolean() {
        return beansAdded;
    }

    /**
     * Reset all the variable. (used for new customer/new batch)
     */
    public void resetFlags() {
        isThereWater = false;
        beansAdded = false;
        beansGrind = false;
        coffeeBrewed = false;
        waterLevel = 0;
    }

}