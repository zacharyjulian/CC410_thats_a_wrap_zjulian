package thatsawrap.data.drinks;

import thatsawrap.data.enums.Size;

import java.util.LinkedList;

public class KingKong {
    private Size size;
    private double price;
    private int calories;
    
    private boolean banana;
    private boolean strawberry;
    private boolean peach;
    private boolean mango;
    
    public KingKong() {
        this.size = Size.INDIE;
        this.banana = true;
        this.strawberry = false;
        this.peach = false;
        this.mango = false;
    }

    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    public double getPrice() {
        if (size == Size.INDIE) {
            return 4.85;
        } else if (size == Size.STUDIO) {
            return 5.95;
        } else {
            return 7.45;
        }
    }

    public int getCalories() {
        if (size == Size.INDIE) {
            return 465;
        } else if (size == Size.STUDIO) {
            return 625;
        } else {
            return 860;
        }
    }

    public boolean getBanana() {
        return banana;
    }
    public void setBanana(boolean value) {
        banana = value;
    }
    public boolean getStrawberry() {
        return strawberry;
    }
    public void setStrawberry(boolean value) {
        strawberry = value;
    }
    public boolean getPeach() {
        return peach;
    }
    public void setPeach(boolean value) {
        peach = value;
    }
    public boolean getMango() {
        return mango;
    }
    public void setMango(boolean value) {
        mango = value;
    }

    public LinkedList<String> getInstructions() {
        LinkedList<String> specials = new LinkedList<>();
        if (!banana) {
            specials.add("Hold Banana");
        } if (strawberry) {
            specials.add("Add Strawberry");
        } if (peach) {
            specials.add("Add Peach");
        } if (mango) {
            specials.add("Add Mango");
        }
        return specials;
    }

    @Override
    public String toString() {
        return size + " King Kong";
    }
    @Override
    public boolean equals(Object input) {
        if (input instanceof KingKong) {
            KingKong other = (KingKong) input;
            return this.size == other.size
            && this.price == other.price
            && this.calories == other.calories
            && this.banana == other.banana
            && this.strawberry == other.strawberry
            && this.peach == other.peach
            && this.mango == other.mango;
        } else {
            return false;
        }
    }
}