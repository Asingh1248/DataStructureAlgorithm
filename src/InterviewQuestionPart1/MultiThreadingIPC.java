package InterviewQuestionPart1;

//We want to add a condition - Task3 should execute only after Task1 terminates.
public class MultiThreadingIPC {

    public static void main(String[] args) throws InterruptedException {

        System.out.print("\nTask1 Kicked Off\n");
        Task1 task1 = new Task1();
        task1.start();

        System.out.print("\nTask2 Kicked Off\n");
        Task2 task2 = new Task2();

        Thread task2Thread = new Thread(task2);
        task2Thread.start();

        task1.join();
        //task1.join() waits until task1 completes.
        // So, the code after task1.join() will executed only on completion of task1.

        System.out.print("\nTask3 Kicked Off\n");
        for(int i=301; i<=399; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask3 Done");
        System.out.println("\nMain Done");
    }
}
