package InterviewQuestionPart3.CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class ClientTest {

    /** No of Thread want to wait for each other at common point :-at Barrier
     *  CountDownLatch can't be used in place of Cylcic Barrier once latch is 0
     *
     *  Eg : of Cab Service Provider :Once 4 passenger reaches certian point then Cab Service will privde Cab conditon
     * **/

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " has started");

        CyclicBarrier barrier = new CyclicBarrier(4);

        PassengerThread p1 = new PassengerThread(1000,barrier,"john");
        PassengerThread p2 = new PassengerThread(2000,barrier,"Abhishek");
        PassengerThread p3 = new PassengerThread(3000,barrier,"Abhinay");
        PassengerThread p4 = new PassengerThread(4000,barrier,"Darshan");


        PassengerThread p5 = new PassengerThread(1000,barrier,"Shivam  S");
        PassengerThread p6 = new PassengerThread(2000,barrier,"Shivam A");
        PassengerThread p7 = new PassengerThread(3000,barrier,"Viram");
        PassengerThread p8 = new PassengerThread(4000,barrier,"Advait");

        p1.start();
        p2.start();
        p3.start();
        p4.start();

        p5.start();
        p6.start();
        p7.start();
        p8.start();


    }

}
