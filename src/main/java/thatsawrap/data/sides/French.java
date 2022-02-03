package thatsawrap.data.sides;

import thatsawrap.data.enums.Size;

public class French {
    private Size size;
    private double price;
    private int calories;

    public French() {
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
            return 2.75;
        } else if (size == Size.STUDIO) {
            return 4.85;
        } else {
            return 5.25;
        }
    }

    public int getCalories() {
        if (size == Size.INDIE) {
            return 550;
        } else if (size == Size.STUDIO) {
            return 700;
        } else {
            return 950;
        }
    }

    @Override
    public String toString() {
        return size + " The French Connection";
    }
    @Override
    public boolean equals(Object input) {
        if (input instanceof French) {
            French other = (French) input;
            return this.size == other.size
            && this.price == other.price
            && this.calories == other.calories;
        } else {
            return false;
        }
    }
}