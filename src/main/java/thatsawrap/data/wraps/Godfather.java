package thatsawrap.data.wraps;

import thatsawrap.data.enums.Addins;
import thatsawrap.data.enums.Shell;
import thatsawrap.data.enums.Size;

import java.util.LinkedList;
import java.util.HashSet;

public class Godfather {
    private Shell shell;
    private HashSet<Addins> addins;
    private double price;
    private int calories;
    private boolean pepperoni;
    private boolean sausage;
    private boolean marinara;
    private boolean cheese;

    public Godfather() {
        this.shell = Shell.STROMBOLI;
        this.price = 8.15;
        this.calories = 1268;
        this.pepperoni = true;
        this.sausage = true;
        this.marinara = true;
        this.cheese = true;
        this.addins = new HashSet<>();
        addins.add(Addins.PEPPERS);
        addins.add(Addins.ONIONS);
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
        if (!pepperoni) {
            specials.add("Hold Pepperoni");
        } if (!sausage) {
            specials.add("Hold Sausage");
        } if (!marinara) {
            specials.add("Hold Marinara");
        } if (!cheese) {
            specials.add("Hold Cheese");
        }
        return specials;
    }

    @Override
    public String toString() {
        return "The Godfather in a " + this.shell;
    }

    @Override
    public boolean equals(Object input) {
        if (input instanceof Godfather) {
            Godfather other = (Godfather) input;
            return this.shell == other.shell
            && this.price == other.price
            && this.calories == other.calories
            && this.pepperoni == other.pepperoni
            && this.sausage == other.sausage
            && this.marinara == other.marinara
            && this.cheese == other.cheese
            && this.addins.equals(other.addins);
        } else {
            return false;
        }
    }
}