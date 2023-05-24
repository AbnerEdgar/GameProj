
public class Item {
	
	private String name;
	private int weight;
	private float price;
	private float offense;
	private float defence;
	
	Item(){
		this.name = "";
		this.offense = 0;
		this.defence = 0;
		this.weight = 0;
		this.price = 0f;
	}
	
	Item(String name, float offense, float defence,int weight, float price){
		this.name = name;
		this.offense = offense;
		this.defence = defence;
		this.weight = weight;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public float getOffense() {
		return offense;
	}

	public float getDefence() {
		return defence;
	}

	public int getWeight() {
		return weight;
	}

	public float getPrice() {
		return price;
	}
	
}
