import java.util.ArrayList;
public class Team {
	private String name;
	//MARK: ACTIVE MEMBER --> Members in team
	private int activeMembers;
	private int selectedActiveMembers;
	private ArrayList<Athlete> members;
	private String nationality;
	
	Team(String name){
		this.selectedActiveMembers = 0;
		members = new ArrayList<Athlete>();
		nationality = "";
		for(int i = 0; i < 8; i++) {
			members.add(new Athlete());
		}
	}
	
	Team(String name, String nationality, ArrayList<Athlete> selectedAthletes){
		this.name = name;
		this.selectedActiveMembers = 0;
		this.nationality = nationality;
		members = new ArrayList<Athlete>();
		for(int i = 0; i <= 8; i++) {
			if(i < selectedAthletes.size()) {
				members.add(selectedAthletes.get(i));
				this.activeMembers += 1;
			}else {
				members.add(new Athlete());
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getActiveMembers() {
		return activeMembers;
	}

	public void setActiveMembers(int activeMembers) {
		this.activeMembers = activeMembers;
	}
	
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public ArrayList<Athlete> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<Athlete> members) {
		this.members = members;
	}
	
	public int getSelectedActiveMembers() {
		return selectedActiveMembers;
	}

	public void setSelectedActiveMembers(int selectedActiveMembers) {
		this.selectedActiveMembers = selectedActiveMembers;
	}
	
	
	
	
}
