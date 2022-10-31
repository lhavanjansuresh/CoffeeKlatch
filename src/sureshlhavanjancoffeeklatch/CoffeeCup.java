package sureshlhavanjancoffeeklatch;

/**
 * A coffee cup class
 * @author lhavanjan suresh
 */
public class CoffeeCup {

    //Private Variables
    private String name, size;
    private boolean isFull;

    /**
     * Checks if name parses to double. If not, return true and save to name variable.
     * @param n name of cup
     * @return true when name is valid string, else return false
     */
    public boolean name(String n) {
        try {
            Double.parseDouble(n); //Parse n 
        } catch (NumberFormatException e) {
            name = n; //set name to n
            return true;
        }
        return false;
    }

    /**
     * Checks if name is valid string. If so, return true and save to size variable
     * @param s size of the cup
     * @return true if valid size (s, m, l), else return false
     */
    public boolean size(String s) {
        if (s.equals("s")) {
            size = "small";
            return true;
        } else if (s.equals("m")) {
            size = "medium";
            return true;
        } else if (s.equals("l")) {
            size = "large";
            return true;
        } else {
            return false;
        }
    }

    /**
     * Cup size getter
     * @return size of the cup
     */
    public String sendSize() {
        return size;
    }

    /**
     * Returns whether this cup is full (true) or empty(false);
     * @return is this cup full?
     */
    public boolean isFull() {
        return isFull;
    }

    /**
     * Fill setter. Fills cup with coffee Fill the cup
     */
    public void fill() {
        isFull = true;
    }

    /**
     * empty setter. Empties cup of coffee Empties the cup
     */
    public void empty() {
        isFull = false;
    }

    /**
     * Drinks the cup of coffee
     * @return true if cup is full, else return false
     */
    public boolean drink() {
        if (isFull) {
            System.out.println(name + " You glug the coffee down.");
            isFull = false; //Set coffeecup to not full (false)
            return true;
        } else {
            System.out.println(name + " You sip furiously, but only suck air.");
            return false;
        }

    }
}
