package InterviewQuestionPart2.CountDownLatchPart1;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTutorial {

    public static void main(String[] args) throws InterruptedException {
     //KK Java Tutorials

        /** One Thread will wait for n Number of Thread to wait while creating countDownLatch
         * **/

        //Created the count Down Latch for 2 thread

        CountDownLatch countDownLatch = new CountDownLatch(2);

        //Created and started two Threads
        DevTeam devTeamA = new DevTeam(countDownLatch,"dev -A");
        DevTeam devTeamB = new DevTeam(countDownLatch,"dev -B");

        devTeamA.start();
        devTeamB.start();

        //When two Thread completed tasks are returned // Count Down returns 0

        countDownLatch.await();  //imp same in Cyclic Barrier.

        QATeam qaTeam = new QATeam("QA Team");
        qaTeam.start();

    /**
    * Scenario : ExecutorService --- join method can't be done hence
    *  2. CountDown allows us to wait for Thread to complete Partial Execution (join can't help here)
    * */




    }

}
