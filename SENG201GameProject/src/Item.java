
public class Item {
	
	private String name;
	
	private float offense;
	private float defence;
	private float stamina;
	
	Item(){
		this.name = "";
		this.offense = 0;
		this.defence = 0;
		this.stamina = 0;
	}
	
	Item(String name, float offense, float defence, float stamina){
		this.name = name;
		this.offense = offense;
		this.defence = defence;
		this.stamina = stamina;
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

	public float getStamina() {
		return stamina;
	}
	
	
}
