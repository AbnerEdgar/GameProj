/**
 * Represents an item in a game with offensive and defensive attributes.
 */
public class Item {

    private String name;
    private int weight;
    private float price;
    private float offense;
    private float defense;

    /**
     * Constructs an empty item with default attribute values.
     */
    public Item() {
        this.name = "";
        this.offense = 0;
        this.defense = 0;
        this.weight = 0;
        this.price = 0f;
    }

    /**
     * Constructs an item with the specified attributes.
     *
     * @param name    the name of the item
     * @param offense the offensive attribute of the item
     * @param defense the defensive attribute of the item
     * @param weight  the weight of the item
     * @param price   the price of the item
     */
    public Item(String name, float offense, float defense, int weight, float price) {
        this.name = name;
        this.offense = offense;
        this.defense = defense;
        this.weight = weight;
        this.price = price;
    }

    /**
     * Returns the name of the item.
     *
     * @return the name of the item
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the offensive attribute of the item.
     *
     * @return the offensive attribute of the item
     */
    public float getOffense() {
        return offense;
    }

    /**
     * Returns the defensive attribute of the item.
     *
     * @return the defensive attribute of the item
     */
    public float getDefense() {
        return defense;
    }

    /**
     * Returns the weight of the item.
     *
     * @return the weight of the item
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Returns the price of the item.
     *
     * @return the price of the item
     */
    public float getPrice() {
        return price;
    }
}