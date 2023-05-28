import java.util.ArrayList;

/**
 * The Athlete class represents an athlete in the application.
 */
public class Athlete {

    // Visual Property
    private String image;

    // Bio Property
    private String name;
    private int age;
    private float height;

    // Statistic Property
    private Racket racket;
    private Shoe shoe;
    private float offense;
    private float defense;
    private float stamina;
    private float price;

    /**
     * Constructs an empty Athlete object with default values.
     */
    public Athlete() {
        this.name = "";
        this.age = 0;
        this.height = 0f;
        this.offense = 0;
        this.defense = 0;
        this.stamina = 0;
        this.price = 0;
        this.image = "image/" + name;
        this.racket = new Racket();
        this.shoe = new Shoe();
    }

    /**
     * Constructs an Athlete object with the specified properties.
     *
     * @param name     the name of the athlete
     * @param age      the age of the athlete
     * @param height   the height of the athlete
     * @param offense  the offense value of the athlete
     * @param defense  the defense value of the athlete
     * @param stamina  the stamina value of the athlete
     * @param price    the price of the athlete
     */
    public Athlete(String name, int age, float height, float offense, float defense,
                   float stamina, float price) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.offense = offense;
        this.defense = defense;
        this.stamina = stamina;
        this.price = price;
        this.image = "image/" + name;
        this.racket = new Racket();
        this.shoe = new Shoe();
    }

    /**
     * Returns the image path of the athlete.
     *
     * @return the image path
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets the image path of the athlete.
     *
     * @param image the image path to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Returns the name of the athlete.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the athlete.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the age of the athlete.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the athlete.
     *
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns the height of the athlete.
     *
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * Sets the height of the athlete.
     *
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * Returns the offense value of the athlete.
     *
     * @return the offense value
     */
    public float getOffense() {
        return offense;
    }

    /**
     * Sets the offense value of the athlete.
     *
     * @param offense the offense value to set
     */
    public void setOffense(float offense) {
        this.offense = offense;
    }

    /**
     * Returns the defense value of the athlete.
     *
     * @return the defense value
     */
    public float getDefense() {
        return defense;
    }

    /**
     * Sets the defense value of the athlete.
     *
     * @param defense the defense value to set
     */
    public void setDefense(float defense) {
        this.defense = defense;
    }

    /**
     * Returns the stamina value of the athlete.
     *
     * @return the stamina value
     */
    public float getStamina() {
        return stamina;
    }

    /**
     * Sets the stamina value of the athlete.
     *
     * @param stamina the stamina value to set
     */
    public void setStamina(float stamina) {
        this.stamina = stamina;
    }

    /**
     * Returns the price of the athlete.
     *
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * Sets the price of the athlete.
     *
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

	public Racket getRacket() {
		return racket;
	}

	public void setRacket(Racket racket) {
		this.racket = racket;
	}

	public Shoe getShoe() {
		return shoe;
	}

	public void setShoe(Shoe shoe) {
		this.shoe = shoe;
	}

    

    
}