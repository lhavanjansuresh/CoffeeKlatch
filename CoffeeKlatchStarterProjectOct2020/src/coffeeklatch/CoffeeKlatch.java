// PUBLIC METHODS REQUIRE OBJECTS WHILE STATIC METHODS CAN BE CALLED 
package coffeeklatch;

import java.util.*;

/**
 *
 * @author gordon.payne
 */
public class CoffeeKlatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare a reference to a CoffeeMachine.

        CoffeeMachine cm = new CoffeeMachine();
        CoffeeCup cc = new CoffeeCup();

        // Create a new CoffeeMachine and make the variable refer to it.
        Scanner Keyboard = new Scanner(System.in);

        String strength = "none", name = "none", size = "none", option = "";
        boolean endgame = false , newCustomer = false;
        

      while (endgame == false){
       if (cm.status() == false){
                cm.resetFlags();
                System.out.println("Reseting flags...");
            }
       do{
        System.out.println("                                               MACHINE                 "
                + "             USER: "+name+"    "
                + "Cup Size: "+size+"\n                          Water      Level"
                + "      Beans     BeansGround     CoffeeBrewed     Cup Full     Strength \n"
                + "                          "+cm.isThereWater()+"       "+cm.waterLevel()+"         "
                   +cm.addBeansBoolean()+"        "+cm.beansGround()+"           "+cm.brewedBoolean()+"          "+cc.isFull()+"         "+strength+" \nOPTION: n - New Customer\n        w - Add Water\n"
                + "        b - Add Coffee Beans\n        g - Grind Beans\n        "
                + "r - Brew Coffee\n        p - Pour a cup\n        d - Drink a Cup\n"
                + "        x - Exit");
         
        
        System.out.print("                 Your Choice? ");
        option = Keyboard.nextLine();
        if (option.equals("n")){
            newCustomer = true;
        }
        else if (!option.equals("n") && newCustomer == false) {
            System.out.println("Please add new customer!");
        }
       } while (newCustomer == false);
        if (option.equals("n") || newCustomer == false) {
            cm.resetFlags();
            System.out.print("What is your name? ");
            name = Keyboard.nextLine();
            cm.getName(name);
            cc.getName(name);   
            System.out.print("What size: small (s), medium (m), large (l): ");
            size = Keyboard.nextLine();
            if (size.equals("s")) {
                size = "small";
            } else if (size.equals("m")) {
                size = "medium";
            } else if (size.equals("l")) {
                size = "large";
            } else {
                System.out.println("Please write a vailid string (s,m,l).");
            }
            cm.setSize(size);
            cc.setSize(size);
            System.out.print("How strong do you want the coffee: weak (w), regular (r) or strong (s): ");
            strength = Keyboard.nextLine();
            if (strength.equals("w")) {
                strength = "weak";
            } else if (strength.equals("r")) {
                strength = "regular";
            } else if (strength.equals("s")) {
                strength = "strong";
            } else {
                System.out.println("Please write a vailid string (w,r,s).");
                strength = "none";
            } 
            cm.getStrength(strength);
            newCustomer = true;
        }
            
        if (option.equals("w")) {
            cm.addWater();
        }
        else if (option.equals("b")) {
            cm.addBeans();
        }
        else if (option.equals("g")) {
            cm.grindBeans();
        }
        else if (option.equals("r")) {
                cm.brew(cc);
        }
        else if (option.equals("p")) {
            
            if (cm.brewedBoolean() == true){
            cm.pourCup(cc);
            cc.fill();
            }
            else {
                System.out.println("Please brew coffee.");
            }
        }
        else if (option.equals("d")) {
            if (cc.drink() ==  true){
            cc.drink();
            System.out.println("Taste good!");}
            else{
                System.out.println("Please pour more coffee.");
            }
        }
        else if (option.equals("x")) {
            endgame = true;
        }
      }
        
        // Add water and beans to the CoffeeMachine.

        // Get ready to grind some strong coffee in the CoffeeMachine.
        

        // Grind the beans.
        // Declare a reference to a CoffeeCup.
        //CoffeeCup cc = new CoffeeCup();
        // Create a new CoffeeCup and make the variable refer to it.
        //cm.brew(cc);
        // Have your CoffeeMachine brew coffee into the coffee cup.

        //cc.drink();
        // Drink from the cup.

        //cc.drink();
        // Try to drink again --the cup is now empty.

        //CoffeeCup ccCopy = new CoffeeCup();
        // Declare ANOTHER coffee cup reference and initialize it.
        //cm.brew(ccCopy);
        // Brew coffee into the new cup.
        //cc.drink();
        // Try to drink from the first cup --it's still empty!
        //ccCopy.drink();
        // Drink from the second cup.
        System.out.println("Taste good!");
        // Print a sigh of satisfaction.
    }

}
