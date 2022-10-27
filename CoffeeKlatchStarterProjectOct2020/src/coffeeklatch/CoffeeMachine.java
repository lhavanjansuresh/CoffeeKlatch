    /* A fancy coffee maker.  Makes coffee of varying strengths. */
/**
 *
 * @author RDCOMP
 */
package coffeeklatch;

/**
 *
 * @author gordon.payne
 */
public class CoffeeMachine {
 // The current strength of the coffee.
    private String strength, name, size;
    boolean isThereWater = false, beansAdded = false, beansGrind = false;
    private int waterLevel = 0;
    
   
      //CoffeeKlatch cK = new CoffeeKlatch();

    /**
     * Set the strength of the Coffee to s; affects the fineness of the
     * grind.
     * "Weak", "Regular", "Strong" are the usual options for s, but you can
     * try others.
     * @param s Text Description of Strength
     */
    public void setStrength(String s) {
        strength = s;
    }
    
    public void getName(String n) {
        name = n;
    }
    public void setSize(String s) {
        size = s;
    }
    public void getStrength(String s) {
        strength = s;
    }
    /**
     * Grind the beans for the coffee
     */
    public void grindBeans() {
        
        if (beansAdded == true){
        System.out.println("Grinding beans for " +
            strength + " coffee.");
        beansGrind = true;
        }
        else {
            System.out.println("Please add beans!!");
        }
    }
    

    /**
     * Brew the coffee into given cup c
     * @param c The cup of coffee to be filled
     */
    public void brew(CoffeeCup c) {
        System.out.println("Brewing the coffee.");
        System.out.println("==Brewed "+strength+" coffee for " +name);
        c.fill();
        
    }
//    public void waterLevel() {
//        System.out.println(waterLevel);
//}
    public void pourCup (CoffeeCup cc){
        if (size == "small" && waterLevel >= 2 && cc.isFull()== false){
            waterLevel = waterLevel - 2;
            System.out.println(waterLevel);
            System.out.println("Pouring a cup of coffee.");
        }
        else if (size.equals("medium") && waterLevel >= 3 && cc.isFull()== false){
            waterLevel = waterLevel - 3;
            System.out.println("Pouring a cup of coffee.");
        }
        else if (size.equals("large") && waterLevel >= 4 && cc.isFull()== false) {
            waterLevel = waterLevel - 4;
            System.out.println("Pouring a cup of coffee.");
        }
        else if (cc.isFull()== true){
            System.out.println("Please drink coffee.");
        }
        else{
            isThereWater = false;
            beansAdded = false;
        }
        if (waterLevel == 0){
            isThereWater = false;
        }
    }
    
public boolean status() {
        if (isThereWater == true || beansAdded == true){
            return true;
        }
        else{
            return false;
        }
}

public void resetFlags() {
        isThereWater = false;
        beansAdded = false;
        beansGrind = false;
        waterLevel = 0;
}
    /**
     * Add water to the machine reservoir
     */
    public void addWater() {
        System.out.println("Adding Water");
        isThereWater = true;
        waterLevel = 10;
       
    }
    public boolean isThereWater() {
        if (isThereWater == true){
            return true;
        }
        else{
            return false;
        }
    }
    public int waterLevel (){
        return waterLevel;
    }


    /**
     * Add Beans to the Machine
     */
    public boolean addBeansBoolean() {
        boolean a = false;
        if (beansAdded == true){
        a = true;
        }
        else if (beansAdded == false){
            a = false;
        }
        return a;
    }
    
    public void addBeans() {
        
        if (addBeansBoolean() == false){
        System.out.println("Adding Beans");
        beansAdded = true;
        }
        else {
            System.out.println("Beans already added!");
        }
    }
    public boolean beansGround() {
        boolean a = false;
        if (addBeansBoolean() == false){
            beansGrind = false;
        a = false;
        }
        else if (beansGrind == true){
            a = true;
        }
        return a;
    }
}
