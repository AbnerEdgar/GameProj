
public class Item {
	
	private String name;
	private int weight;
	private float price;
	private float offense;
	private float defense;
	
	Item(){
		this.name = "";
		this.offense = 0;
		this.defense = 0;
		this.weight = 0;
		this.price = 0f;
	}
	
	Item(String name, float offense, float defense,int weight, float price){
		this.name = name;
		this.offense = offense;
		this.defense = defense;
		this.weight = weight;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public float getOffense() {
		return offense;
	}

	public float getDefense() {
		return defense;
	}

	public int getWeight() {
		return weight;
	}

	public float getPrice() {
		return price;
	}
	
}
