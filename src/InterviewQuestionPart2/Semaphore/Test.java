package InterviewQuestionPart2.Semaphore;

import java.util.concurrent.Semaphore;

public class Test {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(0);

        try {
            semaphore.acquire();  //Hang program
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        semaphore.release();
        System.out.println(semaphore.availablePermits());


    }
}
