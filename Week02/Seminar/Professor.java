public class Professor {

    // ANCHOR - Constants

    public static final int EXPERIENCED_YEARS_THRESHOLD = 5;

    // ANCHOR - Attributes

    private String employeeId;
    private String name;
    private String specalisation;
    private int yearsOfExperience;

    // ANCHOR - Constructor

    public Professor(String employeeId, String name, String specialisation, int yearsOfExperience) {
        this.employeeId = employeeId;
        this.name = name;
        this.specalisation = specialisation;
        this.yearsOfExperience = yearsOfExperience;
    }

    // ANCHOR - Getters

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getSpecalisation() {
        return specalisation;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    // ANCHOR - Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecalisation(String specalisation) {
        this.specalisation = specalisation;
    }

    // ANCHOR - Methods

    public String academicTitle() {
        return (this.yearsOfExperience < 5) ? "Assistant Professor"
                : (this.yearsOfExperience < 10) ? "Assosiate Professor" : "Professor";
    }

    public boolean isExperienced() {
        return (this.yearsOfExperience > EXPERIENCED_YEARS_THRESHOLD);
    }

    public void completeAnotherYear() {
        this.yearsOfExperience++;
    }

    // ANCHOR - Overides
    @Override
    public String toString() {
        return academicTitle() + this.name + ", Specialisation: " + this.specalisation + ", Years Experience: "
                + this.yearsOfExperience;
    }

}
