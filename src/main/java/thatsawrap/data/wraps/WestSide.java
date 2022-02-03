package thatsawrap.data.wraps;

import thatsawrap.data.enums.Addins;
import thatsawrap.data.enums.Shell;
import thatsawrap.data.enums.Size;

import java.util.LinkedList;
import java.util.HashSet;

public class WestSide {
    private Shell shell;
    private HashSet<Addins> addins;
    private double price;
    private int calories;
    private boolean cornedBeef;
    private boolean cabbage;
    private boolean cheese;

    public WestSide() {
        this.shell = Shell.WHOLE_GRAIN;
        this.price = 10.7;
        this.calories = 1240;
        this.cornedBeef = true;
        this.cabbage = true;
        this.cheese = true;
        this.addins = new HashSet<>();
        addins.add(Addins.ONIONS);
        addins.add(Addins.PICKLES);
        addins.add(Addins.MUSTARD);
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
        if (!cornedBeef) {
            specials.add("Hold Corned Beef");
        } if (!cabbage) {
            specials.add("Hold Cabbage");
        } if (!cheese) {
            specials.add("Hold Cheese");
        }
        return specials;
    }

    @Override
    public String toString() {
        return "West Side Story in a " + this.shell;
    }

    @Override
    public boolean equals(Object input) {
        if (input instanceof WestSide) {
            WestSide other = (WestSide) input;
            return this.shell == other.shell
            && this.price == other.price
            && this.calories == other.calories
            && this.cornedBeef == other.cornedBeef
            && this.cabbage == other.cabbage
            && this.cheese == other.cheese
            && this.addins.equals(other.addins);
        } else {
            return false;
        }
    }
}