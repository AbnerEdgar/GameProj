/**
 * Represents a racket item, which is a specific type of item with additional tension attribute.
 * Extends the Item class.
 */
public class Racket extends Item {

    private int tension;

    /**
     * Constructs a racket item with default attributes.
     * The tension is set to 0.
     */
    public Racket() {
        super();
        this.tension = 0;
    }

    /**
     * Constructs a racket item with the specified attributes.
     *
     * @param name     the name of the racket
     * @param offense  the offense value of the racket
     * @param defense  the defense value of the racket
     * @param weight   the weight of the racket
     * @param price    the price of the racket
     * @param tension  the tension of the racket
     */
    public Racket(String name, float offense, float defense, int weight, float price, int tension) {
        super(name, offense, defense, weight, price);
        this.tension = tension;
    }

    /**
     * Returns the tension of the racket.
     *
     * @return the tension of the racket
     */
    public int getTension() {
        return tension;
    }
}