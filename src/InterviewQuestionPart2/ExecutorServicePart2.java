package InterviewQuestionPart2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

 class Task extends Thread {

     private int number;  //Trying to have mechanism
     // to create 5+ or 6 Thread instead of copy pasting the code

     public Task(int number){
         this.number=number;
     }

    public void run() { //SIGNATURE
        System.out.print("\n Task " +number  + " Started");

        for (int i = number*100; i <= number*100+99; i++)
            System.out.print(i + " ");

        System.out.print("\n Task " +number+ " Done");
    }

}

public class ExecutorServicePart2 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        //At given time 2 can execute:
        //task 2 started , task 1 started ,Task 2 Done //Imediately there is only one task in Thread
        // task 3 is started

        executorService.execute(new Task(1));
        executorService.execute(new Task(2));

        //
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));
        executorService.execute(new Task(5));
        executorService.execute(new Task(6));

        executorService.shutdown();

     // at a point maximum 5 threads can be active

    }

}
