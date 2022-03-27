package InterviewQuestionPart1;

public class Task1 extends Thread {

    public void run() { //SIGNATURE
        System.out.print("\n Task1 Started"); //This code started running parallel
        //TASK 1
        for (int i = 101; i <= 199; i++)
            System.out.print(i + " ");

        System.out.print("\n Task1 Done");
    }

}
