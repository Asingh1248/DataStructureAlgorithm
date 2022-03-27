package InterviewQuestionPart2;


import java.util.concurrent.*;

class CallableTask implements Callable<String> {

    private String name;
    public CallableTask(String name){
        this.name=name;
    }

    @Override
    public String call() throws Exception {

        Thread.sleep(1000);  //Do wait of processing
        return " Hello " +name;
    }
}

//Call task which returns value
public class CallableRunner {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        //Its a Promise that there will be result
        Future<String> welcomeFuture=
             executorService.submit(new CallableTask("in28minutes"));
        //Executing parallel to main method

        String welcomeMessage = welcomeFuture.get(); //Waits for callable Task to get complete

        System.out.print(welcomeMessage);

        System.out.print("\n new CallableTask(\"in28minutes\") executed ");

        System.out.println("\n Main completed");

        executorService.shutdown();
    }
}
