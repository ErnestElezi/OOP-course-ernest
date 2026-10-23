public class Department {

    // ANCHOR - Attributes

    private String name;
    private String building;
    private String headName;

    // ANCHOR - Constructor

    public Department(String name, String building, String headName) {
        this.name = name;
        this.building = building;
        this.headName = headName;
    }

    // ANCHOR - Getters

    public String getName() {
        return name;
    }

    public String getBuilding() {
        return building;
    }

    public String getHeadName() {
        return headName;
    }

    // ANCHOR - Setters

    public void setBuilding(String building) {
        this.building = building;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    // ANCHOR - Methods

    // ANCHOR - Overides

    @Override
    public String toString() {
        return this.name + ", Building " + this.building + ", Head: " + this.headName;
    }
}