package Module_3.HomeWork3_3;

/**
 * Created by admin-pc on 09.09.2016.
 */
public class Student {
    Course[] coursesTaken;
    String firstName;
    String lastName;
    int group;
    private int age;
    Student(String firstName, String lastName, int group){
        this.firstName = firstName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }
    Student(String lastName, Course[] coursesTaken){
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }
}
