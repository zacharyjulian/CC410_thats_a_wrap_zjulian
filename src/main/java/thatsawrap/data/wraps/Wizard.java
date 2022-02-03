package thatsawrap.data.wraps;

import thatsawrap.data.enums.Addins;
import thatsawrap.data.enums.Shell;
import thatsawrap.data.enums.Size;

import java.util.LinkedList;
import java.util.HashSet;

public class Wizard {
    private Shell shell;
    private HashSet<Addins> addins;
    private double price;
    private int calories;
    private boolean chicken;
    private boolean spinach;
    private boolean cheese;

    public Wizard() {
        this.shell = Shell.SPINACH;
        this.price = 9.35;
        this.calories = 1085;
        this.chicken = true;
        this.spinach = true;
        this.cheese = true;
        this.addins = new HashSet<>();
        addins.add(Addins.TOMATOES);
        addins.add(Addins.DRESSING);
    }

    public Shell getShell() {
        return shell;
    }
    public void setShell(Shell value) {
        shell = value;
    }

    public HashSet<Addins> getAddins() {
        return new HashSet<Addins>(this.addins);
    }
    public void addAddin(Addins value) {
        addins.add(value);
    }
    public void removeAddin(Addins value) {
        addins.remove(value);
    }

    public double getPrice() {
        if (shell == Shell.WHOLE_GRAIN) {
            return price + 0.75;
        } else if (shell == Shell.SPINACH) {
            return price + 1.00;
        } else {
            return price + 1.50;
        }
    }

    public int getCalories() {
        return calories;
    }

    public LinkedList<String> getInstructions() {
        LinkedList<String> specials = new LinkedList<>();
        if (!chicken) {
            specials.add("Hold Chicken");
        } if (!spinach) {
            specials.add("Hold Spinach");
        } if (!cheese) {
            specials.add("Hold Cheese");
        }
        return specials;
    }

    @Override
    public String toString() {
        return "The Wizard of Oz in a " + this.shell;
    }

    @Override
    public boolean equals(Object input) {
        if (input instanceof Wizard) {
            Wizard other = (Wizard) input;
            return this.shell == other.shell
            && this.price == other.price
            && this.calories == other.calories
            && this.chicken == other.chicken
            && this.spinach == other.spinach
            && this.cheese == other.cheese
            && this.addins.equals(other.addins);
        } else {
            return false;
        }
    }
}