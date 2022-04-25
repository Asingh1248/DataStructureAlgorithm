package InterviewQuestionPart3.AtomicVariable;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    
    /** By Lock mechanism performance gets affected
     *  One Thread works : Others Suspended and then Resuming is very expensive : context switching slow
     * **/


    //No Thread safe
//
//    private volatile int counter;  //volatile :Proper reference : Thread


    private AtomicInteger counter = new AtomicInteger(0); //

    public int getCounter() {
        return counter.get();
    }
   //Used synchronized :-Only Thread ocan acces the method //imp
//    public synchronized  int increment(){
//        return counter++; //Atomic Operation  :-Reading the value,incrementing the value,Writing the value back
//    }

    public int increment(){
        return counter.getAndIncrement();
    }


    //Lost Update
    //Multiple Thread to write then inconsistent results we start getting


}
