
public class Student {

    // ANCHOR - Attributes

    private String studentId;
    private String name;
    private double gpa;
    private int enrollmentYear;

    // ANCHOR - Constructor

    public Student(String studentId, String name, int enrollmentYear) {

        this.studentId = studentId;
        this.name = name;
        this.gpa = 0;
        this.enrollmentYear = enrollmentYear;

    }

    // ANCHOR - Getters

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public int getEnrollmentYear() {
        return enrollmentYear;
    }

    // ANCHOR - Setters

    public void setName(String name) {
        this.name = name;
    }

    // ANCHOR - Methods

    public void updateGpa(double gpa) {
        this.gpa = gpa;
    }

    public String academicStanding() {
        return (this.gpa >= 2.d) ? "Good Standing" : (this.gpa >= 1.5d) ? "Academic Warning" : "Academic Probation";
    }

    public int yearsEnrolled(int currentYear) {
        return currentYear - this.enrollmentYear;
    }

    // ANCHOR - Overides

    @Override
    public String toString() {
        return "Student: " + this.name + " (" + this.studentId + ") " + this.enrollmentYear + ", GPA: " + this.gpa;
    }

}
