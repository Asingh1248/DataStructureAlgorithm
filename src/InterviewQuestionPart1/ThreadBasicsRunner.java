package InterviewQuestionPart1;

//extends Thread //implements Runnable


public class ThreadBasicsRunner {

    public static void main(String[] args) {

        //Task 1
        System.out.print("\n Task1 Kicked off ");
        Task1 task1 = new Task1();
        task1.start();  //task1.start  //task1.run //v.imp

//Task 2 code started executing evn before the Task 1 started

        System.out.print("\n Task2 Kicked off ");

        //Task 2

         Task2 task2 = new Task2();
         Thread task2Thread = new Thread(task2); //We are using the Thread constructor passing an instance of Task2.
         task2Thread.start();


        //Task 3
        System.out.print("\n Task3 Kicked off ");
        for (int i = 301; i <= 399; i++)
            System.out.print(i + " ");

        System.out.print("\n Task3 Done ");

        System.out.print("\n Main Done ");
    }
}
