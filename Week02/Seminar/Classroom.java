public class Classroom {

    // ANCHOR - Constants

    public static final int LARGE_ROOM_THRESHOLD = 50;

    // ANCHOR - Attributes

    private String roomNumber;
    private String building;
    private int capacity;
    private boolean hasProjector;

    // ANCHOR - Constructor

    public Classroom(String roomNumber, String building, int capacity, boolean hasProjector) {

        this.roomNumber = roomNumber;
        this.building = building;
        this.capacity = capacity;
        this.hasProjector = hasProjector;

    }

    // ANCHOR - Getters

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public String getBuilding() {
        return building;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean getHasProjector() {
        return this.hasProjector;
    }

    // ANCHOR - Setters

    public void setHasProjector(boolean hasProjector) {
        this.hasProjector = hasProjector;
    }

    // ANCHOR - Methods

    public boolean canAccommodate(int numberOfStudents) {
        return (this.capacity > numberOfStudents);
    }

    public boolean isLargeRoom() {
        return this.capacity > LARGE_ROOM_THRESHOLD;
    }

    public String location() {
        return "Building " + this.building + ", Room " + this.roomNumber;
    }

    // ANCHOR - Overides

    @Override
    public String toString() {
        return "Classroom: " + location() + ", Capacity: " + this.capacity
                + (this.hasProjector ? " With Projector." : ".");
    }
}
