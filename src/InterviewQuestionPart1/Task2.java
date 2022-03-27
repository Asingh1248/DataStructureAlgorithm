package InterviewQuestionPart1;

public class Task2 implements Runnable {


    @Override
    public void run() {
        System.out.print("\n Task2 Started  ");
        //Task 2
        for (int i = 201; i <= 299; i++)
            System.out.print(i + " ");
        System.out.print("\n Task2 Done ");
    }
}
