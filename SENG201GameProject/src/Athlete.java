import java.util.ArrayList;

import javax.swing.JButton;

public class Athlete {
	
	//:START -- Visual Property
	private String image;
	//:END -- Visual Property
	
	//:START -- Bio Property
	private String name;
	private String position; 
	private String nationality;
	//:END -- Bio Property
	
	//:START -- Statistic Property
	private ArrayList<Item> equipment = new ArrayList<Item>() {{
        add(new Item());
        add(new Item());
    }};
	private float offense;
	private float defence;
	private float stamina;
	private float price;
	//:END -- Statistic Property
	
	public Athlete() {
		this.name = "";
		this.position = "";
		this.nationality = "";
		this.offense = 0;
		this.defence = 0;
		this.stamina = 0;
		this.price = 0;
		this.image = "image/" + name;
	}
	
	
	
	public Athlete(String name, String position, String nationality, float offense, float defence,
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
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
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
	public Item getEquipment(int index) {
		return equipment.get(index);
	}
	public ArrayList<Item> getEquipments() {
		return equipment;
	}
	public void addEquipment(ArrayList<Item> equipment) {
		
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