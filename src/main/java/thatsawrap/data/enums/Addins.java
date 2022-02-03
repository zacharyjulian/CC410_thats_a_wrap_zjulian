package thatsawrap.data.enums;

public enum Addins {
    PEPPERS("Peppers"),
    ONIONS("Onions"),
    TOMATOES("Tomatoes"),
    PICKLES("Pickles"),
    DRESSING("Dressing"),
    BUFFALO_SAUCE("Buffalo Sauce"),
    MUSTARD("Mustard");

    private final String description;

    private Addins(String value) {
        this.description = value;
    }

    @Override
    public String toString(){
        return this.description;
    }
}