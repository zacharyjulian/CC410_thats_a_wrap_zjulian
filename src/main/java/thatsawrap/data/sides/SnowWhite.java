package thatsawrap.data.sides;

import thatsawrap.data.enums.Size;

public class SnowWhite {
    private Size size;
    private double price;
    private int calories;

    public SnowWhite() {
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
            return 1.50;
        } else if (size == Size.STUDIO) {
            return 2.25;
        } else {
            return 3.00;
        }
    }

    public int getCalories() {
        if (size == Size.INDIE) {
            return 225;
        } else if (size == Size.STUDIO) {
            return 350;
        } else {
            return 475;
        }
    }

    @Override
    public String toString() {
        return size + " Snow White";
    }
    @Override
    public boolean equals(Object input) {
        if (input instanceof SnowWhite) {
            SnowWhite other = (SnowWhite) input;
            return this.size == other.size
            && this.price == other.price
            && this.calories == other.calories;
        } else {
            return false;
        }
    }
}