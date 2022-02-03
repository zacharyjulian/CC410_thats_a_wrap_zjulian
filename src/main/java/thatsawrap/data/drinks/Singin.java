package thatsawrap.data.drinks;

import thatsawrap.data.enums.Size;

import java.util.LinkedList;

public class Singin {
    private Size size;
    private double price;
    private int calories;
    
    private boolean cherry;
    private boolean strawberry;
    private boolean cola;
    private boolean grape;

    public Singin() {
        this.size = Size.INDIE;
        this.cherry = true;
        this.strawberry = false;
        this.cola = false;
        this.grape = false;
    }

    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    public double getPrice() {
        if (size == Size.INDIE) {
            return 2.75;
        } else if (size == Size.STUDIO) {
            return 3.25;
        } else {
            return 4.00;
        }
    }

    public int getCalories() {
        if (size == Size.INDIE) {
            return 360;
        } else if (size == Size.STUDIO) {
            return 400;
        } else {
            return 550;
        }
    }

    public boolean getCherry() {
        return cherry;
    }
    public void setCherry(boolean value) {
        cherry = value;
    }
    public boolean getStrawberry() {
        return strawberry;
    }
    public void setStrawberry(boolean value) {
        strawberry = value;
    }
    public boolean getCola() {
        return cola;
    }
    public void setCola(boolean value) {
        cola = value;
    }
    public boolean getGrape() {
        return grape;
    }
    public void setGrape(boolean value) {
        grape = value;
    }

    public LinkedList<String> getInstructions() {
        LinkedList<String> specials = new LinkedList<>();
        if (!cherry) {
            specials.add("Hold Cherry");
        } if (strawberry) {
            specials.add("Add Strawberry");
        } if (cola) {
            specials.add("Add Cola");
        } if (grape) {
            specials.add("Add Grape");
        }
        return specials;
    }

    @Override
    public String toString() {
        return size + " Singin' in the Rain";
    }
    @Override
    public boolean equals(Object input) {
        if (input instanceof Singin) {
            Singin other = (Singin) input;
            return this.size == other.size
            && this.price == other.price
            && this.calories == other.calories
            && this.cherry == other.cherry
            && this.strawberry == other.strawberry
            && this.cola == other.cola
            && this.grape == other.grape;
        } else {
            return false;
        }
    }
}