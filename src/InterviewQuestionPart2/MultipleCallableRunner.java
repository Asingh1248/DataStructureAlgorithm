package InterviewQuestionPart2;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(3); //faster

        List<CallableTask> callableTaskList=List.of(new CallableTask("in28minutes")
                ,new CallableTask("Animesh"),
                new CallableTask("Abhishek"));


        //Get the result for

        List<Future<String>> results = executorService.invokeAll(callableTaskList);
        //Wait for all tha task to complete

        for(Future<String> result : results){
            System.out.println(result.get());
        }

        executorService.shutdown();
    }
}
