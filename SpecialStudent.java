package Module_3.HomeWork3_3;

/**
 * Created by admin-pc on 09.09.2016.
 */
public class SpecialStudent extends CollegeStudent {
    long secretKey;
    String email;

    SpecialStudent(long secretKey){
        this.secretKey = secretKey;
    }

    SpecialStudent(String lastName, Course[] coursesTaken) {
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }

    SpecialStudent((String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }
}
