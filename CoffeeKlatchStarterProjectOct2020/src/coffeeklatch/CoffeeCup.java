
/**
 * A coffee cup
 * In part 2, additional information will be added to this cup
 * @author RD
 */
package coffeeklatch;

/**
 *
 * @author gordon.payne
 */
public class CoffeeCup {
    
    String name,size;

   
    
    
     private boolean isFull;  // Is this cup full?  Default value false.

    /**
     * Returns whether this cup is full (true) or empty(false);
     * @return is this cup full?
     */
    public boolean isFull() {
        return isFull;
    }
    
    /**
     * Fill this cup to the top
     */
    public void fill() {
        isFull = true;
    }
    
    
    public void getName(String n) {
        name = n;
    }
    public void setSize(String s) {
        size = s;
    }
    
    /**
     * Drink this cup entirely
     */
    public boolean drink() {
        if (isFull) {
            System.out.println(name+" You glug the coffee down.");
            isFull = false;
            return true;
        } else {
            System.out.println(name+" You sip furiously, but only suck air.");
            return false;
        }

    }
}
