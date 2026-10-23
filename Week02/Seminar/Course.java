public class Course {

    // ANCHOR - Attributes

    public String courseCode;
    private String title;
    private int credits;
    private int simester;

    // ANCHOR - Constructor

    public Course(String courseCode, String title, int credits, int simester) {

        this.courseCode = courseCode;
        this.title = title;
        this.credits = credits;
        this.simester = simester;

    }

    // ANCHOR - Getters

    public String getCourseCode() {
        return this.courseCode;
    }

    public String getTitle() {
        return this.title;
    }

    public int getCredits() {
        return this.credits;
    }

    public int getSimester() {
        return this.simester;
    }

    // ANCHOR - Setters

    public void setTitle(String title) {
        this.title = title;
    }

    // ANCHOR - Methods

    public String fullName() {
        return this.courseCode + ": " + this.title;
    }

    public boolean isMajorCourse() {
        return (this.credits >= 3);
    }

    // ANCHOR - Overides

    @Override
    public String toString() {
        return this.title + " (" + this.courseCode + ") Credits: " + this.credits + ", Simester: "
                + (this.simester == 1 ? "Fall" : "Spring");
    }
}