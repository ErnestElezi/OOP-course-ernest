public class University {

    public static void main(String[] args) {

        Student nesti = new Student("S-0001", "Ernest Elezi", 2025);
        nesti.updateGpa(3.5);
        System.out.println("Academic Standing for Ernest: " + nesti.academicStanding());
        System.out.println("Years since Ernest enrolled: " + nesti.yearsEnrolled(2026));
        System.out.println(nesti.toString());

        Professor prof = new Professor("E-0001", "Example Professor", "Specialisation Somewhere", 10);
        System.out.println("Academic title for Elton: " + prof.academicTitle());
        System.out.println("Example professor " + (prof.isExperienced() ? "is" : "isn't") + " experienced.");
        prof.completeAnotherYear();
        System.out.println(prof.toString());

        Course objectOrientedPrograming = new Course("OOP", "Object Oriented Programming", 6, 1);
        System.out.println(objectOrientedPrograming.fullName());
        System.out.println(objectOrientedPrograming.fullName()
                + (objectOrientedPrograming.isMajorCourse() ? "is" : "isn't") + " a Majour Course");
        System.out.println(objectOrientedPrograming.toString());

        Classroom l1 = new Classroom("L1", "G3", 30, true);
        System.out.println(l1.location() + (l1.canAccommodate(25) ? " can" : " can't") + " accomodate 25 students.");
        System.out.println(l1.location() + (l1.isLargeRoom() ? " is" : "isn't") + " a large room.");
        System.out.println(l1.toString());

        Department comp = new Department("Computer Sience", "G3", "IDK");
        System.out.println(comp.toString());

    }

}
