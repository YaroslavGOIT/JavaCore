package Module_3.HomeWork3_3;

/**
 * Created by admin-pc on 09.09.2016.
 */
public class CollegeStudent extends Student {
    String collegeName;
    int raiting;
    long id;

    CollegeStudent(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    CollegeStudent(String lastName, Course[] coursesTaken) {
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }

    CollegeStudent(String collegeName, int raiting, long id) {
        this.collegeName = collegeName;
        this.raiting = raiting;
        this.id = id;
    }
}