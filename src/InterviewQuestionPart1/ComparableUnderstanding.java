package InterviewQuestionPart1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableUnderstanding {

    public static void main(String[] args) {

        Student s1 = new Student("Animesh",50,1998);
        Student s2 = new Student("Abhishek",65,2001);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        System.out.println("Without Sort is ");
        students.stream().forEach(student -> {

            System.out.println("Student details " + student.getMarks() + " " + student.getName() +" " + student.getAdmission());

        });

        Collections.sort(students,Collections.reverseOrder());


        System.out.println("Sorted List of Student :");

        students.stream().forEach(student -> {

            System.out.println("Student details " + student.getMarks() + " " + student.getName() +" " + student.getAdmission());

        });



    }

}
