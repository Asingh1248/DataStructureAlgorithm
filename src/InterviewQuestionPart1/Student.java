package InterviewQuestionPart1;

//Imp Comparable<Student>
public class Student implements Comparable<Student>{   //Imp

    String name;
    int marks;
    int admission;

    public Student(String name, int marks, int admission) {
        this.name = name;
        this.marks = marks;
        this.admission = admission;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getAdmission() {
        return admission;
    }

    public void setAdmission(int admission) {
        this.admission = admission;
    }

    @Override
    public int compareTo(Student s) {
      if(s.getMarks() >this.getMarks())
          return 1;
      if(s.getMarks()==this.getMarks())
          return 0;
      else
          return -1;
    }


}
