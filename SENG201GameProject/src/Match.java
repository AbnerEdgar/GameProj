/**
 * Represents a match in a game with a name, price, point, and difficulty level.
 */
public class Match {

    private String name;
    private int price;
    private int point;
    private float difficulty;

    /**
     * Constructs a match with the specified attributes.
     *
     * @param name       the name of the match
     * @param price      the base price of the match
     * @param point      the base point of the match
     * @param difficulty the difficulty level of the match
     */
    public Match(String name, int price, int point, float difficulty) {
        this.name = name;
        this.price = price;
        this.point = point;
        this.difficulty = difficulty;
    }

    /**
     * Returns the name of the match.
     *
     * @return the name of the match
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the match.
     *
     * @param name the name of the match
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the base price of the match.
     *
     * @return the base price of the match
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets the base price of the match.
     *
     * @param price the base price of the match
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Returns the base point of the match.
     *
     * @return the base point of the match
     */
    public int getPoint() {
        return point;
    }

    /**
     * Sets the base point of the match.
     *
     * @param point the base point of the match
     */
    public void setPoint(int point) {
        this.point = point;
    }

    /**
     * Returns the difficulty level of the match.
     *
     * @return the difficulty level of the match
     */
    public float getDifficulty() {
        return difficulty;
    }

    /**
     * Sets the difficulty level of the match.
     *
     * @param difficulty the difficulty level of the match
     */
    public void setDifficulty(float difficulty) {
        this.difficulty = difficulty;
    }
}