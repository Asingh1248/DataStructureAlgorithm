package InterviewQauestionPart1;

import java.util.HashSet;

class Employee{

    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj ==this)  // Step 1 : Check with this(i,e) object
            return  true;
        if(!(obj instanceof Employee)) //Step 2: Check object is instance of Employee or not
            return false;
        Employee employee =(Employee)obj;
        return  employee.getId() == this.getId(); // return true if getId and getName are same
//                && employee.getName() == this.getName();

    }

    /*
     Even though equals is overridden default hashcode of Object class comes with unique hashcode
     Therefore if two objects are equal their hashcdode must be equal
    */

   //It will work if u return  employee.getId() == this.getId();
        @Override
    public int hashCode() {
        return this.id;
    }


  // If u want to return        return  employee.getId() == this.getId() // return true if getId and getName are same
    //                && employee.getName() == this.getName();
//     @Override
//        public int hashCode() {
//            int result=17;
//            result=31*result+id;
//            result=31*result+(name!=null ? name.hashCode():0);
//            return result;
//        }

}


public class HashCodeEquals {

    public static void main(String[] args) {

        Employee e1 = new Employee(1,"Animesh");
        Employee e2 = new Employee(1,"Abhishek");

        HashSet<Employee> employeeHashSet = new HashSet<>();
        employeeHashSet.add(e1);



        System.out.println(employeeHashSet.contains(e2));
        System.out.println("Hashcode of E1 Object  :"+e1.hashCode());
        System.out.println("Hashcode of E2 Object  :"+e2.hashCode());

        employeeHashSet.stream().forEach(employee -> {

        });





    }




}
