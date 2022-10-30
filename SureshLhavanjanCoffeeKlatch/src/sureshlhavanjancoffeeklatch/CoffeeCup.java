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
public class CoffeeCup {

    private String name, size;
    private boolean isFull;  // Is this cup full?  Default value false.

    public boolean name(String n) {
        try {
            Double.parseDouble(n);
        } catch (NumberFormatException e) {
            name = n;
            return true;
        }
        return false;
    }

    public boolean size(String s) {
        if (s.equals("s")) {
            size = "small";
            return true;
        } else if (s.equals("m")){
            size = "medium";
            return true;
        } else if (s.equals("l")) {
            size = "large";
            return true;
        } else {
            return false;
        }
    }

    public String sendSize() {
        return size;
    }

    /**
     * Returns whether this cup is full (true) or empty(false);
     *
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

    public void empty() {
        isFull = false;
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
            System.out.println(name + " You glug the coffee down.");
            isFull = false;
            return true;
        } else {
            System.out.println(name + " You sip furiously, but only suck air.");
            return false;
        }

    }
}
