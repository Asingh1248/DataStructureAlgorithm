package InterviewQuestionPart2;

import InterviewQuestionPart1.Task1;
import InterviewQuestionPart1.Task2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {

    public static void main(String[] args) {

       ExecutorService executorService = Executors.newSingleThreadExecutor(); // Basic :-
        // Run a one Thread at time


       executorService.execute(new Task1());
       executorService.execute(new Thread(new Task2()));
       System.out.print("\n Task3 Kicked off ");

        //Task 3
        for (int i = 301; i <= 399; i++)
            System.out.print(i + " ");

        System.out.print("\n Task3 Done ");

        System.out.print("\n Main Done ");

        executorService.shutdown();


    }
}
