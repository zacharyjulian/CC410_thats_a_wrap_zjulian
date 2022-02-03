package thatsawrap.data.drinks;

import thatsawrap.data.enums.Size;

import java.util.LinkedList;

public class Forrest {
    private Size size;
    private double price;
    private int calories;
    
    private boolean chocolate;
    private boolean vanilla;
    private boolean caramel;
    private boolean coffee;

    public Forrest() {
        this.size = Size.INDIE;
        this.chocolate = true;
        this.vanilla = false;
        this.caramel = false;
        this.coffee = false;
    }

    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    public double getPrice() {
        if (size == Size.INDIE) {
            return 5.25;
        } else if (size == Size.STUDIO) {
            return 7.50;
        } else {
            return 9.00;
        }
    }

    public int getCalories() {
        if (size == Size.INDIE) {
            return 980;
        } else if (size == Size.STUDIO) {
            return 1365;
        } else {
            return 1875;
        }
    }

    public boolean getChocolate() {
        return chocolate;
    }
    public void setChocolate(boolean value) {
        chocolate = value;
    }
    public boolean getVanilla() {
        return vanilla;
    }
    public void setVanilla(boolean value) {
        vanilla = value;
    }
    public boolean getCaramel() {
        return caramel;
    }
    public void setCaramel(boolean value) {
        caramel = value;
    }
    public boolean getCoffee() {
        return coffee;
    }
    public void setCoffee(boolean value) {
        coffee = value;
    }

    public LinkedList<String> getInstructions() {
        LinkedList<String> specials = new LinkedList<>();
        if (!chocolate) {
            specials.add("Hold Chocolate");
        } if (vanilla) {
            specials.add("Add Vanilla");
        } if (caramel) {
            specials.add("Add Caramel");
        } if (coffee) {
            specials.add("Add Coffee");
        }
        return specials;
    }

    @Override
    public String toString() {
        return size + " Forrest Gump";
    }
    @Override
    public boolean equals(Object input) {
        if (input instanceof Forrest) {
            Forrest other = (Forrest) input;
            return this.size == other.size
            && this.price == other.price
            && this.calories == other.calories
            && this.chocolate == other.chocolate
            && this.vanilla == other.vanilla
            && this.caramel == other.caramel
            && this.coffee == other.coffee;
        } else {
            return false;
        }
    }
}