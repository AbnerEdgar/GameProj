public class Shoe extends Item{
	
	private String grip;
	
	Shoe(){
		super();
		this.grip = "";
	}
	
	public Shoe(String name, float offense, float defense, int weight, float price, String grip) {
		super(name, offense, defense, weight, price);
		this.grip = grip;
	}
	
	public String getGrip() {
		return grip;
	}
}
