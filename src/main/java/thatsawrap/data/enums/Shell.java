package thatsawrap.data.enums;

public enum Shell {
    WHOLE_GRAIN("Whole Grain"),
    SPINACH("Spinach"),
    STROMBOLI("Stromboli");

    private final String description;

    private Shell(String value) {
        this.description = value;
    }

    @Override
    public String toString(){
        return this.description;
    }
}