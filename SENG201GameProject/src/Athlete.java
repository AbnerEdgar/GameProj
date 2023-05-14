import java.util.ArrayList;

public class Athlete {
	
	//:START -- Visual Property
	private String image;
	//:END -- Visual Property
	
	//:START -- Bio Property
	private String name;
	private int position; 
	private String nationality;
	//:END -- Bio Property
	
	//:START -- Statistic Property
	private ArrayList<Item> equipment = new ArrayList<Item>();
	private float offense;
	private float defence;
	private float stamina;
	private float price;
	//:END -- Statistic Property
	
	public Athlete(String name, int position, String nationality, float offense, float defence,
			float stamina, float price) {
		this.name = name;
		this.position = position;
		this.nationality = nationality.toUpperCase();
		this.offense = offense;
		this.defence = defence;
		this.stamina = stamina;
		this.price = price;
		this.image = "image/" + name;
	}
	
	//START -- GETTER-SETTER
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public float getOffense() {
		return offense;
	}
	public void setOffense(float offense) {
		this.offense = offense;
	}
	public float getDefence() {
		return defence;
	}
	public void setDefence(float defence) {
		this.defence = defence;
	}
	public float getStamina() {
		return stamina;
	}
	public void setStamina(float stamina) {
		this.stamina = stamina;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	//:END -- GETTER-SETTER
	
	//:START -- Method
	public boolean isEquipmentFull() {
		return this.equipment.size() == 2 ? true : false;
	}
	public void equip(Item item) {
		if(!isEquipmentFull()) {
			this.equipment.add(item);
		}
	}
	public void unequip(int index) {
		equipment.remove(index);
	}
	//:END -- Method
	
}
