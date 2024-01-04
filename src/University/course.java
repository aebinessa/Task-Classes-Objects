package University;

public class course {
    String courseName;
    String courseInstructor;
    int courseEnrolledStudents;

    public course(String courseName, String courseInstructor, int courseEnrolledStudents) {
        this.courseName = courseName;
        this.courseInstructor = courseInstructor;
        this.courseEnrolledStudents = courseEnrolledStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;

    }

    public int getCourseEnrolledStudents() {
        return courseEnrolledStudents;
    }

    public void setCourseEnrolledStudents(int courseEnrolledStudents) {
        this.courseEnrolledStudents = courseEnrolledStudents;
    }

    @Override
    public String toString() {
        return "Course Name: " + courseName + ", Course Instructor: " + courseInstructor
                + ", Number of Enrolled Students: " + courseEnrolledStudents;
    }
}
