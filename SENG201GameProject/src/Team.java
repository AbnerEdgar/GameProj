import java.util.ArrayList;

/**
 * Represents a team of athletes.
 */
public class Team {
    private String name;
    private int activeMembers; // Number of active members in the team
    private int selectedActiveMembers; // Index of active member in the club page
    private ArrayList<Athlete> members; // List of team members
    private String nationality;

    /**
     * Constructs a Team object with the specified name.
     * Initializes the team with default empty athletes.
     *
     * @param name the name of the team
     */
    public Team(String name) {
        this.name = name;
        this.selectedActiveMembers = 0;
        this.members = new ArrayList<>();
        this.nationality = "";

        // Initialize the team with default empty athletes
        for (int i = 0; i < 8; i++) {
            members.add(new Athlete());
        }
    }

    /**
     * Constructs a Team object with the specified name, nationality, and selected athletes.
     * Populates the team with selected athletes and sets the number of active members accordingly.
     *
     * @param name              the name of the team
     * @param nationality       the nationality of the team
     * @param selectedAthletes  the list of selected athletes to populate the team with
     */
    public Team(String name, String nationality, ArrayList<Athlete> selectedAthletes) {
        this.name = name;
        this.selectedActiveMembers = 0;
        this.nationality = nationality;
        this.members = new ArrayList<>();

        // Populate the team with selected athletes
        int numberOfAthletes = Math.min(selectedAthletes.size(), 8);
        this.activeMembers = numberOfAthletes;

        for (int i = 0; i < numberOfAthletes; i++) {
            members.add(selectedAthletes.get(i));
        }

        // Fill the remaining slots with default empty athletes
        for (int i = numberOfAthletes; i < 8; i++) {
            members.add(new Athlete());
        }
    }

    /**
     * Returns the name of the team.
     *
     * @return the name of the team
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the team.
     *
     * @param name the name of the team
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the number of active members in the team.
     *
     * @return the number of active members
     */
    public int getActiveMembers() {
        return activeMembers;
    }

    /**
     * Sets the number of active members in the team.
     *
     * @param activeMembers the number of active members
     */
    public void setActiveMembers(int activeMembers) {
        this.activeMembers = activeMembers;
    }

    /**
     * Returns the nationality of the team.
     *
     * @return the nationality of the team
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the nationality of the team.
     *
     * @param nationality the nationality of the team
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * Returns the list of members in the team.
     *
     * @return the list of members
     */
    public ArrayList<Athlete> getMembers() {
        return members;
    }

    /**
     * Sets the list of members in the team.
     *
     * @param members the list of members
     */
    public void setMembers(ArrayList<Athlete> members) {
        this.members = members;
    }

    /**
     * Returns the number of selected active members in the team.
     *
     * @return the number of selected active members
     */
    public int getSelectedActiveMembers() {
        return selectedActiveMembers;
    }

    /**
     * Sets the number of selected active members in the team.
     *
     * @param selectedActiveMembers the number of selected active members
     */
    public void setSelectedActiveMembers(int selectedActiveMembers) {
        this.selectedActiveMembers = selectedActiveMembers;
    }
}