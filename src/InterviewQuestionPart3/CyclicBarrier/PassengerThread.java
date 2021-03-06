package InterviewQuestionPart3.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class PassengerThread extends  Thread{

    private  int duration;
    private CyclicBarrier barrier;

    public PassengerThread(int duration, CyclicBarrier barrier,String name) {
        super(name);
        this.duration = duration;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(duration);
            System.out.println(Thread.currentThread().getName() + " is arrived");

            int await =barrier.await();
            /** Once Barrier is broken teach thread become eligble to use.
            Reuse of Barrier /Latch is resuable. **/

            if(await==0){
                System.out.println("Four passenger has arrived so cab is going to start .");
            }


        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
