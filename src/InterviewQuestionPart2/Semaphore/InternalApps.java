package InterviewQuestionPart2.Semaphore;

import java.util.List;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class InternalApps {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newWorkStealingPool();
        ExecutorCompletionService ecs = new ExecutorCompletionService(executorService);


        List<Integer> ruleIDList = List.of(1,2,3,4,5);
        int count= ruleIDList.size();
       // ThrottleSemaphore  limiter = new ThrottleSemaphore(10);
        Semaphore semaphore = new Semaphore(10);

        try {
            for(Integer rule : ruleIDList){
                ecs.submit(()->{
                    try {
                        //limiter.acquire();

                        semaphore.acquire();
                        //Mapr DB we hit the call and get the count we only want at time 10 connection to be open and 10 query to fired parrelly
                        return "COMPLETE";
                    }catch (InterruptedException e){
                        Thread.currentThread().interrupt();
                    }
                    finally {
                        //limiter.release();
                        semaphore.release();
                    }

                    return "FAILED";
                });}  // For completed


            while(count>0){
                ecs.take().get();
                count--;

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }


    }
}
