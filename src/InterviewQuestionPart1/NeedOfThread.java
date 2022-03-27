package InterviewQuestionPart1;

//In 28 minutes
public class NeedOfThread {

    public static void main(String[] args) {

        //One after another-- Typiclly Programming
        //Task 1, task 2 and task 3: Are Independent of each other
        //Task 1-- IO -- (Data )
        //Task 1-- Task in Parallelism -- utilisation of CPU
        for(int i=101;i<=199;i++)
            System.out.print(i + " ");

        System.out.println("\n Task1 Done");
        //Task 2
        for(int i=201;i<=299;i++)
            System.out.print(i + " ");

        System.out.println("\n Task2 Done");

        //Task 3
        for(int i=301;i<=399;i++)
            System.out.print(i + " ");

        System.out.println("\n Task3 Done");

        System.out.println("\n Main Done");


    }

}
