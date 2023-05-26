public class Match {
	private String name;
	// the base price of the match
	private int price;
	// the base point of the match
	private int point;
	private float difficulty;
	
	Match(String name, int price, int point, float difficulty){
		this.name = name;
		this.price = price;
		this.point = point;
		this.difficulty = difficulty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public float getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(float difficulty) {
		this.difficulty = difficulty;
	}
}
