// Program: Course Details Viewer based on User Role

class Course {
    private String courseName;
    private String courseCode;
    private String instructorName;
    private String schedule;
    private int credits;

    // Constructor
    public Course(String courseName, String courseCode, String instructorName, String schedule, int credits) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructorName = instructorName;
        this.schedule = schedule;
        this.credits = credits;
    }

    // Method for Student View
    public void displayDetails(String role) {
        if (role.equalsIgnoreCase("Student")) {
            System.out.println("---- Student View ----");
            System.out.println("Course Name: " + courseName);
            System.out.println("Course Code: " + courseCode);
            System.out.println("Credits: " + credits);
        } 
        else if (role.equalsIgnoreCase("Instructor")) {
            System.out.println("---- Instructor View ----");
            System.out.println("Course Name: " + courseName);
            System.out.println("Course Code: " + courseCode);
            System.out.println("Instructor: " + instructorName);
            System.out.println("Schedule: " + schedule);
            System.out.println("Credits: " + credits);
        } 
        else {
            System.out.println("Invalid role! Access denied.");
        }
    }
}

public class CourseDetailsViewer {
    public static void main(String[] args) {
        // Create a sample course
        Course course = new Course("Object Oriented Programming", "CS201", "Dr. Sharma", "Mon-Wed-Fri 10:00 AM", 4);

        // Student view
        course.displayDetails("Student");
        System.out.println();

        // Instructor view
        course.displayDetails("Instructor");
        System.out.println();

        // Invalid role view
        course.displayDetails("Guest");
    }
}
