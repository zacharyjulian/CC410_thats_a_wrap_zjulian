package thatsawrap.data.sides;

import thatsawrap.data.enums.Size;

public class Yankee {
    private Size size;
    private double price;
    private int calories;

    public Yankee() {
        this.size = Size.INDIE;
    }

    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    public double getPrice() {
        if (size == Size.INDIE) {
            return 2.25;
        } else if (size == Size.STUDIO) {
            return 3.65;
        } else {
            return 6.25;
        }
    }

    public int getCalories() {
        if (size == Size.INDIE) {
            return 400;
        } else if (size == Size.STUDIO) {
            return 650;
        } else {
            return 875;
        }
    }

    @Override
    public String toString() {
        return size + " Yankee Doodle Dandy";
    }
    @Override
    public boolean equals(Object input) {
        if (input instanceof Yankee) {
            Yankee other = (Yankee) input;
            return this.size == other.size
            && this.price == other.price
            && this.calories == other.calories;
        } else {
            return false;
        }
    }
}