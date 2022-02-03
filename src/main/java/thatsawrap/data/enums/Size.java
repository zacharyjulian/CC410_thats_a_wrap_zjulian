package thatsawrap.data.enums;

public enum Size {
    INDIE("Indie (Small)"),
    STUDIO("Studio (Medium)"),
    BLOCKBUSTER("Blockbuster (Large)");

    private final String description;

    private Size(String value) {
        this.description = value;
    }

    @Override
    public String toString(){
        return this.description;
    }
}