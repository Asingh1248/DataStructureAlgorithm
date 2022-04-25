package InterviewQuestionPart2.Semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientTest {
    public static void main(String[] args) {
        ExecutorService executorService =null;
    //Ctrl +Alt +T
        try {
             executorService= Executors.newCachedThreadPool();

             for(int i=1;i<=300;i++){
                 executorService.submit(new Runnable() {
                     @Override
                     public void run() {
                        Connection.getConnection().connect();  // 300 Hundred Objet is created
                         //Now we only want 10 connection in pool. Only 10 object
                     }
                 });
             }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
           if(executorService!=null)
               executorService.shutdown();
        }



    }

}
