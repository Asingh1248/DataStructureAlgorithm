package InterviewQuestionPart2;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallableRunner {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3); //faster

        List<CallableTask> callableTaskList=List.of(new CallableTask("in28minutes")
                ,new CallableTask("Animesh"),
                new CallableTask("Abhishek"));


        //Get the result for

        String result = executorService.invokeAny(callableTaskList); //Fastest Solution
        //Wait for all tha task to complete

        System.out.println(result);


        executorService.shutdown();

    }
}
