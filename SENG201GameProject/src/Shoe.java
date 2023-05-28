/**
 * Represents a shoe item, which is a specific type of item with additional grip attribute.
 * Extends the Item class.
 */
public class Shoe extends Item {

    private String grip;
    /**
     * Constructs a shoe item with default attributes.
     * The grip is set to an empty string.
     */
    public Shoe() {
        super();
        this.grip = "";
    }

    /**
     * Constructs a shoe item with the specified attributes.
     *
     * @param name     the name of the shoe
     * @param offense  the offense value of the shoe
     * @param defense  the defense value of the shoe
     * @param weight   the weight of the shoe
     * @param price    the price of the shoe
     * @param grip     the grip of the shoe
     */
    public Shoe(String name, float offense, float defense, int weight, float price, String grip) {
        super(name, offense, defense, weight, price);
        this.grip = grip;
    }

    /**
     * Returns the grip of the shoe.
     *
     * @return the grip of the shoe
     */
    public String getGrip() {
        return grip;
    }
}