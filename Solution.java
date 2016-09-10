package Module_3.HomeWork3_3;

import java.util.Date;

/**
 * Created by admin-pc on 09.09.2016.
 */
public class Solution {
    public static void main(String[] argc){
        Course course = new Course();
        Student student = new Student();
        CollegeStudent collegeStudent = new CollegeStudent();
        SpecialStudent specialStudent = new SpecialStudent();

        final Date startDate = course.startDate;
        final String name = course.name;
        final String teacherNane  = course.teacherName;
        final int hoursDuration = course.hoursDuration;
        final Course[] coursesTaken = student.coursesTaken;
        final String firstName = student.firstName;
        final String lastName = student.lastName;
        final int group = student.group;
        final String collegeName = collegeStudent.collegeName;
        final int raiting = collegeStudent.raiting;
        final long id = collegeStudent.id;
        final long secretKey = specialStudent.secretKey;
        final String email = specialStudent.email;

    }
}
